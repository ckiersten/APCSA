//Kiersten Chou, 1/13/25

import java.util.Scanner;

class Driver {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //problem 1
        /*Fraction milu = new Fraction(355, 113);
        final double epsilon = Math.abs(Math.PI - milu.toDouble());

        Fraction guess = new Fraction(1, 2);
        while (Math.abs(Math.PI - guess.toDouble()) >= epsilon) {
        if (guess.toDouble() < Math.PI) {
        guess.setNum(guess.getNum()+1);
        } else {
        guess.setDenom(guess.getDenom()+1);
        }
        }
        System.out.println(guess.toString());
         */

        //problem 2
        String input = "";
        System.out.println("Let the Fraction Quiz begin. Answers should be in lowest terms. Good luck!");
        int score = 0;
        int round = 0;
        while (true) {
            Fraction f1 = new Fraction();
            Fraction f2 = new Fraction();
            Fraction answer = new Fraction();
            int operation = (int) (Math.random()*4);
            if (operation == 0) {
                System.out.print(f1.toString() +" + "+ f2.toString() + " = ");
                answer = Fraction.add(f1, f2);
                answer.reduce();
            } else if (operation == 1) {
                System.out.print(f1.toString() +" - "+ f2.toString() + " = ");
                answer = Fraction.subtract(f1, f2);
                answer.reduce();
            } else if (operation == 2) {
                System.out.print(f1.toString() +" * "+ f2.toString() + " = ");
                answer = Fraction.multiply(f1, f2);
                answer.reduce();
            } else {
                System.out.print(f1.toString() +" / "+ f2.toString() + " = ");
                answer = Fraction.divide(f1, f2);
                answer.reduce();
            }
            input = in.nextLine();
            if (input.toLowerCase().equals("quit")) break;
            if (!input.contains("/")) {
                System.out.println("Enter a valid fraction.");
                input = in.nextLine();
            }
            if (answer.compare(new Fraction(input))) {
                round++;
                score++;
                System.out.println("Correct!");
            } else {
                round++;
                System.out.println("Wrong, the answer was " +answer.toString());
            }
        }
        System.out.println("Your win/loss ratio was " +score+ "/" +round+ ", for a score of " +((double)score/round)*100+ " percent!");

    }
}