package sales;

public class SalesTest {
    public static void main(String[] args) {
        var product1 = new Product("Shirt", 32.51);
        // System.out.println("product1 = " + product1);
        var product2 = new Product("Jeans", 29.99);
        // System.out.println("product2 = " + product2);

        var order1 = new Order();
        order1.addProduct(product1);
        order1.addProduct(product2);
        System.out.println(order1);

        var order2 = new Order();
        order2.addProduct(new Product("Jacket", 36.51));
        order2.addProduct(product1);
        order2.addProduct(product2);
        System.out.println(order2);
    }
}
