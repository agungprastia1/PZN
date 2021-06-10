package app;

import dto.Product;

public class ProductApp {
    public static void main(String[] args) {
        var product = new Product("banana",10);
        System.out.println(product.toString());

        var product2 = new Product("banana",10);
        System.out.println(product2.toString());

        System.out.println(product.equals(product2));
        System.out.println(product.hashCode()==product2.hashCode());

    }
}
