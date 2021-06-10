package polimorphism;

public class Manager extends Employee{
   public  String company;

    public Manager(String name){
        super(name);
    }

    public void sayHello(String name){
        System.out.println("Hello "+name+", my name Manager is "+this.name);
    }


}
