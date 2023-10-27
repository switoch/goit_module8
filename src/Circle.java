public class Circle extends Shape{

    private int radius;

    public Circle(int radius){
        super("circle", 0);
        this.radius = radius;
    }

    @Override
    public int getAngleCount(){
        return 0;
    }

    @Override
    public double getSquare() {
        return Math.pow(radius, 2)*Math.PI;
    }
}
