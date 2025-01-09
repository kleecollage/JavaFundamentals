package operators;

public class ComparisonOperators {
    public static void main(String[] args) {
        int a = 3, b = 2;
        // Equality ==
        var result = a == b;
        System.out.println("result 3 == 2 = " + result);
        // Distinct !=
        result = a != b;
        System.out.println("result 3 != 2 = " + result);
        // Greater than >
        result = a > b;
        System.out.println("result 3 > 2  = " + result);
        // Less than <
        result = a < b;
        System.out.println("result 3 < 2  = " + result);
        // Greater or equal than >=
        result = a > b;
        System.out.println("result 3 >= 2 = " + result);
        // Less or equal than <=
        result = a <= b;
        System.out.println("result 3 <= 2 = " + result);
    }
}
