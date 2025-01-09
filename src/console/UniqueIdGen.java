package console;

import java.util.Random;
import java.util.Scanner;

public class UniqueIdGen {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        System.out.print("Enter name: ");
        var name = console.nextLine();
        System.out.print("Enter lastname: ");
        var lastname = console.nextLine();
        System.out.print("Enter birth year(YYYY): ");
        var birthYear = console.nextLine();
        // ID Gen 1st
        var nameChars = name.strip().toUpperCase().substring(0, 2);
        var lastnameChars = lastname.strip().toUpperCase().substring(0, 2);
        var nameShort = nameChars + lastnameChars;
        // ID Gen 2nd
        var yearDigits = birthYear.substring(2);
        // ID Gen 3th
        var random = new Random();
        var randomNumber = random.nextInt(9999) + 1;

        System.out.printf("ID Generated: %s%s%04d ", nameShort, yearDigits, randomNumber);
    }
}
