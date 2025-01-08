public class Functions {

    public static void main(String[] args) {
        greetings("Hello World!");
        addition(10, 20);
        System.out.println("The number is even: " + isEven(12));
        System.out.println("The number is even: " + isEven(21));
        System.out.println("The factorial of 5 is: " + factorial(5));
        greetings("Goodbye World!");
    }

    static void greetings(String message) {
        System.out.println("Message: " + message);
    }

    public static void addition(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // RECURSIVE FUNCTIONS
    static int factorial(int number) {
        if (number == 1) return 1;
        // System.out.println("number = " + (number - 1));
        return number * factorial(number - 1);
    }
}
