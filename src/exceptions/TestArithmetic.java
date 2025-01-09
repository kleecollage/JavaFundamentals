package exceptions;

public class TestArithmetic {
    public static void main(String[] args) {
        try {
            var result = Arithmetic.division(10, 0);
            System.out.println("result = " + result);
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        } finally {
            System.out.println("Finally block");
        }
    }
}
