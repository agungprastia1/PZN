package employee;

public class Manager extends Employee {
    String company;

    public Manager(String name) {
        super(name);
    }

    public void sayHello(String name) {
        System.out.println("Hello " + name + ", My name Manager is " + this.name);
    }
}
