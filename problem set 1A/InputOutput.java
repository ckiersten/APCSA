import java.util.Scanner;

public class InputOutput {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is your favourite course? ");
        String course = input.nextLine();
        
        System.out.print("What is your favourite show? ");
        String show = input.nextLine();
        
        System.out.print("How many hours do you spend studying each day? ");
        int studyTime = input.nextInt();
        
        System.out.print("How many hours do you spend watching shows each day? ");
        int watchTime = input.nextInt();
        
        System.out.println();
        System.out.println("Summary:");
        System.out.println("Your favourite course is " + course + ".");
        System.out.println("Your favourite show is " + show + ".");
        System.out.println("You spend " + studyTime + " hours studying each day.");
        System.out.println("You spend " + watchTime + " hours watching shows each day.");
        System.out.println("In total, you spend " + (studyTime+watchTime) + " hours studying and watching shows each day.");
        input.close();
    }
}