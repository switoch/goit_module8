public abstract class Shape {

    private int angle;
    private String name;

    public Shape(String name, int angle) {
        this.angle = angle;
        this.name = name;
    }

    public String getName(){
        return this.name;
    };

    public int getAngleCount(){
        return this.angle;
    };

    public abstract double getSquare();
}
