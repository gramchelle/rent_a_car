package car;

import java.util.Locale;

public class SUV extends Car {

    public SUV(String brand, String model, double age, String segment, String gearType, int trunkCapacity, String color, String fuelType) {
        super(brand, model, age, segment, gearType, trunkCapacity, color, fuelType);
    }

    private double calculateDailyPrice(int trunkCapacity) {
        switch (trunkCapacity) {
            case 4:
                return 1000d;
            case 5:
                return 1100d;
            case 6:
                return 1250d;
            default:
                return 1500d;
        }
    }

    public void getDailyPrice() {
        System.out.println("Daily price is : "+ calculateDailyPrice(getTrunkCapacity()));
    }

    public void getMonthlyPrice() {
        System.out.println("SUVs cannot be rented monthly.");
    }
}
