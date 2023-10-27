public class Triangle extends Shape{

    private final int side;


    public Triangle(int side) {
        super("triangle", 3);
        this.side = side;
    }

    @Override
    public double getSquare() {
        return (Math.sqrt(3)/4)*Math.pow(side, 2);
    }
}
