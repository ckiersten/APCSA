//Kiersten Chou, 1/9/25

class Driver {

    public static void main(String[] args) {
        Fraction f1 = new Fraction(-5,6);
        Fraction f2 = new Fraction(1, 3);
        /*System.out.println(f1.getNum());
        System.out.println(f1.getDenom());
        System.out.println(f1.toString());
        System.out.println(f1.toDouble());
        f1.reduce();
        System.out.println(f1.toString());
        */
        System.out.println(Fraction.subtract(f1, f2));
    }
}