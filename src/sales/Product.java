package sales;

public class Product {
    private int idProduct;
    private String nameProduct;
    private double priceProduct;
    private static int counterProducts;

    public Product(String nameProduct, double priceProduct) {
        this.idProduct = ++Product.counterProducts;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public int getIdProduct() {
        return this.idProduct;
    }

    public String getNameProduct() {
        return this.nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + this.idProduct +
                ", nameProduct='" + this.nameProduct + '\'' +
                ", priceProduct=" + this.priceProduct +
                '}';
    }
}


