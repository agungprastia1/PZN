package PZN.Classes;

import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        var name = "Agung Prasetia S.kom";
        String encode = Base64.getEncoder().encodeToString(name.getBytes());

        System.out.println(encode);

        byte[] decode = Base64.getDecoder().decode(encode);
        System.out.println(decode);

        String result = new String(decode);
        System.out.println(result);

    }
}
