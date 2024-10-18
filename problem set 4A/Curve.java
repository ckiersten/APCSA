class Curve {
    
    double x, y;
    
    public Curve() {
        StdDraw.setScale(0, 500);
        x = y = 0;
    }
    
    public void drawCurve() {
        while (y < 500) {
            while (x < 500) {
                StdDraw.line (x, 0, x, 500);
                x += 20;
            }
            StdDraw.line(0, y, 500, y);
            y += 20;
        }
    }
}