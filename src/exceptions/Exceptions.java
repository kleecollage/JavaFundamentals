package exceptions;

public class Exceptions {
    public static void main(String[] args) {
        int val1 = 10, val2 = 0;
        try {
            int result = val1 / val2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e);
        }
    }
}
