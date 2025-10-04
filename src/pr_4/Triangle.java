package pr_4;

import static java.lang.Math.sqrt;

public class Triangle extends  GeometricObject{
    private double side1, side2, side3;

    public Triangle() {
        super();
        this.side1 = 4.0;
        this.side2 = 2.0;
        this.side3 = 3.0;
        this.color = "black";
        this.filled = true;
    }

    public Triangle(double s1, double s2, double s3, String color, boolean filled) throws IllegalTriangleException {
        super(color, filled);
        if (s1 + s2 <= s3 || s1 + s3 <= s2 || s2 + s3 <= s1) {
            throw new IllegalTriangleException("Invalid triangle sides: sum of any two sides must be greater than the third side");
        }
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return sqrt(s*(s - side1)*(s - side2)*(s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return String.format("Треугольник: сторона1 = %.2f; сторона2 = %.2f; сторона3 = %.2f; " +
                "цвет = %s; закрашен = %b; площадь = %.2f; периметр = %.2f", side1, side2, side3, color, filled,
                getArea(), getPerimeter());
    }

    public void setSide1(double s1) { this.side1 = s1; }

    public void setSide2(double s2) { this.side2 = s2; }

    public void setSide3(double s3) { this.side3 = s3; }

    public double getSide1() { return this.side1; }

    public double getSide2() { return this.side2; }

    public double getSide3() { return this.side3; }
}
