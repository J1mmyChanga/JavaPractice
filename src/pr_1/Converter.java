package pr_1;

import java.util.Scanner;

public class Converter{

    private static final double RUB_TO_YU = 11.91;

    public static void func() {
        Scanner in = new Scanner(System.in);
        int yuan = in.nextInt();
        if ((yuan % 100 >= 11) && (yuan % 100 <= 14)) {
            System.out.println("Вы ввели " + yuan + " юаней");
        } else if (yuan % 10 == 1) {
            System.out.println("Вы ввели " + yuan + " юань");
        } else if ((yuan % 10 >= 2) && (yuan % 10 <= 4)) {
            System.out.println("Вы ввели " + yuan + " юаня");
        } else {
            System.out.println("Вы ввели " + yuan + " юаней");
        }

        double result = yuan * RUB_TO_YU;
        System.out.println("Результат: " + result + " рублей");
    }
}