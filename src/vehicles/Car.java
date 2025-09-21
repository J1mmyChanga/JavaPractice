package vehicles;

public class Car extends Vehicle {
    public Car() {
        super();
    }
    @Override
    public String vehicleType() {
        return "Car";
    }

    @Override
    public String toString() {
        return vehicleType() + ": " + "model = " + model + "; license = " + license +
                "; color = " + color + "; year = " + year + "; ownerName = " +
                ownerName + "; insuranceNumber = " + insuranceNumber + "; engine = " + engineType;
    }
}
