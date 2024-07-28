package carRentalService;

import car.Car;
import customer.Customer;
import java.util.List;

public interface CarRental {
    List<Car> getAvailableCars(Customer customer);
}
