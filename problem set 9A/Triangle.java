//Kiersten Chou, 2/25/25

class Triangle extends Shape {
    
    private double side1, side2, side3;
    
    public Triangle(String c, boolean f, double s1, double s2, double s3) {
        super(c, f);
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }
    
    public double getSide1() {
        return side1;
    }

    public void changeSide1(double s) {
        side1 = s;
    }

    public double getSide2() {
        return side2;
    }

    public void changeSide2(double s) {
        side1 = s;
    }

    public double getSide3() {
        return side3;
    }

    public void changeSide3(double s) {
        side1 = s;
    }

    @Override
    public double calculateArea() {
        double s = calculatePerimeter()/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }  
}