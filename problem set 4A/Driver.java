//Kiersten Chou, 10/18/24

import java.util.Scanner;

class Driver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //q1
        GuessTheNum myGuesser = new GuessTheNum();
        myGuesser.guessGreet();
        int guessedNum = input.nextInt();
        
        while (guessedNum != myGuesser.chosenNum) {
            myGuesser.guessing(guessedNum);
            guessedNum = input.nextInt();
        }
        System.out.println("You guessed it! It took you " +myGuesser.tries+ " tries");
        
        //q2a
        /*Grid myGrid = new Grid();
        myGrid.drawGrid();
        */
        
        //q2b
        
        //q2c
        /*Spiral mySpiral = new Spiral();
        mySpiral.drawSpiral();
        */
    }
}
