import java.util.LinkedHashSet;
import java.util.Set;

/**
 * UC5: Preserve Insertion Order of Bogies (LinkedHashSet)
 * Combines the uniqueness of a Set with the predictable iteration order of a List.
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // 1. Initialize the App
        System.out.println("=== Train Consist Management App ===");

        // 2. Create a LinkedHashSet
        // This ensures every bogie is unique but maintains the order of attachment.
        Set<String> trainFormation = new LinkedHashSet<>();

        // 3. Attach Bogies in sequence
        System.out.println("Attaching bogies to the engine...");
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // 4. Attempt to add a duplicate bogie
        // In a real yard, you can't physically attach the same bogie twice.
        System.out.println("Attempting to attach a duplicate 'Sleeper' bogie...");
        boolean isAdded = trainFormation.add("Sleeper");

        // 5. Check if the duplicate was allowed
        if (!isAdded) {
            System.out.println("Validation Alert: 'Sleeper' is already part of the formation. Duplicate ignored.");
        }

        // 6. Display the formation
        // Notice the output will be exactly in the order: Engine -> Sleeper -> Cargo -> Guard
        System.out.println("\nFinal Train Formation (Order Preserved):");
        System.out.println(trainFormation);

        // 7. Verify Size
        System.out.println("Total Unique Bogies in Formation: " + trainFormation.size());
    }
}