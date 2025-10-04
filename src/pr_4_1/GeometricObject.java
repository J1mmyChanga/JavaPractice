package pr_4_1;

public abstract class GeometricObject implements Comparable, Colorable {
    protected String color;
    protected boolean filled;

    public GeometricObject() {
        this.color = "black";
        this.filled = false;
    };

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public static GeometricObject max(GeometricObject ob1, GeometricObject ob2) {
        if (ob1.getArea() >= ob2.getArea()) {
            return ob1;
        } else {
            return ob2;
        }
    }

    public void setColor(String color) { this.color = color; }

    public void setFilled(boolean filled) { this.filled = filled; }

    public String getColor() { return this.color; }

    public boolean getFilled() { return this.filled; }
}
