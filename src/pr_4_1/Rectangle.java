package pr_4_1;

public class Rectangle extends GeometricObject {
    private double side1, side2;

    public Rectangle() {
        super();
        this.side1 = 2.0;
        this.side2 = 2.0;
    }

    public Rectangle(double side1, double side2, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() { return side1 * side2; }

    @Override
    public double getPerimeter() {
        return side1 * 2 + side2 * 2;
    }

    @Override
    public GeometricObject compareTo(GeometricObject ob) {
        return max(this, ob);
    };

    @Override
    public String toString() {
        return String.format("Прямоугольник: сторона1 = %.2f; сторона2 = %.2f; " +
                        "цвет = %s; закрашен = %b; площадь = %.2f; периметр = %.2f", side1, side2, color, filled,
                getArea(), getPerimeter());
    }

    @Override
    public void howToColor() {
        if (filled) {
            System.out.println("Раскрасьте все четыре стороны");
        } else {
            System.out.println("Нельзя раскрасить(");
        }
    }

    public void setSide1(double s1) { this.side1 = s1; }

    public void setSide2(double s2) { this.side2 = s2; }

    public double getSide1() { return this.side1; }

    public double getSide2() { return this.side2; }
}
