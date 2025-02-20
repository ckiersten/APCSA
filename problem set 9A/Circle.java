//Kiersten Chou, 2/20/25

public class Circle extends Shape {
    
    double radius;
    
    public Circle(String c, boolean f, double r) {
        super(c, f);
        radius = r;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void changeRadius(double r) {
        radius = r;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}