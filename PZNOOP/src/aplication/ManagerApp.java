package aplication;

import employee.Manager;
import employee.VicePresident;

public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("joko");
        manager.sayHello("Budi");
        System.out.println(manager.name);

        var vicePresident = new VicePresident("dana");
        vicePresident.sayHello("Agung");
        System.out.println(vicePresident.name);
    }
}
