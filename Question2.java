import java.util.Scanner;

// Interface Displayable
interface Displayable {
    void showDetails(int days);
}

// Abstract Class Vehicle
abstract class Vehicle {
    protected int vehicleId;
    protected String vehicleName;
    protected double rentalPricePerDay;

    public Vehicle(int vehicleId, String vehicleName, double rentalPricePerDay) {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    abstract double calculateRentalAmount(int days);

    public void displayVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Price per Day: " + rentalPricePerDay);
    }
}

// Concrete Class Car
class Car extends Vehicle implements Displayable {
    public Car(int vehicleId, String vehicleName, double rentalPricePerDay) {
        super(vehicleId, vehicleName, rentalPricePerDay);
    }

    @Override
    double calculateRentalAmount(int days) {
        double total = rentalPricePerDay * days;
        if (days > 5) {
            total -= total * 0.10; // 10% discount for > 5 days
        }
        return total;
    }

    @Override
    public void showDetails(int days) {
        displayVehicleDetails();
        System.out.println("Rented Days: " + days);
        System.out.println("Total Rental Amount: " + calculateRentalAmount(days));
    }
}

// Concrete Class Bike
class Bike extends Vehicle implements Displayable {
    public Bike(int vehicleId, String vehicleName, double rentalPricePerDay) {
        super(vehicleId, vehicleName, rentalPricePerDay);
    }

    @Override
    double calculateRentalAmount(int days) {
        double total = rentalPricePerDay * days;
        if (days > 3) {
            total -= total * 0.05; // 5% discount for > 3 days
        }
        return total;
    }

    @Override
    public void showDetails(int days) {
        displayVehicleDetails();
        System.out.println("Rented Days: " + days);
        System.out.println("Total Rental Amount: " + calculateRentalAmount(days));
    }
}

// Main Class
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating Car object (ID: 101, Name: Sedan, Price: 2000)
        Car car = new Car(101, "Sedan", 2000.0);
        System.out.print("Enter rental days for Car: ");
        int carDays = scanner.nextInt();

        System.out.println("\n--- Car Rental Details ---");
        car.showDetails(carDays);

        System.out.println("--------------------------");

        // Creating Bike object (ID: 201, Name: Sports Bike, Price: 500)
        Bike bike = new Bike(201, "Sports Bike", 500.0);
        System.out.print("Enter rental days for Bike: ");
        int bikeDays = scanner.nextInt();

        System.out.println("\n--- Bike Rental Details ---");
        bike.showDetails(bikeDays);

        scanner.close();
    }
}
