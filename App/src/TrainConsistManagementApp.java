import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Bogie Class: Represents a physical carriage with specific attributes.
 */
class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return String.format("%-15s | Capacity: %d seats", name, capacity);
    }
}

/**
 * UC7: Sort Bogies by Capacity (Comparator)
 * Demonstrates how to sort custom objects using business logic.
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // 1. Create a List of Custom Bogie Objects
        List<Bogie> passengerBogies = new ArrayList<>();

        // 2. Add Bogies with different capacities
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 24));
        passengerBogies.add(new Bogie("General", 90));

        System.out.println("Unsorted Passenger Bogies:");
        passengerBogies.forEach(System.out::println);

        // 3. Apply Comparator to sort by capacity (Ascending)
        // Using a Lambda expression for concise comparison logic
        System.out.println("\nSorting bogies by capacity (Low to High)...");
        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity));
        passengerBogies.forEach(System.out::println);

        // 4. Apply Comparator to sort by capacity (Descending)
        // This helps identify high-capacity bogies first for heavy traffic routes.
        System.out.println("\nRanking bogies by capacity (High to Low):");
        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity).reversed());

        // Displaying Final Sorted List
        for (Bogie b : passengerBogies) {
            System.out.println("[RANKED] " + b);
        }

        System.out.println("\nOptimal usage plan generated based on capacity ranking.");
    }
}