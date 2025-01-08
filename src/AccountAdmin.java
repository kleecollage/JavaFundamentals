public class AccountAdmin {
    public static void main(String[] args) {
        var console = new java.util.Scanner(System.in);
        var logout = false;

        while (!logout) {
            System.out.println("""
                    Select an option from the list
                    1. Crete account
                    2. Delete account
                    3. Logout""");
            var option = console.nextInt();
            switch (option) {
                case 1 -> System.out.println("Creating account");
                case 2 -> System.out.println("Deleting account");
                case 3 -> {
                    System.out.println("Logging out");
                    logout = true;
                }
                default -> System.out.println("Invalid option");
            }
        }
        System.out.println("Exiting system");
    }
}
