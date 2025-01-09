package if_sentence;

public class BankingSystem {
    public static void main(String[] args) {
        var console = new java.util.Scanner(System.in);
        System.out.print("Do you want to logout the system? (true/false) ");
        var logout = Boolean.parseBoolean(console.nextLine());

        if (!logout) {
            System.out.println("Continue on system");
        } else {
            System.out.println("Exiting system");
        }
    }
}
