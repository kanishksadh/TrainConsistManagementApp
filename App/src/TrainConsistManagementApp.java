import java.util.ArrayList;
import java.util.List;

/**
 * UC1: Initialize Train and Display Consist Summary
 * This class serves as the entry point for the Train Consist Management App.
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // 1. Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 2. Dynamic Initialization
        // We use the List interface for abstraction and ArrayList for a resizable collection.
        // For UC1, we are using a generic String list to represent the bogies conceptually.
        List<String> trainConsist = new ArrayList<>();

        // 3. Display Initial State
        // The size() method allows us to track the count dynamically.
        System.out.println("Initializing train consist...");
        System.out.println("Current Bogie Count: " + trainConsist.size());

        // 4. Closing message to confirm flow
        System.out.println("Application is ready for further operations.");
    }
}