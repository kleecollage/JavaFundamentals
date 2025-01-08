import java.util.Scanner;

public class GradePointAverage {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        System.out.print("How many students attended? ");
        var numberOfStudents = console.nextInt();
        var totalPoints = 0.0;
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the points for student " + (i + 1) + ": ");
            var points = console.nextFloat();
            totalPoints += points;
        }
        var average = totalPoints / numberOfStudents;
        System.out.printf("The average is: %.2f", average);
    }
}
