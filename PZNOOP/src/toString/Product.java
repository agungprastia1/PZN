package toString;

public class Product {
    public String name, product;

    public Product(String name, String product) {
        this.name = name;
        this.product = product;
    }

    public String toString() {
        return "nama " + name + ", Price " + product;
    }
}
