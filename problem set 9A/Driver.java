//Kiersten Chou, 2/20/25

class Driver {
    
    public static void main(String[] args) {
        Shape myShape = new Shape("blue", true);
        System.out.println(myShape.calculatePerimeter());
        System.out.println(myShape.calculateArea());
        System.out.println(myShape);
        myShape.changeColour("red");
        myShape.changeFill(false);
        System.out.println(myShape);
    }
}