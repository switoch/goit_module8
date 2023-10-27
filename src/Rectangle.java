public class Rectangle extends Shape{

    private final int height;
    private final int width;


    public Rectangle(int height, int width) {
        super("rectangle", 4);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getSquare() {
        return width * height;
    }
}
