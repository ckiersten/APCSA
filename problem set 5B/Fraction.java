//Kiersten Chou, 1/10/25

public class Fraction {

    private int numerator, denominator;

    public Fraction() {
        int n = (int) (Math.random()*10);
        int d = (int) (Math.random()*10);
        while (n == 0 || d == 0) {
            n = (int) (Math.random()*10);
            d = (int) (Math.random()*10);
        }
        numerator = n;
        denominator = d;
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
        int gcf = greatestCommonFactor(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcf;
        denominator /= gcf;
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
    
    public static Fraction add(Fraction f1, Fraction f2) {
        if (f1.denominator == f2.denominator) {
            int n = f1.numerator + f2.numerator;
            return new Fraction(n, f1.denominator);
        } 
        int d = f1.denominator * f2.denominator;
        int n1 = f1.numerator * (d / f1.denominator);
        int n2 = f2.numerator * (d / f2.denominator);
        return new Fraction(n1 + n2, d);
    }
    
    public static Fraction subtract(Fraction f1, Fraction f2) {
        if (f1.denominator == f2.denominator) {
            int n = f1.numerator - f2.numerator;
            return new Fraction(n, f1.denominator);
        }
        int d = f1.denominator * f2.denominator;
        int n1 = f1.numerator * (d / f1.denominator);
        int n2 = f2.numerator * (d / f2.denominator);
        return new Fraction(n1 - n2, d);
    }
    
    public boolean compare(Fraction f) {
        if (f.numerator == this.numerator && f.denominator == this.denominator) return true;
        return false;
    }
}
