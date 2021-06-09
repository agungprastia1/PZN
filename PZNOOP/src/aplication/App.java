package aplication;

import people.Person;

public class App {
    public static void main(String[] args) throws Exception {

        var person1 = new Person("Budi", "Jakarta");
        var person2 = new Person("Budi");
        var person3 = new Person();

        person1.sayHello("Agung");
        person2.sayHello("jono");
        person3.sayHello("tono");
    }
}
