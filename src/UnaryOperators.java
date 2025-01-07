public class UnaryOperators {
    public static void main(String[] args) {
        int a = 10, b = -2, result;
        var c = true;
        // Unary Operator +
        result = +a;
        System.out.println("result +a = " + result);
        // Unary Operator -
        result = -a;
        System.out.println("result -a = " + result);
        // Unary Operator pre-increment
        result = ++a;
        System.out.println("result ++a = " + result);
        // Unary Operator post-increment
        result = a++;
        System.out.println("result a++ = " + result);
        System.out.println("a = " + a);
        // Unary Operator pre-decrement
        result = --a;
        System.out.println("result --a = " + result);
        // Unary Operator post-decrement
        result = a--;
        System.out.println("result a-- = " + result);
        System.out.println("a = " + a);
    }
}
