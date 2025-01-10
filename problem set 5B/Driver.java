//Kiersten Chou, 1/10/25

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
        while (!input.toLowerCase().equals("quit")) {
            Fraction f1 = new Fraction();
            Fraction f2 = new Fraction();
            Fraction answer = new Fraction();
            int operation = (int) (Math.random()*4);
            if (operation == 0) {
                System.out.print(f1.toString() +" + "+ f2.toString() + " = ");
                
            } else if (operation == 1) {
                System.out.print(f1.toString() +" - "+ f2.toString() + " = ");
            } else if (operation == 2) {
                System.out.print(f1.toString() +" * "+ f2.toString() + " = ");
            } else {
                System.out.print(f1.toString() +" / "+ f2.toString() + " = ");
            }
            input = in.nextLine();
            
        }
    }
}