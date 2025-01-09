package while_loop;

public class WhileLoop {
    public static void main(String[] args) {
        var counter = 1;
        System.out.println("While Counting:");
        while (counter <= 10) {
            System.out.print(counter++ + "\t");
        }

        // EVEN NUMBERS
        counter = 1;
        System.out.println("\nEven Numbers:");
        while (counter <= 20) {
            if (counter % 2 == 0)
                System.out.print(counter++ + "\t");
            else
                counter++;
        }

        // ODD NUMBERS
        counter = 1;
        System.out.println("\nOdd Numbers:");
        while (counter <= 20) {
            if (counter % 2 != 0)
                System.out.print(counter++ + "\t");
            else
                counter++;
        }

        // DO-WHILE
        System.out.println("\nDo-While Counting:");
        counter = 5;
        do {
            System.out.print(counter++ + "\t");
        } while (counter <= 10);

        // REVERSE NUMBERS
        System.out.println("\nReverse Numbers:");
        counter = 10;
        do {
            System.out.print(counter-- + "\t");
        } while (counter > 0);

        // ADDING ACCUMULATOR
        System.out.println("\nAdding Accumulator:");
        counter = 1;
        var result = 0;
        while (counter <= 5) {
            result += counter++;
            System.out.print(result + "\t");
        }
    }
}









