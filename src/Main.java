public class Main {
    public static void main(String[] args) {
        Car car = new Car("Deo Matiz", "2281337", "purple", 2012);
        car.getInfo();
        System.out.println(car.getAutoYear());
        car.setColor("black and yellow");
        car.setYear(1992);
        car.getInfo();
        System.out.println(car.getAutoYear());

        long num = 2389;
        double numb = 12313;
        System.out.println(num * numb);
    }
}
