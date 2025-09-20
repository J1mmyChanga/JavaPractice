import java.util.Scanner;

public class Car {
    private String model;
    private String license;
    private String color;
    private int year;
    private static final int CUR_YEAR = 2025;

    public Car() {
        this.model = "Oka";
        this.license = "ne nuzhna";
        this.color = "oliva";
        this.year = 1991;
    }

    public Car(String model, String license) {
        this.model = model;
        this.license = license;
        this.color = "Green";
        this.year = 1703;
    }

    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    public void getInfo() {
        System.out.println("Модель: " + model);
        System.out.println("Лицензия: " + license);
        System.out.println("Цвет: " + color);
        System.out.println("Год: " + year);
        System.out.println("");
    }

    public int getAutoYear() {
        return CUR_YEAR - year;
    }

    public String getModel() {
        return model;
    }

    public String getLicense() {
        return license;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
