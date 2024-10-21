//Kiersten Chou, 10/21/24

class Curve {
    
    public Curve() {
        StdDraw.setScale(0, 500);
    }
    
    public void drawCurve() {
      for (int i = 0; i < 500; i += 20) {
          StdDraw.line(i, 0, 500, i);
          StdDraw.line(0, i, i, 500);
      }
    }
}