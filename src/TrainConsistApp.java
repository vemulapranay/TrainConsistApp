import java.util.*;

// Main class
public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC3: Unique Bogie IDs) ===");

        // Create a HashSet for bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Add bogie IDs (including duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Display unique bogie IDs
        System.out.println("\nBogie IDs after insertion (duplicates removed automatically):");
        System.out.println(bogieIDs);

        // Check existence
        if (bogieIDs.contains("BG101")) {
            System.out.println("\nBogie BG101 exists in the train.");
        }

        System.out.println("\nTotal unique bogies: " + bogieIDs.size());
    }
}