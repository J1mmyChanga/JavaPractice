package pr_4_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double s1, s2, s3, radius;
        String color;
        boolean filled;
        Scanner input = new Scanner(System.in);

//        System.out.println("Введите три стороны треугольника, цвет и закрашен ли он:");
//        s1 = input.nextDouble();
//        s2 = input.nextDouble();
//        s3 = input.nextDouble();
//        color = input.next();
//        filled = input.nextBoolean();
//
//        //треугольники
//        Triangle obj1 = new Triangle();
//        System.out.println(obj1);
//        try {
//            Triangle obj2 = new Triangle(s1, s2, s3, color, filled);
//            System.out.println(obj2);
//        } catch (IllegalTriangleException e) {
//            System.out.println(e.getMessage());
//        }
//
//        //круги
//        System.out.println("Введите радиус круга:");
//        radius = input.nextDouble();
//        Circle circ1 = new Circle();
//        Circle circ2 = new Circle(radius, color, filled);
//        System.out.println(circ1);
//        System.out.println(circ2);
//
//        //прямоугольники
//        System.out.println("Введите две стороны прямоугольника");
//        s1 = input.nextDouble();
//        s2 = input.nextDouble();
//        Rectangle rect1 = new Rectangle();
//        Rectangle rect2 = new Rectangle(s1, s2, color, filled);
//        System.out.println(rect1);
//        System.out.println(rect2);
//
//        //сравнение
//        ComparableCircle comcirc1 = new ComparableCircle(4.0, color, filled);
//        ComparableCircle comcirc2 = new ComparableCircle(5.0, color, filled);
//        System.out.println("Фигура с характеристиками больше: " + comcirc1.compareTo(comcirc2));
//
//        Rectangle rect = new Rectangle(s1, s2, color, filled);
//        Circle circ = new ComparableCircle(radius, color, filled);
//        System.out.println("Фигура с характеристиками больше: " + rect.compareTo(circ));
        try {
            GeometricObject[] figures = {new Triangle(4, 3, 4, "black", true),
                    new Triangle(45, 23, 37, "yellow", false),
                    new Circle(31, "white", true),
                    new Rectangle(243, 2, "green", false),
                    new Square(55, "red", true)};
                    for (int i = 0; i < figures.length; i++) {
                        figures[i].howToColor();
                    }
        } catch (IllegalTriangleException e) {
            System.out.println("В следующий раз, бро :(((");
        }
    }
}
