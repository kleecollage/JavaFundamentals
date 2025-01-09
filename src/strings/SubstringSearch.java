package strings;

public class SubstringSearch {
    public static void main(String[] args) {
        var string1 = "Hello World";
        // substring to search: 'Hello'
        var index1 = string1.indexOf("Hello");
        System.out.println("index1 = " + index1);
        // 'lastIndexOf': Retrieves the last substring appearance
        // substring of 'World'
        var index2 = string1.lastIndexOf("World");
        System.out.println( "index2 = " + index2);
        // no substring find, then, -1
        var index3 = string1.indexOf("Java");
        System.out.println("index3 = " + index3);
    }
}
