public class StringIndex {
    public static void main(String[] args) {
        var string1 = "Hello world";
        // Retrieves the first character
        var firstCharacter = string1.charAt(0); // Retrieves character 'H'
        System.out.println("firstCharacter = " + firstCharacter);
        var lastCharacter = string1.charAt(string1.length()-1); // Retrieves last character
        System.out.println("lastCharacter = " + lastCharacter);
    }
}
