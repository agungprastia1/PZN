package app;

import dto.Customer;
import en.Level;
/*
    Implementasi Enum costumer
 */
public class CostumerApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Agung");
        customer.setLevel(Level.PREMIUM);
        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
    }
}
