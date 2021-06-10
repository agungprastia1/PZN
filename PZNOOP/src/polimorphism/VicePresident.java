package polimorphism;

public class VicePresident extends Employee {
    public String company;
    public VicePresident(String name){
        super(name);
    }
    public void sayHello(String name){
        System.out.println("Hello "+name+", my name Manager is "+this.name);
    }
}
