import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] integers;
        integers = new int[5];
        integers[0] = 13;
        integers[1] = 31;
        integers[4] = 23;
        System.out.println("integer idx 0 = " + integers[0] );
        System.out.println("integer idx 1 = " + integers[1] );
        System.out.println("integer idx 2 = " + integers[2] );

        // WAYS TO INITIALIZE AN ARRAY
        var nums = new int[2];
        int [] numbers = {100, 200, 300, 400};
        var numbersArray = new int[]{100, 200, 300, 400};

        // GET ELEMENTS IN ARRAY (for loop)
        for (int i = 0; i < numbersArray.length; i++)
            System.out.println("numbersArray[" + i + "] = " + numbersArray[i]);
        // (while loop)
        var counter = numbers.length;
        while (counter > 0) {
            System.out.println("numbers[" + (counter - 1) + "] = " + numbers[counter - 1]);
            counter--;
        }

        // ADD VALUES TO ARRAY
        var console = new Scanner(System.in);
        System.out.print("Provides how long the array should be: ");
        var arrayLength = console.nextInt();
        var integersArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Enter [" + i + "] integer: ");
            integersArray[i] = console.nextInt();
        }
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("integersArray[" + i + "] = " + integersArray[i]);
        }
    }
}
