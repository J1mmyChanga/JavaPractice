package vehicles;

public abstract class Vehicle {
    protected String model;
    protected String license;
    protected String color;
    protected String year;
    protected String ownerName;
    protected String insuranceNumber;
    protected String engineType;

    public Vehicle() {
        this.model = "Dodge Challenger";
        this.license = "M973УН67";
        this.color = "black";
        this.year = "2004";
        this.ownerName = "Vitalya";
        this.insuranceNumber = "275625";
        this.engineType = "Turbo";
    }
    public abstract String vehicleType();

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
