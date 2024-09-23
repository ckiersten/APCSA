class Driver {
    
    public static void main(String[] args) {
        
        Circle myCircle;
        Cylinder myCylinder;
        
        myCircle = new Circle(2);
        myCylinder = new Cylinder(1, 5);
        
        //test circle
        System.out.println(myCircle.toString());
        System.out.println("getRadius() --> " +myCircle.getRadius()+ " units");
        System.out.println("circumference() --> " +myCircle.circumference()+ " units");
        System.out.println("area() --> " +myCircle.area()+ " units^2");
        
        //test cylinder
        System.out.println("");
        System.out.println(myCylinder.toString());
        System.out.println("getRadius() --> " +myCylinder.getRadius()+ " units");
        System.out.println("getHeight() --> " +myCylinder.getHeight()+ " units");
        System.out.println("surfaceArea() --> " +myCylinder.surfaceArea()+ " units^2");
        System.out.println("volume() --> " +myCylinder.volume()+ " units^3");
    }
}