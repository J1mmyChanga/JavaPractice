package pr_4_1;

public class ComparableCircle extends Circle implements Comparable{
    public ComparableCircle() {
        super();
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }
}
