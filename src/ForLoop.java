public class ForLoop {
    public static void main(String[] args) {
        System.out.println("For Loop:");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + "\t");
        }

        // EVEN NUMBERS
        System.out.println("\nEven Numbers (For Loop):");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0)
                System.out.print(i + "\t");
        }

        //
    }
}
