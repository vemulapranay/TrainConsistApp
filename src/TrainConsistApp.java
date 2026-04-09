import java.util.regex.*;

public class TrainValidationApp {

    public static void main(String[] args) {

        // Sample inputs (you can replace with Scanner input)
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // Step 1: Define regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Step 2: Compile patterns
        Pattern trainIdPattern = Pattern.compile(trainPattern);
        Pattern cargoCodePattern = Pattern.compile(cargoPattern);

        // Step 3: Create matchers
        Matcher trainMatcher = trainIdPattern.matcher(trainId);
        Matcher cargoMatcher = cargoCodePattern.matcher(cargoCode);

        // Step 4: Validate using matches()
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // Step 5: Display results
        System.out.println("Train ID: " + trainId + " -> " +
                (isTrainValid ? "Valid" : "Invalid"));

        System.out.println("Cargo Code: " + cargoCode + " -> " +
                (isCargoValid ? "Valid" : "Invalid"));
    }
}
