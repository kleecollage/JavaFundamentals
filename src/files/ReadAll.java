package files;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadAll {
    public static void main(String[] args) {
        var fileName = "my_file.txt";
        try {
            // READ ALL LINES IN THE FILE
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            System.out.println("File content: ");
            lines.forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
