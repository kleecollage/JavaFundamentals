package files;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AddContent2File {
    public static void main(String[] args) {
        boolean append = false;
        var fileName = "my_file.txt";
        var file = new File(fileName);

        try {
            append = file.exists();
            var output = new PrintWriter(new FileWriter(file, append));
            var newContent = "New\ncontent";
            output.println(newContent);
            output.close();
            System.out.println("File content added");
        } catch (Exception e) {
            System.out.println("Error writing in file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
