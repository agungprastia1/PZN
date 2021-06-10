package dto;

import abs.Animal;

/*
    implementasi abstract animal
 */
public class Cat extends Animal {

    @Override
    public void run() {
        System.out.println( "Cat is "+name+" run");
    }
}
