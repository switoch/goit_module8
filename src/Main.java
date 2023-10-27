public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(10);
        System.out.println(circle.getSquare());
        System.out.println(triangle.getSquare());
        PrintShape.printShape(circle);
        PrintShape.printShape(triangle);
    }
}