//Kiersten Chou, 10/21/24

class SierpinskiTriangle {

    OrderedPair topLeft, topRight, bottom;

    public SierpinskiTriangle() {
        StdDraw.setScale(0, 1);
        topLeft = new OrderedPair(0, 1);
        topRight = new OrderedPair(1, 1);
        bottom = new OrderedPair(0.5, 0);
        StdDraw.point(topLeft.x, topLeft.y);
        StdDraw.point(topRight.x, topRight.y);
        StdDraw.point(bottom.x, bottom.y);

    }

    public void drawTriangle() {
        double startX = (bottom.x - topLeft.x)/2;
        double startY = (topLeft.y - bottom.y)/2;
        OrderedPair current = new OrderedPair(startX, startY);
        int i = 0;
        while (i < 500) {
            int selectVertex = (int) (Math.random()*3 + 1);
            if (selectVertex == 1) {
                double midX = (current.x - topLeft.x)/2;
                double midY = (current.y - topLeft.y)/2 + 1;
                OrderedPair midPoint = new OrderedPair(midX, midY);
                StdDraw.point(midPoint.x, midPoint.y);
                current = midPoint;
            } else if (selectVertex == 2) {
                double midX = (current.x - topRight.x)/2 + 1;
                double midY = (current.y - topRight.y)/2 + 1;
                OrderedPair midPoint = new OrderedPair(midX, midY);
                StdDraw.point(midPoint.x, midPoint.y);
                current = midPoint;
            } else if (selectVertex == 3) {
                double midX, midY;
                if (current.x < bottom.x) {
                    midX = (bottom.x - current.x)/2;
                } else {
                    midX = (bottom.x - current.x)/2 + 1;
                }
                midY = (current.y - bottom.y)/2;
                OrderedPair midPoint = new OrderedPair(midX, midY);
                StdDraw.point(midPoint.x, midPoint.y);
                current = midPoint;
            }
            //i++;
        }
    }
}