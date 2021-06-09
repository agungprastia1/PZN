package aplication;

import location.City;

public class LocationApp {
    public static void main(String[] args) {
        var city = new City();
        city.kota = "Jakarta";
        city.kab = "kota baru";
        city.kec = "tawamangu";

        System.out.println(city.kota);
        System.out.println(city.kab);
        System.out.println(city.kec);

    }

}
