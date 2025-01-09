package operators;

public class AssigmentOperators {
    public static void main(String[] args) {
        // Assignment
        var myNumber = 10;
        int myNumber2;
        myNumber2 = 15;

        // Compound Assigment +=
        myNumber += 5; // 10 + 5 = 15
        System.out.println("myNumber = " + myNumber);
        // -=, *=, /=, %=
        myNumber *= 2; // 15 * 2 = 30
        System.out.println("myNumber = " + myNumber);

        // Multiple variable assignment
        int a = 10, b = 15, c = 20;
        System.out.printf("a=%d, b=%d, c=%d", a, b, c);
    }
}
