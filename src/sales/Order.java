package sales;

import java.util.Arrays;

public class Order {
    private final int ID_ORDER;
    private Product[] products;
    private int counterProducts;
    private int quantity;
    private static final int MAX_QUANTITY = 10;
    private static int counterOrders;

    public Order() {
        this.ID_ORDER = ++Order.counterOrders;
        this.products = new Product[MAX_QUANTITY];
    }

    public void addProduct(Product product) {
        if (this.counterProducts < Order.MAX_QUANTITY) {
            this.products[this.counterProducts++] = product;
        } else {
            System.out.println("The order is full.");
        }
    }

    public double calculateTotal() {
        double total = 0.0;
        for (var i = 0; i < this.counterProducts; i++) {
            var product = this.products[i];
            total += product.getPriceProduct();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(("Order Id: " + this.ID_ORDER + "\n"));
        var totalOrder = this.calculateTotal();
        result.append("Total: ").append(totalOrder).append("\n");
        result.append("Products:" + "\n");
        for (var i = 0; i < this.counterProducts; i++)
            result.append("\t\t").append(this.products[i]).append("\n");

        return result.toString();
    }

//    public void showOrder() {
//        System.out.println("Order Id: " + this.ID_ORDER);
//        var totalOrder = this.calculateTotal();
//        System.out.printf("Total: $%.2f", totalOrder);
//        System.out.println("Products:");
//        for (var i = 0; i < this.counterProducts; i++) {
//            System.out.println("\t\t" + this.products[i]);
//        }
//    }
}
















