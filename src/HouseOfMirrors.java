public class HouseOfMirrors {
    public static void main(String[] args) {
        var console = new java.util.Scanner(System.in);

        System.out.println("Whats your age?");
        var age = Integer.parseInt(console.nextLine());

        System.out.println("Are you afraid of darkness? (true/false) ");
        var isAfraid = Boolean.parseBoolean(console.nextLine());

        if (age >= 10 && !isAfraid) {
            System.out.println("You can visit the house of mirrors!");
        } else {
            System.out.println("You can't visit the house of mirrors!");
        }
    }
}
