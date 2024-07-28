package carRentalService;

import car.Car;
import car.Sedan;
import car.Hatchback;
import car.SUV;
import customer.Customer;
import customer.IndividualCustomer;
import customer.CorporateCustomer;
import java.util.ArrayList;
import java.util.List;

public class CarRentalManager implements CarRental {
    private List<Car> cars;

    public CarRentalManager() {
        cars = new ArrayList<>();
        // Example Cars
        cars.add(new Sedan("Honda", "Civic", 2, "A", "Automatic", 350, "Dark Gray", "Hybrid"));
        cars.add(new Hatchback("Ford", "Fiesta", 4, "B", "Automatic", 300, "Gray", "Diesel"));
        cars.add(new SUV("Toyota", "Land Cruiser", 5, "Luxury", "Automatic", 500, "Black", "Petrol"));
        cars.add(new SUV("Ford", "Explorer", 3, "B", "Manual", 450, "White", "Diesel"));
        cars.add(new Sedan("Honda", "Civic", 2, "A", "Automatic", 350, "Blue", "Hybrid"));
        cars.add(new Sedan("BMW", "520d", 1, "A", "Manual", 400, "Red", "Petrol"));
        cars.add(new Hatchback("Volkswagen", "Golf", 6, "d", "Manual", 350, "Green", "Petrol"));
    }

    @Override
    public List<Car> getAvailableCars(Customer customer) {
        List<Car> availableCars = new ArrayList<>();
        if (customer instanceof IndividualCustomer) {
            for (Car car : cars) {
                if (car instanceof Sedan || car instanceof Hatchback) {
                    availableCars.add(car);
                }
            }
        } else if (customer instanceof CorporateCustomer) {
            availableCars.addAll(cars);
        }
        return availableCars;
    }
}
