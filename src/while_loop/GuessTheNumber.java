package while_loop;

public class GuessTheNumber {
    public static void main(String[] args) {
        var console = new java.util.Scanner(System.in);
        var random = new java.util.Random();
        var number = random.nextInt(100) + 1;
        var guess = 0;
        var attempts = 0;
        System.out.println("Guess the number!");
        while (guess != number && attempts != 5) {
            System.out.print("Guess a number between 0 and 100: ");
            guess = Integer.parseInt(console.nextLine());
            if (guess > number) {
                System.out.println("Too high!");
            } else if (guess < number) {
                System.out.println("Too low!" + number);
            }
            attempts++;
        }
        if (attempts > 5) {
            System.out.println("You lost!");
            System.out.println("The number was: " + number);
        } else {
            System.out.println("You guessed the number!");
            System.out.println("The number was: " + number);
            System.out.println("You took " + attempts + " attempts!");
        }
    }
}
