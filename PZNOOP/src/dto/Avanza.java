package dto;

import inter.Car;

/*
    implemen interface
 */
public class Avanza implements Car {
    @Override
    public void drive() {
        System.out.println("Agung is driveing");
    }

    @Override
    public int getTire() {
        return 4;
    }

    @Override
    public String getBrand() {
        return "Toyota";
    }

    @Override
    public Boolean isMaintenance() {
        return false;
    }
}
