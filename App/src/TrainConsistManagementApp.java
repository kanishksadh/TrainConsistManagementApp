import java.util.HashSet;
import java.util.Set;

/**
 * UC3: Track Unique Bogie IDs (Set – HashSet)
 * Demonstrates how to enforce uniqueness and prevent duplicate data entry.
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // 1. Initialize the App
        System.out.println("=== Train Consist Management App ===");

        // 2. Create a HashSet for unique Bogie IDs
        // We use the Set interface to enforce the rule: No duplicates allowed.
        Set<String> bogieIds = new HashSet<>();

        // 3. Adding Bogie IDs (including duplicates)
        System.out.println("Registering bogies in the system...");

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");

        // Attempting to add a duplicate ID
        System.out.println("Attempting to add duplicate ID: BG101");
        boolean isAdded = bogieIds.add("BG101");

        // 4. Feedback on duplicate attempt
        if (!isAdded) {
            System.out.println("Warning: Bogie BG101 already exists. Registration rejected.");
        }

        // 5. Display the final set of unique IDs
        System.out.println("\nFinal Unique Bogie Registry:");
        System.out.println(bogieIds);

        // 6. Demonstrate Unordered Property
        System.out.println("Total Unique Bogies Registered: " + bogieIds.size());
    }
}