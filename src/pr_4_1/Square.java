package pr_4_1;

public class Square extends GeometricObject {
    private double side;

    public Square() {
        super();
        this.side = 0.0;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public GeometricObject compareTo(GeometricObject ob) {
        return max(this, ob);
    }

    @Override
    public void howToColor() {
        if (filled) {
            System.out.println("Раскрасьте все четыре стороны");
        } else {
            System.out.println("Нельзя раскрасить(");
        }
    }

    public void setSide(double side) { this.side = side; }

    public double getSide() { return this.side; }
}
