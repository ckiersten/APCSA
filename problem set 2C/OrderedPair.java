//Kiersten Chou, 9/26/24

class OrderedPair {
    
    double x, y;
    
    public OrderedPair() {
        x = 0;
        y = 0;
    }
    
    public OrderedPair(double _x, double _y) {
        x = _x;
        y = _y;
    }
    
    public String toString() {
        return "(" +x+ ", " +y+ ")";
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
}
