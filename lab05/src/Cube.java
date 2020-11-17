public class Cube extends Square {
    double depth;
    Cube(double depth, double x, double y) {
        super(depth, x, y);
        this.depth = depth;
    }
    @Override
    public String toString() {
        return super.toString() + "; depth = " + depth ;
    }

    @Override
    public String getName() {
        return "Cube";
    }
    @Override
    public double area(){
        return super.area() * 6;
    }
    @Override
    public double volume(){
        return super.area() * depth;
    }
}
