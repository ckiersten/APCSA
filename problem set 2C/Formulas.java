//Kiersten Chou, 9/26/24

class Formulas {

    public static OrderedPair findQuadraticRoots(double a, double b, double c) {
        double squareRoot = Math.sqrt(Math.pow(b, 2) - (4*a*c));
        double firstRoot = (-b + squareRoot) / (2*a);
        double secondRoot = (-b - squareRoot) / (2*a);
        return new OrderedPair(firstRoot, secondRoot);
    }

    public static double findSlope(OrderedPair A, OrderedPair B) {
        double rise = B.y - A.y;
        double run = B.x - A.x;
        return rise/run;
    }

    public static OrderedPair findMidpoint(OrderedPair A, OrderedPair B) {
        double mX = (A.x + B.x)/2;
        double mY = (A.y + B.y)/2;
        return new OrderedPair(mX, mY);
    }

    public static double findArithmeticSeriesSum(double a, double d, int k) {
        double sum = ((2*a) + ((k-1)*d)) * k/2;
        return sum;
    }

    public static double findGeometricSeriesSum(double a, double r, int k) {
        double numerator = 1-(Math.pow(r, k));
        double denominator = 1-r;
        double sum = a*(numerator/denominator);
        return sum;
    }

    public static int rollDie (int sides) {
        int roll = (int) (Math.random()*sides) + 1;
        return roll;
    }
}
