import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC5: Preserve Insertion Order) ===");

        // Initialize LinkedHashSet for train formation
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Attach bogies (duplicates will be ignored)
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate bogie
        trainFormation.add("Sleeper"); // duplicate, will be ignored

        // Display final formation order
        System.out.println("\nFinal Train Formation (in insertion order, duplicates ignored):");
        for (String bogie : trainFormation) {
            System.out.println("- " + bogie);
        }

        // Display total bogies
        System.out.println("\nTotal bogies in formation: " + trainFormation.size());
    }
}