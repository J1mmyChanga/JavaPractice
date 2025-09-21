package pr_1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.getInfo();
        System.out.println(car.getAutoYear());
        car.setColor("black and yellow");
        car.setYear(1992);
        car.getInfo();
        System.out.println(car.getAutoYear());

        Converter conv = new Converter();
        conv.func();
    }
}
