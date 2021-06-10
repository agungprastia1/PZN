package app;

import dto.City;

/*
    implementasi inheritance
 */
public class CityApp {
    public static void main(String[] args) {
        var city = new City();
        city.prov = "jkaardah";
        city.kab = "bekasi";
        city.kec = "jakpus";

        System.out.println(city.prov);
        System.out.println(city.kec);
        System.out.println(city.kab);
    }
}
