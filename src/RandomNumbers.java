import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        var random = new Random();
        // Generate random number between 0 and 9
        var randomNumber = random.nextInt(10);
        System.out.println("randomNumber (0-9) = " + randomNumber);
        // Generate random number between 0 and 10;
        randomNumber = random.nextInt(10) + 1;
        System.out.println("randomNumber (0-10) = " + randomNumber);
        // Generate random float number between 0 and 1;
        var floatRandom = random.nextFloat();
        System.out.println("floatRandom = " + floatRandom);
        // Dice roll (1-6)
        var dice = random.nextInt(6) + 1;
        System.out.println("Dice result = " + dice);
    }
}
