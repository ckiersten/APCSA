//Kiersten Chou, 9/23/24

class Cylinder {
    
    Circle base;    //use circles for base so we can use Circle methods
    double height;    //height of cylinder
    
    public Cylinder(double r, double h) {
        base = new Circle(r);
        height = h;
    }
    
    public Cylinder() {
        base = new Circle();
        height = 1;
    }
    
    public String toString() {
        return "Hello, I am a cylinder with a radius of " +base.getRadius()+ " and height of " +height;
    }
    
    public double getRadius() {
        return base.getRadius();
    }
    
    public double getHeight() {
        return height;
    }
    
    public double surfaceArea() {
        return (2*base.area()) + (base.circumference()*height);
    }
    
    public double volume() {
        return (base.area()*height);
    }
}
