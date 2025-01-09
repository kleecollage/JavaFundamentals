package variable_arguments;

public class VariableArguments {
    public static void main(String[] args) {
        printNumbers(1, 2, 3, 4, 5); // varargs
        variousParameters("John", 10, 20, 30);
    }

    private static void variousParameters(String name, int... numbers) {
        System.out.println("Name: " + name);
        printNumbers(numbers);
    }

    static void printNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.print(number + "\t");
        }
        System.out.println();
    }
}
