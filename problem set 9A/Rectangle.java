//Kiersten Chou, 2/20/25

class Rectangle extends Shape {
    
    private double length, width;
    
    public Rectangle(String c, boolean f, double l, double w) {
        super(c, f);
        length = l;
        width = w;
    }
    
    public double getLength() {
        return length;
    }
    
    public void changeLength(double l) {
        length = l;
    }
    
    
}