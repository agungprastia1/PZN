package PZN.Classes;

import java.util.StringTokenizer;

/*
    implementasi tokenizer
 */
public class StringTokenizerApp {
    public static void main(String[] args) {
        var name = "Agung Prasetia S.kom";

        StringTokenizer token = new StringTokenizer(name," ");

        while (token.hasMoreTokens()){
            String result = token.nextToken();
            System.out.println(result);
        }
    }

}
