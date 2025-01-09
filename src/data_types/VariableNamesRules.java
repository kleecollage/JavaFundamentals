package data_types;

public class VariableNamesRules {
    public static void main(String[] args) {
        // VARIABLE NAMES RULE
        String completeName = "John Doe"; // CamelCase = GOOD! practice
        System.out.println("completeName: " + completeName);
        String CompleteName = "John Doe 2"; // No CamelCase = NO GOOD :(
        System.out.println("CompleteName: " + CompleteName);
        String complete_name = "John Doe 3"; // snake_case = NO GOOD :(
        String _lastname = "Smith"; // init with '_' OK
        String $lastname = "Smith"; // init with '$' OK
        int totPzs = 10; // No descriptive and not clear = NO GOOD :(
        int totalPieces = 10; // Descriptive and clear = GOOD!
        boolean married = true; // ok but not perfect
        boolean isMarried = true; // GOOD!
        boolean hasBalance = true; // GOOD!
    }
}
