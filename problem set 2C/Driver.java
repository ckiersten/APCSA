//Kiersten Chou, 9/26/24

import java.util.Scanner;

class Driver {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OrderedPair myPair = new OrderedPair(1, 5);
        Formulas myFormulas = new Formulas();
        
        //test OrderedPair
        // System.out.println(myPair);
        // System.out.println(myPair.getX());
        // System.out.println(myPair.getY());
        
       
       //test findQuadraticRoots
    //    System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b, and c: ");
    //    System.out.print("a: ");
    //    int a = input.nextInt();
    //    System.out.print("b: ");
    //    int b = input.nextInt();
    //    System.out.print("c: ");
    //    int c = input.nextInt();
    //    myPair = myFormulas.findQuadraticRoots(a, b, c);
    //    System.out.println("The solutions for " +a+ "x^2 + " +b+ "x + " +c+ " are "
    //    +myPair);

       //test findSlope
       System.out.println("SLOPE FORMULA: Find the slope between points (x1, y1) and (x2, y2)");
       System.out.print("x1: ");
       int x1 = input.nextInt();
       System.out.print("y1: ");
       int y1 = input.nextInt();
       System.out.print("x2: ");
       int x2 = input.nextInt();
       System.out.print("y2: ");
       int y2 = input.nextInt();
       OrderedPair firstPoint = new OrderedPair(x1, y1);
       OrderedPair secondPoint = new OrderedPair(x2, y2);
       double result = myFormulas.findSlope(firstPoint, secondPoint);
       System.out.println("The line between " +firstPoint+ " and " +secondPoint+ " has a slope of " +result);
    }
}