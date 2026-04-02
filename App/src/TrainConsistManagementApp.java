import java.util.ArrayList;
import java.util.List;

/**
 * UC2: Add Passenger Bogies to Train (ArrayList Operations)
 * Demonstrates CRUD operations: adding, removing, and checking for elements.
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // 1. Initialize the App
        System.out.println("=== Train Consist Management App ===");

        // 2. Create an ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // 3. ADD: Inserting elements into the list
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // 4. READ: Display the list after insertion
        System.out.println("Bogies added to the train.");
        System.out.println("Current Consist: " + passengerBogies);

        // 5. DELETE: Removing a specific bogie
        System.out.println("\nRemoving 'AC Chair' for maintenance...");
        passengerBogies.remove("AC Chair");

        // 6. SEARCH: Checking if a specific bogie exists using contains()
        System.out.print("Checking if 'Sleeper' bogie is attached: ");
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Yes, Sleeper is present.");
        } else {
            System.out.println("No, Sleeper not found.");
        }

        // 7. FINAL STATE: Print the list state and size
        System.out.println("\nFinal Train Consist: " + passengerBogies);
        System.out.println("Total Bogie Count: " + passengerBogies.size());
    }
}