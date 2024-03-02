import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehicleManagementSystem system = new VehicleManagementSystem();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a vehicle");
            System.out.println("2. Display all vehicles");
            System.out.println("3. Search for a vehicle");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addVehicle(system);
                    break;
                case 2:
                    system.displayAllVehicles();
                    break;
                case 3:
                    System.out.println("Enter keyword for search:");
                    String keyword = scanner.next();
                    system.searchVehicle(keyword);
                    break;
                case 4:
                    System.out.println("Exiting the Vehicle Management System. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }

    private static void addVehicle(VehicleManagementSystem system) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a vehicle type:");
        System.out.println("1. Car");
        System.out.println("2. Motorcycle");

        int typeChoice = scanner.nextInt();

        if (typeChoice == 1) {
            createAndAddCar(system);
        } else if (typeChoice == 2) {
            createAndAddMotorcycle(system);
        } else {
            System.out.println("Invalid choice. Returning to main menu.");
        }
    }

    private static void createAndAddCar(VehicleManagementSystem system) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter car brand:");
        String brand = scanner.next();

        System.out.println("Enter car model:");
        String model = scanner.next();

        System.out.println("Enter car id:");
        String id = scanner.next();

        System.out.println("Enter number of doors:");
        int numDoors = scanner.nextInt();

        Car car = new Car(brand, model, id, numDoors);


        car.addComment("Spacious interior");
        car.addComment("Fuel efficient");

        system.addVehicle(car);
    }

    private static void createAndAddMotorcycle(VehicleManagementSystem system) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter motorcycle brand:");
        String brand = scanner.next();

        System.out.println("Enter motorcycle model:");
        String model = scanner.next();

        System.out.println("Enter motorcycle year:");
        String id = scanner.next();

        System.out.println("Enter number of wheels:");
        int numWheels = scanner.nextInt();

        Motorcycle motorcycle = new Motorcycle(brand, model, id, numWheels);


        motorcycle.addComment("Great for city commuting");
        motorcycle.addComment("Easy to handle");

        system.addVehicle(motorcycle);
    }
}
