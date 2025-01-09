package switch_sentence;

public class switch_sentence.ATM {
    public static void main(String[] args) {
        var console = new java.util.Scanner(System.in);
        var balance = 1000f;
        logout: while (true) {
            System.out.print("""
            \n=====================
            Welcome to the ATM!
            1. Check balance
            2. Withdraw money
            3. Deposit money
            4. Exit
            Enter your choice:\s""");
            var choice = Integer.parseInt(console.nextLine());
            switch (choice) {
                case 1 -> System.out.printf("Your balance is: $%.2f", balance);
                case 2 -> {
                    System.out.print("Enter the amount to withdraw: ");
                    var amount = Float.parseFloat(console.nextLine());
                    if (amount > balance) {
                        System.out.println("Insufficient funds!");
                    } else {
                        balance -= amount;
                        System.out.printf("Your balance is: $%.2f", balance);
                    }
                }
                case 3 -> {
                    System.out.print("Enter the amount to deposit: ");
                    var amount = Float.parseFloat(console.nextLine());
                    balance += amount;
                    System.out.printf("Your balance is: $%.2f", balance);
                }
                case 4 -> {
                    System.out.println("Exiting system");
                    break logout;
                }
            }
        }
    }
}
