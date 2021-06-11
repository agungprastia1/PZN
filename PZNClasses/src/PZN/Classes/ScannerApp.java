package PZN.Classes;

import java.util.Scanner;

/*
    implementasi scanner
    melakukan i/o melalui terminal
 */
public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama : ");
        var name = scanner.nextLine();
        System.out.print("Umur : ");
        var age = scanner.nextInt();
        System.out.print("No Rumah : ");
        var alamat = scanner.nextInt();

        System.out.println("Nama = "+name);
        System.out.println("Umur = "+age);
        System.out.println("Alamat = "+alamat);
    }
}
