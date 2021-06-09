package people;

public class Person {
    String name, address;

    public Person(String name, String addres) {
        this.name = name;
        this.address = addres;
    }

    public Person(String name) {
        this(name, null);
    }

    public Person() {
        this(null);
    }

    public void sayHello(String name) {
        System.out.println("Hello " + name + " Nama Saya " + this.name + " Saya tinggal di " + address);
    }

    public void sayGoodbye() {
    }

}
