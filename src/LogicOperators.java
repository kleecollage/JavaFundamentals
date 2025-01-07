public class LogicOperators {
    public static void main(String[] args) {
        boolean a = true, b = false, c = true, d = false;
        // AND Operator
        // and (retrieves true only if every sentence is true)
        var result = a && b;
        System.out.println("result true && false = " + result);
        result = a && c;
        System.out.println("result true && true = " + result);
        result = b && d;
        System.out.println("result false && false = " + result);
        // OR operator
        // or (retrieves true if one of any sentence is true)
        result = a || b;
        System.out.println("result true || false = " + result);
        result = a || c;
        System.out.println("result true || true = " + result);
        result = b || d;
        System.out.println("result false || false = " + result);
        // NOT operator
        // not (invert the value)
        result = !a;
        System.out.println("result !true = " + result);
        result = !b;
        System.out.println("result !false = " + result);
    }
}
