import java.util.*;
import java.util.stream.*;

class Bogie {
    String type;
    int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return type + " - Capacity: " + capacity;
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        // Step 1: Create bogie list (reuse from UC9)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 50));
        bogies.add(new Bogie("Sleeper", 80));

        // Step 2: Stream → map → reduce
        int totalSeats = bogies.stream()
                .map(b -> b.getCapacity())     // extract capacity
                .reduce(0, Integer::sum);      // aggregate sum

        // Step 3: Display result
        System.out.println("Total Seating Capacity: " + totalSeats);

        // Step 4: Verify original list unchanged
        System.out.println("\nOriginal Bogies:");
        bogies.forEach(System.out::println);
    }
}