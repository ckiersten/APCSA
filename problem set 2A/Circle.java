//Kiersten Chou, 9/23/24

class Circle {
    
    double radius;    //radius of circle
    
    public Circle(double r) {
        radius = r;
    }
    
    public Circle() {
        radius = 1;
    }
    
    public String toString() {
        return "Hello, I am a circle with a radius of " + radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public double circumference() {
        return 2*Math.PI*radius;
    }
    
    public double area() {
        return Math.PI*radius*radius;
    }
}
