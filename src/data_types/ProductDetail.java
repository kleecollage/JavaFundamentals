package data_types;

public class ProductDetail {
    public static void main(String[] args) {
        String nameProduct = "Laptop";
        float priceProduct = 1000.50f;
        int stockProduct = 10;
        boolean isAvailable = true;

        System.out.println("nameProduct = " + nameProduct);
        System.out.println("priceProduct = " + priceProduct);
        System.out.println("stockProduct = " + stockProduct);
        System.out.println("isAvailable = " + isAvailable);

        nameProduct = "Camera";
        priceProduct = 685.25f;
        stockProduct = 0;
        isAvailable = false;
        System.out.println(" ---------------------------------------- ");
        System.out.println("nameProduct = " + nameProduct);
        System.out.println("priceProduct = " + priceProduct);
        System.out.println("stockProduct = " + stockProduct);
        System.out.println("isAvailable = " + isAvailable);
    }
}
