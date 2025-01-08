//Kiersten Chou, 1/8/25

public class Fraction {

    private int numerator, denominator;

    public Fraction() {
        numerator = 1;
        denominator = 1;
    }

    public Fraction(int n, int d) {
        numerator = n;
        setDenom(d);
    }

    public Fraction(String str) {
        numerator = Integer.parseInt(str.substring(0, str.indexOf("/")));
        if (Integer.parseInt(str.substring(str.indexOf("/")+1)) == 0) {
            System.out.println("Error: denominator cannot be zero.");
            denominator = 1;
        } else {
            denominator = Integer.parseInt(str.substring(str.indexOf("/")+1));
        }
    }

    public Fraction(Fraction f) {
        numerator = f.numerator;
        denominator = f.denominator;
    }

    public int getNum() {
        return numerator;
    }

    public int getDenom() {
        return denominator;
    }

    public String toString() {
        return numerator +"/"+ denominator;
    }

    public double toDouble() {
        return (double) numerator / denominator;
    }

    private int greatestCommonFactor(int n1, int n2) {
        if (n1 == n2) return n1;
        int larger = Math.max(n1, n2);
        int smaller = Math.min(n1, n2);
        return greatestCommonFactor((larger - smaller), smaller);
    }

    public void reduce() {
        int gcf = greatestCommonFactor(numerator, denominator);
        numerator = numerator / gcf;
        denominator = denominator / gcf;
    }
    
    public void setNum(int n) {
        numerator = n;
    }
    
    public void setDenom(int d) {
        if (d == 0) {
            System.out.println("Error: denominator cannot be zero.");
            d = 1;
        } else {
            denominator = d;
        }
    }
    
    public static Fraction multiply(Fraction f1, Fraction f2) {
        int n = f1.numerator * f2.numerator;
        int d = f1.denominator * f2.denominator;
        return new Fraction(n, d);
    }
    
    public static Fraction divide(Fraction f1, Fraction f2) {
        int n = f1.numerator * f2.denominator;
        int d =  f1.denominator * f2.numerator;
        return new Fraction(n, d);
    }
}
