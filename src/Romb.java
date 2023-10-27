public class Romb extends Shape{

    private final int side;
    private final int height;

    public Romb(int side, int height) {
        super("romb", 4);
        this.side = side;
        this.height = height;
    }

    @Override
    public double getSquare() {
        return side*height;
    }
}
