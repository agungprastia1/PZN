package PZN.Classes;

import java.util.UUID;

public class UUIDApp {
    public static void main(String[] args) {
        for (int i=0;i<1000;i++){
            UUID uuid = UUID.randomUUID();
            System.out.println("uuid ke "+i+" "+uuid.toString());
        }
    }
}
