public class HotelReservations {
    public static void main(String[] args) {
        var console = new java.util.Scanner(System.in);

        System.out.print("Client name: ");
        var clientName = console.nextLine();

        System.out.print("Length of stay: ");
        var stayLength = Integer.parseInt(console.nextLine());

        System.out.print("Room with sea vue? (true/false) ");
        var hasSeaVue = Boolean.parseBoolean(console.nextLine());
        var price =  hasSeaVue ? 190.50 : 150.50;

        var totalPrice = stayLength * price;
        System.out.printf("""
                ---------------------
                Client: %s
                Room length: %d
                Sea vue: %b
                Total price: $%.2f
                ---------------------
                """, clientName, stayLength, hasSeaVue, totalPrice);


    }
}
