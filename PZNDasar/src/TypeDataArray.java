public class TypeDataArray {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Agung";
        arrayString[1] = "Prasetia";
        arrayString[2] = "S.Kom";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        arrayString[0] = "bejo";
        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        int loop = 3000;

        String[] akulala = new String[loop];
        for (int i = 0; i <= loop; i++) {
            System.out.println(akulala[i] = "Aku Lala Padamu dek " + i + " X");
        }

        int[] intArray = { 10, 20, 30 };
        System.out.println(intArray[0]);
    }
}
