public class Quad extends Shape{

    private int side;

    public Quad(int side) {
        super("quadrat", 4);
        this.side = side;
    }

    @Override
    public double getSquare() {
        return Math.pow(this.side,2);
    }
}
