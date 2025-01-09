import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> person = new HashMap<>();
        System.out.println("Map Values:");
        person.put("name", "John" );
        person.put("lastname", "Doe");
        person.put("age", "25");
        // person.put("age", "31"); // no duplicates allowed
        person.entrySet().forEach(System.out::println);

        System.out.println("\nNew Map Values:");
        person.remove("lastname");
        person.put("age", "31");
        person.entrySet().forEach(System.out::println);

        // Iterating over the values
        person.forEach((key, value) -> {
            System.out.println("KEY " + key + ": " +  "VALUE " +value);
        });
    }
}
