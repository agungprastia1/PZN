package PZN.Classes;

import java.util.StringJoiner;

/*
    Implementasi String Joiner
 */
public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner =new StringJoiner(", ","[","]");
        joiner.add("Agung");
        joiner.add("Prasetia");
        joiner.add("S.kom");

        String name = joiner.toString();
        System.out.println(name);
    }
}
