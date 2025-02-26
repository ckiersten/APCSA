//Kiersten Chou, 2/25/25

class Driver {
    
    public static void main(String[] args) {
        //Shape
        Shape myShape = new Shape("blue", true);
        System.out.println(myShape.calculatePerimeter());
        System.out.println(myShape.calculateArea());
        System.out.println(myShape);
        myShape.changeColour("red");
        myShape.changeFill(false);
        System.out.println(myShape);
        //Circle
        Circle myCircle = new Circle("blue", true, 2);
        System.out.println(myCircle.calculatePerimeter());
        System.out.println(myCircle.calculateArea());
        System.out.println(myCircle);
        myCircle.changeColour("red");
        myCircle.changeFill(false);
        System.out.println(myCircle);
        //Rectangle
        Rectangle myRectangle = new Rectangle("green", false, 2, 4);
        System.out.println(myRectangle.calculatePerimeter());
        System.out.println(myRectangle.calculateArea());
        System.out.println(myRectangle);
        myRectangle.changeColour("pink");
        myRectangle.changeFill(true);
        System.out.println(myRectangle);
        //Triangle
        Triangle myTriangle = new Triangle("yellow", false, 2, 4, 3);
        System.out.println(myTriangle.calculatePerimeter());
        System.out.println(myTriangle.calculateArea());
        System.out.println(myTriangle);
        myTriangle.changeColour("orange");
        myTriangle.changeFill(true);
        System.out.println(myTriangle);
        //Shape array
        Shape[] arr = {myShape, myCircle, myRectangle, myTriangle};
        System.out.println();
        for (Shape s : arr) {
            System.out.println(s.calculatePerimeter());
            System.out.println(s.calculateArea());
        }
    }
}