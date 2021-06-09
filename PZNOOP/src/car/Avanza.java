package car;

import inter.Car;

public class Avanza implements Car {
    public void drive() {
        System.out.println("Drive Avanza");
    }

    public int getTire() {
        return 4;
    }
}
