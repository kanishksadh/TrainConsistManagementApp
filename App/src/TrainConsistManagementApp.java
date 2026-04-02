import java.util.HashMap;
import java.util.Map;

/**
 * UC6: Map Bogie to Capacity (HashMap)
 * Associates bogie names with their respective capacities using key-value pairs.
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // 1. Initialize the App
        System.out.println("=== Train Consist Management App ===");

        // 2. Create a HashMap to store Bogie Name (String) and Capacity (Integer)
        // HashMap provides O(1) average time complexity for put and get operations.
        Map<String, Integer> bogieCapacities = new HashMap<>();

        // 3. Mapping Bogies to Capacities using put()
        // Key: Bogie Name, Value: Seat/Load Count
        bogieCapacities.put("Sleeper", 72);
        bogieCapacities.put("AC Chair", 56);
        bogieCapacities.put("First Class", 24);
        bogieCapacities.put("General", 90);

        System.out.println("Bogie capacities have been registered.\n");

        // 4. Iterating over the map using entrySet()
        // This allows us to access both the Key and the Value simultaneously.
        System.out.println("--- Train Capacity Manifest ---");
        for (Map.Entry<String, Integer> entry : bogieCapacities.entrySet()) {
            String bogieName = entry.getKey();
            Integer capacity = entry.getValue();
            System.out.println("Bogie: " + bogieName + " | Capacity: " + capacity + " seats");
        }

        // 5. Fast Lookup Example
        String searchBogie = "Sleeper";
        if (bogieCapacities.containsKey(searchBogie)) {
            System.out.println("\nQuick Lookup: The " + searchBogie + " bogie has "
                    + bogieCapacities.get(searchBogie) + " seats.");
        }

        System.out.println("\nRegistration complete. Capacity tracking is now active.");
    }
}