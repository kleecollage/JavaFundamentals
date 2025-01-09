import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Monday");
        myList.add("Tuesday");
        myList.add("Wednesday");
        myList.add("Thursday");
        myList.add("Friday");
        myList.add("Saturday");
        myList.add("Sunday");
        myList.add("Monday");

        for (String item : myList) {
            System.out.println(item);
        }

        // LAMBDA FUNCTIONS
        myList.forEach(item -> System.out.println("Day: " + item));

        myList.forEach(System.out::println);

        // List<String> names = arrays.Arrays.asList("John", "Jane", "James")

    }
}
