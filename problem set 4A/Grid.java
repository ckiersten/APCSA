//Kiersten Chou, 10/21/24

class Grid {
    
    double x, y;
    
    public Grid() {
        StdDraw.setScale(0, 500);
        x = y = 0;
    }
    
    public void drawGrid() {
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