package car;

public class Hatchback extends Car {
    private double dailyPrice = 950d;
    private double discount_rate = 0.08;

    public Hatchback(String brand, String model, double age, String segment, String gearType, int trunkCapacity, String color, String fuelType) {
        super(brand, model, age, segment, gearType, trunkCapacity, color, fuelType);
    }

    public double getDailyPrice() {
        return dailyPrice;
    }

    public void getMonthlyPrice() {
        double discountedPrice = (dailyPrice * 30) * (1 - discount_rate);
        System.out.println("Monthly Price is : " + discountedPrice);
    }
}
