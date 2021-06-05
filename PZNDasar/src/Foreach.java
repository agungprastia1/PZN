public class Foreach {
    public static void main(String[] args) {
        String[] agung = { "agung", "Prasetia", "S.kom" };

        // for (int i = 0; i <= agung.length; i++) {
        // System.out.println(agung[i]);
        // }

        for (String name : agung) {
            System.out.println(name);
        }
    }
}
