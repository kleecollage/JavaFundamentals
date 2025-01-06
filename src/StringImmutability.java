public class StringImmutability {
    public static void main(String[] args) {
        var string1 = "Hello";
        System.out.println("string1 = " + string1);
        var string2 = string1;
        string1 = "Bye";
        System.out.println("string1 modify = " + string1);
        System.out.println("string2 = " + string2);
    }
}
