import java.util.Scanner;

public class VariableRange {
    public static void main(String[] args) {
        var console = new Scanner(System.in);

        System.out.print("Enter integer: ");
        var data = Integer.parseInt(console.nextLine());

        // Range from 0 to 10
        var inRange = data >= 1 && data <= 10;
        System.out.println("In range: " + inRange);

        // Reverse logic (out of range)
        System.out.println("Out of range: " + !inRange);
    }
}
