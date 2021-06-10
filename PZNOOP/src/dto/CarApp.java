package dto;

import inter.Car;

/*
    implementasi interface
 */
public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        car.drive();
        System.out.println(car.getTire());
        System.out.println(car.isBig());
        System.out.println(car.getBrand());
        System.out.println(car.isMaintenance());

        car = new Bus();
        car.drive();
        System.out.println(car.getTire());
        System.out.println(car.isBig());
        System.out.println(car.getBrand());
        System.out.println(car.isMaintenance());
    }
}
