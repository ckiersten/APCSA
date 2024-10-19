class Curve {
    
    double x, y;
    
    public Curve() {
        StdDraw.setScale(0, 500);
        x = 500;
        y = 0;
    }
    
    public void drawCurve() {
        while (y < 500) {
            StdDraw.line(x, 0, 0, y);
            StdDraw.line(y, 500, 500, x);
            x -= 20;
            y += 20;
        }
    }
}
