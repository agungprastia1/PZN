package app;

import inter.SayHello;

public class SayHelloApp {
    public static void main(String[] args) {
        SayHello sayHello = new SayHello() {
            @Override
            public void sayHello() {
                System.out.println("Hello Agung");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Hello "+name);
            }
        };
        sayHello.sayHello();
        sayHello.sayHello("agung");
    }
}
