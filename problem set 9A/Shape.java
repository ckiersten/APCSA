//Kiersten Chou, 2/20/25

public class Shape {
    
    private String colour;
    private boolean filled;
    
    public Shape(String c, boolean b) {
        colour = c;
        filled = b;
    }
    
    public double calculatePerimeter() {
        return 0;
    }
    
    public double calculateArea() {
        return 0;
    }
    
    public String toString() {
        return colour + ", " + filled;
    }
    
    public String getColour() {
        return colour;
    }
    
    public void changeColour(String c) {
        colour = c;
    }
    
    public boolean getFill() {
        return filled;
    }
    
    public void changeFill(boolean f) {
        filled = f;
    }
    
}