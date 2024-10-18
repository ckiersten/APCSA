class Spiral {

    double r;   //radius
    int c;  //colour

    public Spiral() {
        StdDraw.setScale(0, 500);
        r = 500;
        c = 1;
    }

    public void drawSpiral() {
        while (r > 0) {
            if (c > 0) {
                StdDraw.setPenColor(StdDraw.WHITE);
                c *= -1;
            } else {
                StdDraw.setPenColor(StdDraw.BLACK);
                c *= -1;
            }
            StdDraw.filledCircle (250, 250, r);
            r -= 20;
        }
    }
}