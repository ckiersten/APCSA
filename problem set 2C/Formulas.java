//Kiersten Chou, 9/26/24

class Formulas {
    
    public Formulas() {
        
    }
    
    public OrderedPair findQuadraticRoots(double a, double b, double c) {
        double squareRoot = Math.sqrt(Math.pow(b, 2) - (4*a*c));
        double firstRoot = (b + squareRoot) / (2*a);
        double secondRoot = (b - squareRoot) / (2*a);
        OrderedPair roots = new OrderedPair(firstRoot, secondRoot);
        return roots;
    }
    
    public double findSlope(OrderedPair A, OrderedPair B) {
        double rise = B.getY() - A.getY();
        double run = B.getX() - A.getX();
        return rise/run;
    }
    
    // public OrderedPair findMidpoint(OrderedPair A, OrderedPair B) {
        
    // }
    
    // public double findArithmeticSeriesSum(double a, double d, int k) {
        
    // }
    
    // public double findGeometricSeriesSum(double a, double r, int k) {
        
    // }
    
    // public int rollDie (int sides) {
        
    // }
}