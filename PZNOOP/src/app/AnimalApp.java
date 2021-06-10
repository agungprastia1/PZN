package app;

import abs.Animal;
import dto.Anjing;
import dto.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.name = "agung"; //set nama dari animal.
        cat.run();

        Animal anjing = new Anjing();
        anjing.name = "lezy";
        anjing.run();
    }
}
