package vehicles;

public class ElectricCar extends Car implements ElectricVehicle {
    protected int batteryCapacity;
    public ElectricCar() {
        super();
        setEngineType("Electric");
        setBatteryCapacity(87);
    }
    @Override
    public void setBatteryCapacity(int batteryCapacity) { this.batteryCapacity = batteryCapacity; }

    @Override
    public int getBatteryCapacity() {return this.batteryCapacity; }

    @Override
    public String vehicleType() {
        return "Electric Car";
    }

    @Override
    public String toString() {
        return String.format(vehicleType() + ": model = %s; license = %s; color = %s; year = %s; ownerName = %s; " +
                "insuranceNumber = %s; engine = %s; batteryCapacity = %s;", model, license, color, year, ownerName,
                insuranceNumber, engineType, batteryCapacity);

    }
}
