//Kiersten Chou, 9/26/24

import java.util.Scanner;

class Driver {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OrderedPair myPair = new OrderedPair(1, 5);
        Formulas myFormulas = new Formulas();
        
        //test OrderedPair
        System.out.println(myPair);
        System.out.println(myPair.getX());
        System.out.println(myPair.getY());
        
       
       //test findQuadraticRoots
       System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b, and c: ");
       System.out.print("a: ");
       int a = input.nextInt();
       System.out.print("b: ");
       int b = input.nextInt();
       System.out.print("c: ");
       int c = input.nextInt();
       myPair = myFormulas.findQuadraticRoots(a, b, c);
       System.out.println("The solutions for " +a+ "x^2 + " +b+ "x + " +c+ " are " +myPair);
    }
}