package pr_4_2;

import java.util.Scanner;

public class Main {
    public static boolean ifYearIsLeap(int year) {
        return (year % 4 == 0 ? true : false);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, year;
        System.out.println("Введите номер месяца: ");
        num = input.nextInt();
        String[] months = {"январь", "февраль", "март", "апрель", "май",
                "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        try {
            if (num < 1 || num > 12) {
                throw new ArrayIndexOutOfBoundsException("бро ты кринжанул");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
            System.exit(-1);
        }
        if (num == 2) {
            System.out.println("Введите номер года: ");
            year = input.nextInt();
            if (ifYearIsLeap(year)) {
                dom[num - 1] += 1;
            }
        }
        System.out.println(String.format("Месяц: %s; дней в месяце: %d", months[num - 1], dom[num - 1]));
    }
}
