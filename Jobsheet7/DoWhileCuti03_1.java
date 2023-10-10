package Jobsheet7;

import java.util.Scanner;

public class DoWhileCuti03_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = sc.nextInt();

        do{
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")){
                System.out.print("Jumlah hari: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti){
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                }else if (jatahCuti == 0){
                    break;
                }
                else{
                    System.out.println("Sisa jatah cuti anda tidak mencukupi. Sisa jatah cuti anda: " + jatahCuti);
                }
            }
        }while (jatahCuti > 0);
    }
}
