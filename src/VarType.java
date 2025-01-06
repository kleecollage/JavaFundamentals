public class VarType {
    public static void main(String[] args) {
        // VAR (Type inference)
        // Only for local variables inside methods
        // can't be used in classes or parameters
        // Example 1 without var
        String name1 = "John";
        System.out.println("name1 = " + name1);
        // Example 1 with var
        var name2 = "John";
        System.out.println("name2 = " + name2);
        // More Examples
        var age = 30; // int type is inferred
        var salry = 5000.5f; // float type is inferred
        var isMarried = false; // boolean type is inferred
    }
}
