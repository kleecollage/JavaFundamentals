public class StringMethods {
    public static void main(String[] args) {
        // String methods
        var string1 = "Hello World";
        // String length:
        var stringLength = string1.length();
        System.out.println("stringLength = " + stringLength);
        // Character replacement
        var newString = string1.replace('o', 'a');
        System.out.println("newString = " + newString);
        // Convert to uppercase
        var upper = string1.toUpperCase();
        System.out.println("upper = " + upper);
        // Convert to lowercase
        System.out.println("lower = " + string1.toLowerCase());
        // Remove whitespace from the beginning and end of the string
        var string2 = "        \u2002\u2002String with  spaces\u2002\u2002       ";
        System.out.println("string2 = " + string2);
        var striped = string2.strip();
        System.out.println("striped = " + striped);
        var trimmed = string2.trim();
        System.out.println("trimmed = " + trimmed);
    }
}
