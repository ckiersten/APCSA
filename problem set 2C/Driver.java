//Kiersten Chou, 9/26/24

import java.util.Scanner;

class Driver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //OrderedPair myPair = new OrderedPair(1, 5);
        //Formulas myFormulas = new Formulas();

        //test OrderedPair
        // System.out.println(myPair);
        // System.out.println(myPair.getX());
        // System.out.println(myPair.getY());

        //test findQuadraticRoots
        System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b, and c: ");
        System.out.print("a: ");
        int a = input.nextInt();
        System.out.print("b: ");
        int b = input.nextInt();
        System.out.print("c: ");
        int c = input.nextInt();
        //  //myPair = myFormulas.findQuadraticRoots(a, b, c);
        System.out.println("The solutions for " +a+ "x^2 + " +b+ "x + " +c+ " are "
            +Formulas.findQuadraticRoots(a, b, c));

        //test findSlope
        System.out.println("");
        System.out.println("SLOPE FORMULA: Find the slope between points (x1, y1) and (x2, y2)");
        System.out.print("x1: ");
        int findSlopeX1 = input.nextInt();
        System.out.print("y1: ");
        int findSlopeY1 = input.nextInt();
        System.out.print("x2: ");
        int findSlopeX2 = input.nextInt();
        System.out.print("y2: ");
        int findSlopeY2 = input.nextInt();
        OrderedPair findSlopeFirstPoint = new OrderedPair(findSlopeX1, findSlopeY1);
        OrderedPair findSlopeSecondPoint = new OrderedPair(findSlopeX2, findSlopeY2);
        //double result = myFormulas.findSlope(firstPoint, secondPoint);
        System.out.println("The line between " +findSlopeFirstPoint+ " and " +findSlopeSecondPoint+ " has a slope of " 
            +Formulas.findSlope(findSlopeFirstPoint, findSlopeSecondPoint));

        //test findMidpoint
        System.out.println("");
        System.out.println("MIDPOINT FORMULA: Find the midpoint between (x1, y1) and (x2, y2)");
        System.out.print("x1: ");
        int findMidpointX1 = input.nextInt();
        System.out.print("y1: ");
        int findMidpointY1 = input.nextInt();
        System.out.print("x2: ");
        int findMidpointX2 = input.nextInt();
        System.out.print("y2: ");
        int findMidpointY2 = input.nextInt();
        OrderedPair findMidpointFirstPoint = new OrderedPair(findMidpointX1, findMidpointY1);
        OrderedPair findMidpointSecondPoint = new OrderedPair(findMidpointX2, findMidpointY2);
        //OrderedPair result = myFormulas.findMidpoint(firstPoint, secondPoint);
        System.out.println("The midpoint between " +findMidpointFirstPoint+ " and " +findMidpointSecondPoint+ " is " 
            +Formulas.findMidpoint(findMidpointFirstPoint, findMidpointSecondPoint));

        //test findArithmeticSeriesSum
        System.out.println("");
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.print("Number of terms: ");
        int arithmeticNumOfTerms = input.nextInt();
        System.out.print("Starts with: ");
        double arithmeticStart = input.nextDouble();
        System.out.print("Increases by: ");
        double arithmeticIncrease = input.nextDouble();
        System.out.println("The sum of the first " +arithmeticNumOfTerms+ " terms of an arithmetic series that starts with " 
            +arithmeticStart+ " and increases by " +arithmeticIncrease+ " is " 
            +Formulas.findArithmeticSeriesSum(arithmeticStart, arithmeticIncrease, arithmeticNumOfTerms));

        //test findGeometricSeriesSum
        System.out.println("");
        System.out.println("SUM OF A GEOMETRIC SERIES");
        System.out.print("Number of terms: ");
        int geometricNumOfTerms = input.nextInt();
        System.out.print("Starts with: ");
        double geometricStart = input.nextDouble();
        System.out.print("Rate of growth: ");
        double geometricGrowth = input.nextDouble();
        System.out.println("The sum of the first " +geometricNumOfTerms+ " terms of a finite geometric series that starts with " 
            +geometricStart+ " and increases by a rate of " +geometricGrowth+ " is " 
            +Formulas.findGeometricSeriesSum(geometricStart, geometricGrowth, geometricNumOfTerms));

        //test rollDie
        System.out.println("");
        System.out.println("DIE ROLLER");
        System.out.print("How many sides does your die have? ");
        int sides = input.nextInt();
        System.out.print("Rolling a " +sides+ "-sided die... you got a " +Formulas.rollDie(sides)+ "!");
    }
}