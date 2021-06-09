package aplication;

import categori.Categori;

public class CategoriApp {
    public static void main(String[] args) {
        var categori = new Categori();
        categori.setId("wawa");
        categori.isExpensive();
        System.out.println(categori.getId());
        System.out.println(categori.isExpensive());
    }

}
