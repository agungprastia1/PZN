package app;

import polimorphism.Employee;
import polimorphism.Manager;
import polimorphism.VicePresident;

/*
    penerapan polimorphism
    mengimplementasi employee, vp, manager
 */
public class EmployeeApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Agung");
        employee.sayHello("budi");

        employee  = new VicePresident("dini");
        employee.sayHello("budi");

        employee = new Manager("danang");
        employee.sayHello("budi");

        sayHello(new Employee("Agung"));
        sayHello(new VicePresident("dini"));
        sayHello(new Manager("wawa"));
    }

/*
    instantiateof merubah/mambuat class
    mirip dengan polimorphism
 */

    static void sayHello(Employee employee){
        if (employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager "+manager.name);
        }else if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " +vicePresident.name);
        }else{
            System.out.println("Hello Employee "+employee.name);
        }
    }
}
