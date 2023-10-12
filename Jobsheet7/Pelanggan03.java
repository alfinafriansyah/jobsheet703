package Jobsheet7;

import java.util.Scanner;

public class Pelanggan03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama;
        char jawab;
        int jml = 0;
        do {
            System.out.print("Masukkan nama pelanggan: ");
            nama = sc.nextLine();
            jml++;
            System.out.print("Apakah anda ingin memasukkan nama pelanggan baru (y/t)? ");
            jawab = sc.nextLine().charAt(0);
        } while (jawab == 'y' || jawab == 'Y');
        System.out.println("Jumlah pelanggan yang anda masukkan = " + jml);
    }
}
