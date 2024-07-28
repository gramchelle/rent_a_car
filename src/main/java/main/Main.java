package main;

import car.Car;
import carRentalService.CarRentalManager;
import customer.Customer;
import customer.IndividualCustomer;
import customer.CorporateCustomer;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name, surname, phone;
        int idNumber;

        CarRentalManager carRentalManagement = new CarRentalManager();

        // Asking the customer if the purchase bill will be individual or corporate in JOptionPane.

        Object[] options = {"Individual", "Corporate"};

        int response = JOptionPane.showOptionDialog(null,
                "Customer Type?",
                "Welcome",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        // If the customer clicked on the "Individual" or "Corporate" button, they will log their information.

        if (response == 0) {
            System.out.println("Before going any further, you need to register.\nPlease enter your Name:");
            name = scanner.nextLine();
            System.out.println("Surname:");
            surname = scanner.nextLine();
            System.out.println("ID Number:");
            idNumber = scanner.nextInt();
            System.out.println("Phone Number:");
            phone = scanner.nextLine();
            Customer individualCustomer = new IndividualCustomer(name, surname, idNumber, phone);
            JOptionPane.showMessageDialog(null,"Welcome "+name+" "+surname+". Here are the cars you can consider: ");
            for (Car car : carRentalManagement.getAvailableCars(individualCustomer)) {
                System.out.println(car.getClass().getSimpleName() + ": " + car.getBrand() + " " + car.getModel());
            }

        } else if (response == 1) {
            System.out.println("Before going any further, you need to register.\nPlease enter your Company's Name:");
            name = scanner.nextLine();
            System.out.println("Tax Number:");
            idNumber = scanner.nextInt();
            System.out.println("Phone Number:");
            phone = scanner.nextLine();
            Customer corporateCustomer = new CorporateCustomer(name, idNumber, phone);
            JOptionPane.showMessageDialog(null,"Welcome "+name+". Here are the cars you can consider: ");
            for (Car car : carRentalManagement.getAvailableCars(corporateCustomer)) {
                System.out.println(car.getClass().getSimpleName() + ": " + car.getBrand() + " " + car.getModel());
            }

        // If the customer left the page, this message will greet them.

        } else {
            JOptionPane.showMessageDialog(null, "Thank you for visiting us.\nHave a nice day!");
        }

    }
}
