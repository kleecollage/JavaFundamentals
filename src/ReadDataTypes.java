import java.util.Scanner;

public class ReadDataTypes {
    public static void main(String[] args) {
        // Reading int type
        var console = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = console.nextInt();
        System.out.println("age = " + age);
        // Read double type
        System.out.print("Enter your height: ");
        var height = console.nextDouble();
        System.out.println("height = " + height);
        // end line consumption
        console.nextLine();
        // Read string type:
        System.out.print("Enter your name: ");
        var name = console.nextLine();
        System.out.println("name = " + name);
        // Data conversion
        System.out.print("Enter a integer value: ");
        var intString = console.nextLine();
        var integer = Integer.parseInt(intString);
        System.out.println("integer = " + integer);
        // Float type
        System.out.print("Enter a float value: ");
        var floatValue = Float.parseFloat(console.nextLine());
        System.out.println("floatValue = " + floatValue);
    }
}
