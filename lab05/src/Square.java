public class Square extends  Point {
    double side;
    Square(double side, double x, double y) {
        super(x, y);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Corner = " + super.toString() +"; side = " + side ;
    }

    @Override
    public String getName() {
        return "Square";
    }
    @Override
    public double area(){
        return this.side * this.side;
    }

}
