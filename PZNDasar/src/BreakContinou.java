public class BreakContinou {
    public static void main(String[] args) {
        var counter = 1;
        while (true) {
            System.out.println("perulangan Ke- " + counter);
            counter++;
            if (counter > 10) {
                break;
            }
        }
    }
}
