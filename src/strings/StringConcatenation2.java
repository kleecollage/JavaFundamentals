package strings;

public class StringConcatenation2 {
    public static void main(String[] args) {
        var string1 = "Hello";
        var string2 = "World";
        var string3 = string1 + " " + string2;
        System.out.println("string3 using '+' = " + string3);
        // 'concat' method
        string3 = string1.concat(" ").concat("World");
        System.out.println("string3 using concat = " + string3);
        // 'stringBuilder' method
        var stringBuilder = new StringBuilder();
        stringBuilder.append(string1);
        stringBuilder.append(" ");
        stringBuilder.append(string2);
        var result = stringBuilder.toString();
        System.out.println("stringBuilder = " + result);
        // stringBuffer method
        var stringBuffer = new StringBuffer();
        stringBuffer.append(string1).append(" ").append(string2);
        System.out.println("stringBuffer = " + stringBuffer);
        // 'join' method
        result = String.join(" ", string1, string2, "Bye");
        System.out.println("join = " + result);
    }
}
