package aplication;

import employee.*;

public class Polimorphism {
    public static void main(String[] args) {
        Employee employee = new Employee("Agung");
        employee.sayHello("budi");

        employee = new Manager("joko");
        employee.sayHello("budi");

        employee = new VicePresident("joni");
        employee.sayHello("budi");

        sayHello(new Employee("Agung"));
        sayHello(new VicePresident("Joko"));
        sayHello(new Manager("Jono"));

    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello vp " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
