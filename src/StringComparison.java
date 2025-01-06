public class StringComparison {
    public static void main(String[] args) {
        // String Comparison (pool String)
        var string1 = "Java";
        var string2 = "Java";
        var string3 = new String("Java");
        // Compare reference with '=='
        System.out.println("String1 is equal to String2 reference? ");
        System.out.println(string1 == string2);
        System.out.println("String1 is equal to String3 reference? ");
        System.out.println(string1 == string3);
        // Compare content with 'equals'
        System.out.println("String1 content is equal to String3 content? ");
        System.out.println(string1.equals(string3));
    }
}
