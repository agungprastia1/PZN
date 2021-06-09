package aplication;

import car.Avanza;
import car.Bus;
import inter.Car;
import car.Avanza;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTire());

        car = new Bus();
        System.out.println(car.getTire());
        car.drive();
        car.drive();
    }

}
