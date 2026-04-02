import java.util.LinkedList;

/**
 * UC4: Maintain Ordered Bogie IDs (LinkedList)
 * Models the physical chaining of a train where order and insertion efficiency matter.
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // 1. Initialize the App
        System.out.println("=== Train Consist Management App ===");

        // 2. Create a LinkedList for the train consist
        // LinkedList is ideal for frequent insertions and deletions.
        LinkedList<String> trainConsist = new LinkedList<>();

        // 3. Sequential Addition
        System.out.println("Forming the initial train consist...");
        trainConsist.add("Engine");   // Position 0
        trainConsist.add("Sleeper");  // Position 1
        trainConsist.add("AC");       // Position 2
        trainConsist.add("Cargo");    // Position 3
        trainConsist.add("Guard");    // Position 4

        System.out.println("Initial Train: " + trainConsist);

        // 4. Middle Insertion: Adding a Pantry Car at position 2
        // In a LinkedList, this only involves updating node pointers.
        System.out.println("\nInserting 'Pantry Car' at position 2...");
        trainConsist.add(2, "Pantry Car");

        // 5. Removing the Head and Tail
        // Simulating detaching the Engine and the Guard coach
        System.out.println("Detaching the Engine (First) and Guard coach (Last)...");
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // 6. Display Final Ordered State
        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(trainConsist);

        // 7. Demonstration of Node linkage
        System.out.println("Total Bogies remaining: " + trainConsist.size());
    }
}