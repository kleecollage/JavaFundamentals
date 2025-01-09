package console;

import java.util.Scanner;

public class HandleConsole {
    public static void main(String[] args) {
        // Put values into console
        var console = new Scanner(System.in); // in = input
        System.out.println("Enter your name: ");
        var name = console.nextLine();
        System.out.println("name = " + name);
    }
}
