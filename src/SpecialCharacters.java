public class SpecialCharacters {
    public static void main(String[] args) {
        var string1 = "Hello World";
        System.out.println("string1 = " + string1);
        // '\n' : Print a line break
        string1 = "Hello\nWorld";
        System.out.println("Line break = " + string1);
        // '\t': Add tabulation
        string1 = "Hello\tWorld";
        System.out.println("Tabulation = " + string1);
        // '\' : Escape character
        string1 = "Hello \'World\'";
        System.out.println("Simple quote wth escape character = " + string1);
        // '\"': Add double quote
        string1 = "Hello \"World\"";
        System.out.println("Double quote = " + string1);
        // '\\': Add inverted diagonal
        string1 = "Hello\\World";
        System.out.println("Inverted diagonal = " + string1);

    }
}
