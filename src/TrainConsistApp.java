import java.util.*;

// Bogie class with name and capacity
class Bogie {
    String name;
    int capacity;

    // Constructor
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // To display bogie information
    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App (UC7: Sort Bogies by Capacity) ===\n");

        // Create a list of passenger bogies
        List<Bogie> passengerBogies = new ArrayList<>();
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 54));
        passengerBogies.add(new Bogie("First Class", 36));
        passengerBogies.add(new Bogie("AC 3 Tier", 64));

        System.out.println("Passenger Bogies (Unsorted):");
        for (Bogie b : passengerBogies) {
            System.out.println("- " + b);
        }

        // Sort using Comparator by capacity in ascending order
        passengerBogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nPassenger Bogies (Sorted by Capacity):");
        for (Bogie b : passengerBogies) {
            System.out.println("- " + b);
        }

        // Optional: sort in descending order
        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity).reversed());
        System.out.println("\nPassenger Bogies (Sorted by Capacity Descending):");
        for (Bogie b : passengerBogies) {
            System.out.println("- " + b);
        }
    }
}

// Adding a getter to Bogie class for descending sort
class BogieWithGetter {
    String name;
    int capacity;

    public BogieWithGetter(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}