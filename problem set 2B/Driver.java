//Kiersten Chou, 9/26/24

import java.util.Scanner;

class Driver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringTools sTools = new StringTools();

        //test lastLetter
        /*System.out.println("lastLetter test cases:");
        System.out.println("Enter a word with at least one character: ");
        String answer1 = input.nextLine();
        System.out.println("The last letter is " + sTools.lastLetter(answer1));
        System.out.println("---------------------");
         */

        //test formatPhoneNumber
        /*System.out.println("formatPhoneNumber test cases:");
        System.out.println("Enter a 10 digit phone number: ");
        String answer2 = input.nextLine();
        System.out.println("The formatted phone number is " + sTools.formatPhoneNumber(answer2));
        System.out.println("---------------------");
         */

        //test middleThree
        /*System.out.println("middleThree test cases:");
        System.out.println("Enter a word with at least three characters with an odd length: ");
        String answer3 = input.nextLine();
        System.out.println("The middle three letters are " + sTools.middleThree(answer3));
        System.out.println("---------------------");
         */

        //test swapLastTwo
        /*System.out.println("swapLastTwo test cases:");
        System.out.println("Enter a word with at least two characters: ");
        String answer4 = input.nextLine();
        System.out.println("The new string is " + sTools.swapLastTwo(answer4));
        System.out.println("---------------------");
         */

        //test frontAgain
        System.out.println("frontAgain test cases:");
        System.out.println("Enter a word: ");
        String answer5 = input.nextLine();
        System.out.println("The start matches the end: " + sTools.frontAgain(answer5, 1));
        System.out.println("---------------------");
    }
}