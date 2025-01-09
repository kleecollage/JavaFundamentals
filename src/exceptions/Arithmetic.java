package exceptions;

public class Arithmetic {
    public static int division(int numerator, int denominator) {
        if (denominator == 0)
            throw new RuntimeException("Cannot divide by zero");

        return numerator / denominator;
    }
}
