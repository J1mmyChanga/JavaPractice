package vehicles;

public class ElectricCar extends Car {
    protected int batteryCapacity;
    public ElectricCar() {
        super();
        setEngineType("Electric");
        setBatteryCapacity(87);
    }

    public void setBatteryCapacity(int batteryCapacity) { this.batteryCapacity = batteryCapacity; }
    public int getBatteryCapacity() {return this.batteryCapacity; }

    @Override
    public String vehicleType() {
        return "Electric Car";
    }

    @Override
    public String toString() {
        return vehicleType() + ": " + "model = " + model + "; license = " + license +
                "; color = " + color + "; year = " + year + "; ownerName = " +
                ownerName + "; insuranceNumber = " + insuranceNumber + "; engine = " + engineType +
                "; batteryCapacity = " + batteryCapacity;
    }
}
