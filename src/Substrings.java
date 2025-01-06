public class Substrings {
    public static void main(String[] args) {
        var string1 = "Hello World";
        System.out.println("string1 = " + string1);
        // Substrings
        var substring1 = string1.substring(0, 6);
        System.out.println("substring1 = " + substring1);
        var substring2 = string1.substring(6);
        System.out.println("substring2 = " + substring2);
    }
}
