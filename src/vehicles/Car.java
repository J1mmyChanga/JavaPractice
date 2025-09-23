package vehicles;

public class Car extends Vehicle {
    public Car() {
        super();
        this.model = "Dodge Challenger";
        this.license = "M973УН67";
        this.color = "black";
        this.year = "2004";
        this.ownerName = "Vitalya";
        this.insuranceNumber = "275625";
        this.engineType = "Combustion";
    }
    @Override
    public String vehicleType() {
        return "Car";
    }
}
