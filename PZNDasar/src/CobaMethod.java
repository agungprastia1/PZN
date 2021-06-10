public class CobaMethod {
    public static void main(String[] args) {
        sayHelloWorld();
        print("hallo Nama Saya Agung");

        System.out.println(calculator(1, 2));
    }

    static void sayHelloWorld() {
        System.out.println("Hello World");
    }

    static void print(String x) {
        System.out.println(x);
    }

    static int calculator(int a, int b) {
        return a * b;
    }
}
