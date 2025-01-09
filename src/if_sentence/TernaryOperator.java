package if_sentence;

public class TernaryOperator {
    public static void main(String[] args) {
        // EVEN / ODD
        var number = 4;
        var result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number " + number + " Is " + result);

        // CAN VOTE?
        var age = 17;
        var message = (age >= 18) ? "You can vote" : "You can't vote";
        System.out.println("You have " + age + " years. " + message);

        // POSITIVE, NEGATIVE OR ZERO
        number = 0;
        result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        System.out.println("The number " + number + " is " + result);
    }
}
