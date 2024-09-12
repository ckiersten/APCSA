import java.util.Scanner;

public class Generators {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // //celsius to fahrenheit
        // System.out.println("*** Celsius --> Fahrenheit ***");
        // System.out.print("Enter a temperature in Celsius: ");

        // double c = input.nextDouble();
        // double f = c * (9.0/5.0) + 32;

        // System.out.println(c + "° Celsius = " + f + "° Fahrenheit");

        // //BMI calculator
        // System.out.println("*** BMI Calculator ***");
        // System.out.print("Enter a weight in kg: ");

        // double weight = input.nextDouble();

        // System.out.print("Enter a height in m: ");

        // double height = input.nextDouble();

        // double BMI = weight/(height*height);

        // System.out.print("A " + height + "m tall adult who weighs " 
        // + weight + "kg has a BMI of " + BMI);

        // //days to weeks and days
        // System.out.println("*** Days --> Weeks and Days ***");
        // System.out.print("Enter a number of days: ");

        // int totalDays = input.nextInt();
        // int weeks = totalDays/7;
        // int remainDays = totalDays%7;

        // System.out.print(totalDays + " days is equal to " + weeks + 
        // " weeks, " + remainDays + " days.");

        // //receipt generator
        // System.out.println("*** Receipt Generator ***");
        // System.out.print("Number of units you're buying: ");

        // int units = input.nextInt();

        // System.out.print("Price per unit: ");

        // double price = input.nextDouble();

        // System.out.print("Tax rate: ");

        // double tax = input.nextDouble();

        // double total = (units*price)*((tax/100)+1);

        // System.out.print("Purchasing " + units + " units at $" + price + " with " + tax + "% tax will cost $" + total);
         
        //sum of digits
        System.out.println("*** Sum of digits ***");
        System.out.print("Enter a positive, three-digit number: ");

        int number = input.nextInt();
        
        // int r = number%10;
        // int q = number/10;
        // System.out.println(r);
        // System.out.println(q);
        // r += (q%10);
        // q = q/10;
        // System.out.println(r);
        // System.out.println(q);
        // r += (q%10);
        // q = q/10;
        // System.out.println(r);
        // System.out.println(q);

        int r = 0;
        int q = number;
        while (q > 0) 
        {
            r += q%10;
            q = q/10;
        }
       
        System.out.print("The sum of the digits of " + number + " is " + r);
    }
}