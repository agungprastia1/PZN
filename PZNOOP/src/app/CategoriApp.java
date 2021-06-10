package app;

import dto.Categori;

/*
    implementasi categoris
 */
public class CategoriApp {
    public static void main(String[] args) {
        Categori categori = new Categori();
        categori.setId("wo");
        categori.setExpensive(false);

        System.out.println(categori.getId());
        System.out.println(categori.isExpensive());
    }
}
