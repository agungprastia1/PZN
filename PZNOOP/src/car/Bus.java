package car;

import inter.Car;

public class Bus implements Car {
    public void drive() {
        System.out.println("Bus Sekolah");
    }

    public int getTire() {
        return 8;
    }

    public boolean isBig() {
        return true;
    }
}
