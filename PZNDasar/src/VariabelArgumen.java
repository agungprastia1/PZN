public class VariabelArgumen {
    public static void main(String[] args) {
        int[] nilai = { 80, 90, 75, 60, 50, 90, 100, 70, 80 };
        sayCongrats("Agung", nilai);
        sayCongrats("Prastia", 90, 100, 80, 10, 20, 30);
    }

    static void sayCongrats(String name, int... args) {
        var nilai = 0;

        for (int i : args) {
            nilai += i;
        }

        var finalValue = nilai / args.length;
        System.out.println(nilai);
        System.out.println(finalValue);

        String say = finalValue >= 75 ? "Selamat " + name + ", anda lulus" : "Maaf " + name + ", anda gagal";
        System.out.println(say);
    }
}
