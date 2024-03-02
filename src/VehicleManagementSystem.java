import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class VehicleManagementSystem {
    private final List<Vehicle> vehicles;

    public VehicleManagementSystem() {
        Scanner scanner = new Scanner(System.in);
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Vehicle added successfully!");
    }

    public void displayAllVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles in the system.");
            return;
        }

        System.out.println("All vehicles in the system:");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }
    }

    public void searchVehicle(String keyword) {
        boolean found = false;
        System.out.println("Search results:");
        for (Vehicle vehicle : vehicles) {
            if (vehicle.toString().toLowerCase().contains(keyword.toLowerCase())) {
                vehicle.displayInfo();
                System.out.println();
                found = true;
            }
        }
    }
}