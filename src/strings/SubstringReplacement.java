package strings;

public class SubstringReplacement {
    public static void main(String[] args) {
        var string1 = "Hello World";
        System.out.println("string1 = " + string1);
        // Replace 'World' for 'Everyone'
        var newString = string1.replace("World", "Everyone");
        System.out.println("newString = " + newString);
        // Replace 'Hello' for 'Bye'
        newString = string1.replace("Hello", "Bye");
        System.out.println("newString = " + newString);
    }
}
