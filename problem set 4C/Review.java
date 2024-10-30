//Kiersten Chou, 10/30/24

import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

/**
 * Class that contains helper methods for the Review Lab
 **/
public class Review {

    private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
    private static ArrayList<String> posAdjectives = new ArrayList<String>();
    private static ArrayList<String> negAdjectives = new ArrayList<String>();

    private static final String SPACE = " ";
    static{
        try {
            Scanner input = new Scanner(new File("cleanSentiment.csv"));
            while(input.hasNextLine()){
                String[] temp = input.nextLine().split(",");
                sentiment.put(temp[0],Double.parseDouble(temp[1]));
                //System.out.println("added "+ temp[0]+", "+temp[1]);
            }
            input.close();
        }
        catch(Exception e){
            System.out.println("Error reading or parsing cleanSentiment.csv");
        }

        //read in the positive adjectives in postiveAdjectives.txt
        try {
            Scanner input = new Scanner(new File("positiveAdjectives.txt"));
            while(input.hasNextLine()){
                String temp = input.nextLine().trim();
                //System.out.println(temp);
                posAdjectives.add(temp);
            }
            input.close();
        }
        catch(Exception e){
            System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
        }   

        //read in the negative adjectives in negativeAdjectives.txt
        try {
            Scanner input = new Scanner(new File("negativeAdjectives.txt"));
            while(input.hasNextLine()){
                negAdjectives.add(input.nextLine().trim());
            }
            input.close();
        }
        catch(Exception e){
            System.out.println("Error reading or parsing negativeAdjectives.txt");
        }   
    }

    /** 
     * returns a string containing all of the text in fileName (including punctuation), 
     * with words separated by a single space 
     */
    public static String textToString( String fileName )
    {  
        String temp = "";
        try {
            Scanner input = new Scanner(new File(fileName));

            //add 'words' in the file to the string, separated by a single space
            while(input.hasNext()){
                temp = temp + input.next() + " ";
            }
            input.close();

        }
        catch(Exception e){
            System.out.println("Unable to locate " + fileName);
        }
        //make sure to remove any additional space that may have been added at the end of the string.
        return temp.trim();
    }

    /**
     * @returns the sentiment value of word as a number between -1 (very negative) to 1 (very positive sentiment) 
     */
    public static double sentimentVal( String word )
    {
        try
        {
            return sentiment.get(word.toLowerCase());
        }
        catch(Exception e)
        {
            return 0;
        }
    }

    /**
     * Returns the ending punctuation of a string, or the empty string if there is none 
     */
    public static String getPunctuation( String word )
    { 
        String punc = "";
        for(int i=word.length()-1; i >= 0; i--){
            if(!Character.isLetterOrDigit(word.charAt(i))){
                punc = punc + word.charAt(i);
            } else {
                return punc;
            }
        }
        return punc;
    }

    /**
     * Returns the word after removing any beginning or ending punctuation
     */
    public static String removePunctuation( String word )
    {
        while(word.length() > 0 && !Character.isAlphabetic(word.charAt(0)))
        {
            word = word.substring(1);
        }
        while(word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length()-1)))
        {
            word = word.substring(0, word.length()-1);
        }

        return word;
    }

    /** 
     * Randomly picks a positive adjective from the positiveAdjectives.txt file and returns it.
     */
    public static String randomPositiveAdj()
    {
        int index = (int)(Math.random() * posAdjectives.size());
        return posAdjectives.get(index);
    }

    /** 
     * Randomly picks a negative adjective from the negativeAdjectives.txt file and returns it.
     */
    public static String randomNegativeAdj()
    {
        int index = (int)(Math.random() * negAdjectives.size());
        return negAdjectives.get(index);

    }

    /** 
     * Randomly picks a positive or negative adjective and returns it.
     */
    public static String randomAdjective()
    {
        boolean positive = Math.random() < .5;
        if(positive){
            return randomPositiveAdj();
        } else {
            return randomNegativeAdj();
        }
    }

    public static double totalSentiment(String fileName) {
        String str = textToString(fileName);
        double total = 0;
        while (str.indexOf(" ") >= 0) {
            int spaceIndex = str.indexOf(" ");
            String word = str.substring(0, spaceIndex);
            word = removePunctuation(word);
            str = str.substring(spaceIndex+1);
            double val = sentimentVal(word);
            total += val;
        }
        //last word
        if (str.length() > 0) {
            str = removePunctuation(str);
            total += sentimentVal(str);
        }
        return total;
    }

    public static int starRating(String fileName) {
        double decimalRating = totalSentiment(fileName);
        if (decimalRating > 10) {
            return 4;
        } else if (decimalRating > 5) {
            return 3;
        } else if (decimalRating > 0) {
            return 2;
        } else if (decimalRating > -5) {
            return 1;
        } else {
            return 0;
        }
    }

    //direction skewing review determined by value of second parameter
    public static String fakeReview(String fileName, boolean m) {
        boolean morePos = m;
        double total = 0;
        String str = textToString(fileName);
        String response = "";
        String punc = "";
        while (str.indexOf(" ") >= 0) {
            int spaceIndex = str.indexOf(" ");
            String word = str.substring(0, spaceIndex);
            double val = sentimentVal(word);
            str = str.substring(spaceIndex+1);
            if (word.charAt(0) == '*') {
                word = word.substring(1);
                /*if (!Character.isAlphabetic(word.charAt(word.length()-1))) {
                punc = word.substring(word.length()-1, word.length());
                word = word.substring(0, word.length()-1);
                }
                 */
                punc = getPunctuation(word);
                if (punc.length() > 0) {
                    word = word.substring(0, word.length()-1);
                }
                //word = word.substring(0, word.length()-1);
                double og = sentimentVal(word);
                if (morePos) {
                    while (sentimentVal(word) <= og) {
                        word = randomPositiveAdj();
                    }
                } else {
                    while (sentimentVal(word) >= og) {
                        word = randomNegativeAdj();
                    }
                }
                val = sentimentVal(word);
                word += punc;
            }
            response = response + word + " ";
            total += val;
        }
        //last word
        if (str.length() > 0) {
            double val = sentimentVal(str);
            /*if (!Character.isAlphabetic(str.charAt(str.length()-1))) {
                punc = str.substring(str.length()-1, str.length());
                str = str.substring(0, str.length()-1);
            }
            */
            punc = getPunctuation(str);
            if (punc.length() > 0) {
                    str = str.substring(0, str.length()-1);
                }
            //str = str.substring(0, str.length()-1);
            if (str.charAt(0) == '*') {
                str = str.substring(1);
                double og = sentimentVal(str);
                if (morePos) {
                    while (sentimentVal(str) <= og) {
                        str = randomPositiveAdj();
                    }
                } else {
                    while (sentimentVal(str) >= og) {
                        str = randomNegativeAdj();
                    }
                }
                val = sentimentVal(str);
                str += punc;
            }
            response += str;
            total += val;
        }
        System.out.println(total);
        return response;
    }
}