package PZN.Classes;

/*
    Implementasi String Builder
 */
public class StringBuilderApp {
    public static void main(String[] args) {
        String name = "agung";
        name += " "+ "Kurniawan";
        name += " "+"S.kom";

        System.out.println(name);

        StringBuilder builder = new StringBuilder();
        builder.append("agung");
        builder.append(" ");
        builder.append("prasetia");
        builder.append(" ");
        builder.append("s.kom");

        String nameBuilder = builder.toString();
        System.out.println(nameBuilder);
    }
}
