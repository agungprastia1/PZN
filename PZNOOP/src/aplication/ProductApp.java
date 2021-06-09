package aplication;

import toString.Product;

public class ProductApp {
    public static void main(String[] args) {
        var product = new Product("Hp", "2000");
        product.name = "bujang";
        product.product = "1000";
        System.out.println(product.name);
        System.out.println(product.product);
        System.out.println(product);
    }
}
