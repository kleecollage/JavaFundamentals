package files;

import java.io.File; // io = input-output
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFile {
    public static void main(String[] args) {
        var fileName = "my_file.txt";
        var file = new File(fileName);

        try {
            if(file.exists())
                System.out.println("File already exists");
            else {
                var out = new PrintWriter(new FileWriter(file));
                out.close(); // with close() method the file is saved1
                System.out.println("File created");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
