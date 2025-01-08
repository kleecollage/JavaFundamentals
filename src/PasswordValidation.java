public class PasswordValidation {
    public static void main(String[] args) {
        var console = new java.util.Scanner(System.in);

        System.out.println("Enter your password: ");
        var password = console.nextLine();

        while (password.length() < 6) {
            System.out.println("Password must be at least 6 characters long!");
            System.out.println("Enter your password: ");
            password = System.console().readLine();
        }
        System.out.println("Password is valid: " + password.matches("\\w{6,}"));
    }
}
