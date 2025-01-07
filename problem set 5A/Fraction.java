public class Fraction {

    private int numerator, denominator;

    public Fraction () {
        numerator = 1;
        denominator = 1;
    }

    public Fraction (int n, int d) {
        numerator = n;
        if (d == 0) {
            System.out.println("Error: denominator cannot be zero.");
            d = 1;
        } else {
            denominator = d;
        }
    }

    public Fraction (String str) {
        numerator = Integer.parseInt(str.substring(0, str.indexOf("/")));
        denominator = Integer.parseInt(str.substring(str.indexOf("/")));
    }

    public Fraction (Fraction f) {
        numerator = f.numerator;
        denominator = f.denominator;
    }
}
