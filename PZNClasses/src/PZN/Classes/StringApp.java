package PZN.Classes;

public class StringApp {
    public static void main(String[] args) {
        var name = "Agung Prasetia";
        var nameLower = name.toLowerCase();
        var nameUpper = name.toUpperCase();

        String[] names = name.split(" ");

        for (var value:names) {
            System.out.print(value);
        }

        System.out.println(name);
        System.out.println(nameLower);
        System.out.println(nameUpper);
        System.out.println(nameUpper.length());

        char[] coba = name.toCharArray();
        for (var value :
                coba) {
            System.out.println(value);
        }
    }
}
