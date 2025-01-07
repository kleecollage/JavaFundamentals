import java.util.Scanner;

public class OnlineStore {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        final int MINIMUM_PURCHASE = 1000;
        System.out.println("How much did you spend? ");
        var purchase = Float.parseFloat(console.nextLine());
        System.out.println("Do you have a membership? (true/false) ");
        var hasMembership = Boolean.parseBoolean(console.nextLine());

        if (purchase >= MINIMUM_PURCHASE && hasMembership) {
            var total = purchase - (purchase * 0.1);
            System.out.printf("""
                    You can have a discount of 10%%!
                    Total: %.2f
                    With Discount: %.2f
                    """, purchase, total);
        } else if (purchase >= MINIMUM_PURCHASE || hasMembership) {
            var total = purchase - (purchase * 0.05);
            System.out.printf("""
                    You can have a discount of 5%%!
                    Total: %.2f
                    With Discount: %.2f
                    """, purchase, total);
        } else {
            System.out.printf("""
                    There are no discounts available
                    Total: %.2f
                    """, purchase);
        }
    }
}
