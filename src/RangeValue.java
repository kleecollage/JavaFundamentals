import java.util.Scanner;

public class RangeValue {
    public static void main(String[] args) {
        // Limits
        final var MINIMUM = 0;
        final var MAXIMUS = 5;
        System.out.print("Enter a number between 0 and 5: ");
        var data = Integer.parseInt(new Scanner(System.in).nextLine());
        var inRange = data >= MINIMUM && data <= MAXIMUS;
        System.out.println("The number is in range: " + inRange);
    }

}
