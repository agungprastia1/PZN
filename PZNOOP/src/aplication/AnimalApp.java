package aplication;

import animal.Animal;
import animal.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.name = "puss";
        cat.run();
    }
}
