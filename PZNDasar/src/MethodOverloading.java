public class MethodOverloading {
    public static void main(String[] args) {
        syaHello("agung");
        syaHello();
        syaHello("agung", "Prasetia");
    }

    static void syaHello() {
        System.out.println("Hello");
    }

    static void syaHello(String firstName) {
        System.out.println("Hello " + firstName);
    }

    static void syaHello(String firstName, String LastName) {
        System.out.println("Hello " + firstName + " " + LastName);
    }
}
