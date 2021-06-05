public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 75;
        String ucapan;

        if (nilai >= 75) {
            ucapan = "selamat anda lulus";
        } else {
            ucapan = "maaf anda gagal";
        }
        System.out.println(ucapan);

        String wowo = nilai >= 77 ? "selamat Anda Lulus" : "anda Gagal";

        System.out.println(wowo);
    }

}
