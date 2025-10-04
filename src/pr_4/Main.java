package pr_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double s1, s2, s3, radius;
        String color;
        boolean filled;
        Scanner input = new Scanner(System.in);

        System.out.println("Введите три стороны треугольника, цвет и закрашен ли он:");
        s1 = input.nextDouble();
        s2 = input.nextDouble();
        s3 = input.nextDouble();
        color = input.next();
        filled = input.nextBoolean();

        //треугольники
        Triangle obj1 = new Triangle();
        System.out.println(obj);
        try {
            Triangle obj2 = new Triangle(s1, s2, s3, color, filled);
            System.out.println(obj2);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }

        //круги
        System.out.println("Введите радиус круга:");
        radius = input.nextDouble();
        Circle circ1 = new Circle();
        Circle circ2 = new Circle(radius, color, filled);
        System.out.println(circ1);
        System.out.println(circ2);
    }
}
