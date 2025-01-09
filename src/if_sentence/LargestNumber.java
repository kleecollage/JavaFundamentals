package if_sentence;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        var console = new Scanner(System.in);

        System.out.println("Enter 2 numbers: ");
        var number1 = console.nextInt();
        var number2 = console.nextInt();

        var result = number1 > number2 ? " is greater than " + number2 : " is smaller than " + number2;
        System.out.println(number1 + result);
    }
}
