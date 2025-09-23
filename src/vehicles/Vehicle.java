package vehicles;

public abstract class Vehicle {
    protected String model;
    protected String license;
    protected String color;
    protected String year;
    protected String ownerName;
    protected String insuranceNumber;
    protected String engineType;

    public abstract String vehicleType();

    @Override
    public String toString() {
        return String.format(vehicleType() + ": model = %s; license = %s; color = %s; year = %s; ownerName = %s; " +
                "insuranceNumber = %s; engine = %s", model, license, color, year, ownerName, insuranceNumber, engineType);

    }

    public void setModel(String model) { this.model = model; }
    public void setLicense(String license) { this.license = license; }
    public void setColor(String color) { this.color = color; }
    public void setYear(String year) { this.year = year; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }
    public void setInsuranceNumber(String insuranceNumber) { this.insuranceNumber = insuranceNumber; }
    public void setEngineType(String engineType) { this.engineType = engineType; }

    public String getModel() {return this.model; }
    public String getLicense() {return this.license; }
    public String getColor() {return this.color; }
    public String getYear() {return this.year; }
    public String getOwnerName() {return this.ownerName; }
    public String getInsuranceNumber() {return this.insuranceNumber; }
    public String getEngineType() {return this.engineType; }
}
