import java.util.Scanner;

public class LendingSystem {
    public static void main(String[] args) {
        final var ALLOWED_DISTANCE = 3;
        var console = new Scanner(System.in);

        System.out.print("Do you have you student credential (true/ false)? ");
        var isStudent = Boolean.parseBoolean(console.nextLine());

        System.out.print("How far do you live from the library (On kms)?");
        var distanceLibrary = Integer.parseInt(console.nextLine());

        var isEligible = isStudent || distanceLibrary <= ALLOWED_DISTANCE;
        System.out.println("You are eligible: " + isEligible);
    }
}
