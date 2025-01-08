public class AuthSystem {
    public static void main(String[] args) {
        var console = new java.util.Scanner(System.in);
        final String USERNAME = "admin";
        final String PASSWORD = "***";

        System.out.print("Enter username: ");
        var username = console.nextLine();

        System.out.print("Enter password: ");
        var password = console.nextLine();

        var message = switch (username) {
            case USERNAME -> {
                if (password.equals(PASSWORD))
                    yield "Welcome!";
                else
                    yield "Wrong password!";
            }
            default  -> {
                if (PASSWORD.equals(password)) {
                    yield "Wrong username!";
                } else {
                    yield "Username and Password don't match";
                }
            }
        };
        System.out.println(message);
    }
}
