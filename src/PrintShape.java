public interface PrintShape {

    public static void printShape(Shape shape){
        System.out.println("This is " + shape.getName()+ ", it has " + shape.getAngleCount() + " angles.");
    }
}
