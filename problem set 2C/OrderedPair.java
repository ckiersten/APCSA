//Kiersten Chou, 9/26/24

class OrderedPair {
    
    double X, Y;
    
    public OrderedPair() {
        X = 0;
        Y = 0;
    }
    
    public OrderedPair(double _x, double _y) {
        X = _x;
        Y = _y;
    }
    
    public String toString() {
        return "(" +X+ ", " +Y+ ")";
    }
    
    public double getX() {
        return X;
    }
    
    public double getY() {
        return Y;
    }
}