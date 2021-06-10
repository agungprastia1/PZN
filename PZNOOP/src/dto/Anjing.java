package dto;

import abs.Animal;

public class Anjing extends Animal {
    @Override
    public void run() {
        System.out.println(name+ " dog is run");
    }
}
