package pr_4;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle extends GeometricObject{
    private double radius;

    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea() { return PI * pow(this.radius, 2); }

    @Override
    public double getPerimeter() { return 2 * PI * this.radius; }

    @Override
    public String toString() {
        return String.format("Круг: radius = %.2f; " +
                        "цвет = %s; закрашен = %b; площадь = %.2f; периметр = %.2f", radius, color, filled,
                getArea(), getPerimeter());
    }

    public void setRadius(double radius) { this.radius = radius; }
    public double getRadius() { return this.radius; }
}
