package strings;

public class Strings {
    public static void main(String[] args) {
        var string1 = "Hello";
        System.out.println("string1 = " + string1);
        var string2  = new String("World");
        System.out.println("string2 = " + string2);
        var string3 = string1 + " " + string2;
        System.out.println("string3 = " + string3);
        // TEXT BLOCK
        var string4 = """
                This is
                a text
                block uwu
                """;
        System.out.println("string4 = " + string4);
    }
}
