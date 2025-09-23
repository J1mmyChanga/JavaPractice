package vehicles.app;

import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.Vehicle;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("BMW");
        car.setLicense("K456TO799");
        car.setColor("yellow");
        car.setYear("2023");
        car.setOwnerName("Vika");
        car.setEngineType("Turbo");
        car.setInsuranceNumber("2738782323");
        System.out.println(car);

        car.setYear("2001");
        car.setOwnerName("Nikolay");
        car.setInsuranceNumber("111111");
        System.out.println(car);


        ElectricCar elcar = new ElectricCar();
        elcar.setModel("Tesla");
        elcar.setLicense("O183ET67");
        elcar.setColor("green");
        elcar.setYear("2017");
        elcar.setOwnerName("Oleg");
        elcar.setInsuranceNumber("234564236");
        System.out.println(elcar);

        elcar.setYear("1950");
        elcar.setOwnerName("Valera");
        elcar.setInsuranceNumber("444444444");
        System.out.println(elcar.getBatteryCapacity());
        System.out.println(elcar);
    }
}
