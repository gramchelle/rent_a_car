package car;

import java.util.Locale;

public class Sedan extends Car {
    private double discount_rate = 0.07;

    public Sedan(String brand, String model, double age, String segment, String gearType, int trunkCapacity, String color, String fuelType) {
        super(brand, model, age, segment, gearType, trunkCapacity, color, fuelType);
    }

    private double calculateDailyPrice(String segment) {
        switch (segment.toUpperCase(Locale.ROOT)) {
            case "A":
                return 1200d;
            case "B":
                return 1000d;
            case "C":
                return 900d;
            case "D":
                return 850d;
            default:
                return 800d;
        }
    }

    public void getDailyPrice() {
        System.out.println("Daily price is : "+ calculateDailyPrice(getSegment()));
    }

    public void getMonthlyPrice() {
        double discountedPrice = (calculateDailyPrice(getSegment()) * 30) * (1 - discount_rate);
        System.out.println("Monthly Price is : " + discountedPrice);
    }


}
