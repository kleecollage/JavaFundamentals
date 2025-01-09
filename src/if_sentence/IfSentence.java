package if_sentence;

import java.util.Scanner;

public class IfSentence {
    public static void main(String[] args) {
        var age = 16;
        if (age >= 18) {
            System.out.println("You can vote!");
        } else if (age >= 13) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are a kid");
        }

        // POSITIVE VALUE
        var console = new Scanner(System.in);
        System.out.println("Enter a number: ");
        var number = console.nextInt();
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }
}
