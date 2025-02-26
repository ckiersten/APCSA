//Kiersten Chou, 2/25/25

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

    public double getWidth() {
        return width;
    }

    public void changeWidth(double w) {
        width = w;
    }

    @Override
    public double calculateArea() {
        return width*length;
    }

    @Override
    public double calculatePerimeter() {
        return 2*width + 2*length;
    }  
}