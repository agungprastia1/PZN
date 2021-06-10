package polimorphism;

public class Employee {
    public String name;

   public Employee(String name){
        this.name = name;
    }

    public void sayHello(String name){
        System.out.println("Hello "+name+", my name Employee is "+this.name);
    }
}
