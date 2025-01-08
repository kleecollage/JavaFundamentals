public class BreakContinue {
    public static void main(String[] args) {
        // Break example: Print the first even number
        for (var num = 1; num < 10; num ++ ) {
            if (num % 2 == 0) {
                System.out.println(num);
                break;
            }
        }
        // Continue example: Print even numbers
        for (var num = 1; num < 10; num ++ ) {
            if (num % 2 == 1) {
                continue;
            }
            System.out.print(num + "\t");
        }
    } // end main
}
