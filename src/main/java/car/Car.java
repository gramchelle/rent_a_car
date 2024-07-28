package car;

public class Car {
    private String brand;
    private String model;
    private double age;
    private String segment;
    private String gearType;
    private int trunkCapacity;
    private String color;
    private String fuelType;

    public Car(String brand, String model, double age, String segment, String gearType, int trunkCapacity, String color, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.age = age;
        this.segment = segment;
        this.gearType = gearType;
        this.trunkCapacity = trunkCapacity;
        this.color = color;
        this.fuelType = fuelType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(int trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
