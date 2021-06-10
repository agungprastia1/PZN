package dto;

import inter.Car;

/*
    implementasi implement
 */
public class Bus implements Car {
    @Override
    public void drive() {
        System.out.println("Levi Is Driving");
    }

    @Override
    public int getTire() {
        return 8;
    }

    @Override
    public String getBrand() {
        return "Izuzu";
    }

    @Override
    public Boolean isMaintenance() {
        return true;
    }
}
