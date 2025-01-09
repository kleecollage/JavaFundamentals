package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {
        var fileName = "my_file.txt";
        var file = new File(fileName);
        try {
            System.out.println("File content: ");
            // OPEN FILE FOR READING
            var entrance = new BufferedReader(new FileReader(file));
            // READ LINE TO LINE
            var line = entrance.readLine();
            // READ ALL LINES
            while (line != null) {
                System.out.println(line);
                // MOVE NEXT LINE
                line = entrance.readLine();
            }
            // CLOSE FILE
            entrance.close();
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
