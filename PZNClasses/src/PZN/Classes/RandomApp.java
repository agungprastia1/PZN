package PZN.Classes;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {
        Random random = new Random();
        for (var i=0;i<100000;i++){
            var vaalue = random.nextInt(1000);
            System.out.println(vaalue);
        }
    }
}
