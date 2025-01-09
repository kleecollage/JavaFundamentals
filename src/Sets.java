import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("C");
        set.add("C#");
        set.add("JavaScript");
        set.add("Java"); // duplicated entries are not allowed
        set.forEach(System.out::println);
        // Remove element
        set.remove("C");
        System.out.println("\nNew set elements:");
        set.forEach(System.out::println);
    }
}
