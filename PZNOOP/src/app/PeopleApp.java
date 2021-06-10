package app;

import dto.People;

/*
    implementasi People
 */
public class PeopleApp {
    public static void main(String[] args) {
        People people = new People("Agung","jakarta");
        people.sayHello("budi");

        People people1 = new People("yaya");
        people1.sayHello("dini");
    }
}
