public class SwitchStatment {
    public static void main(String[] args) {
        var nilai = "A";
        switch (nilai) {
            case "A":
                System.out.println("Sangat Baik");
                break;
            case "B":
                System.out.println("Baik");
            case "C":
                System.out.println("Cukup");
                break;
            case "D":
                System.out.println("Kurang");
            default:
                System.out.println("Sangat Kurang");
                break;
        }

        switch (nilai) {
            case "A" -> System.out.println("Sangat Baik");
            case "B", "C" -> System.out.println("Cukup baik");
            case "D" -> System.out.println("Kurang");
            default -> {
                System.out.println("Sangat Kurang");
            }
        }

        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Sangat Baik";
            case "B", "C" -> ucapan = "Cukup baik";
            case "D" -> ucapan = "Kurang";
            default -> {
                ucapan = "Sangat Kurang";
            }
        }
        System.out.println(ucapan);

        String wow = switch (nilai) {
            case "A":
                yield "Sangat Baik";
            case "B", "C":
                yield "Cukup baik";
            case "D":
                yield "Kurang";
            default:
                yield "Sangat Kurang";
        };
        System.out.println(wow);
    }
}
