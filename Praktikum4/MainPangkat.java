package Praktikum.Praktikum4;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===================");
        System.out.println("Masukkan jumlah elemen : ");
        int elemen = input.nextInt();

        pangkat[] png = new pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new pangkat();
            System.out.println("Masukkan nilai yang dipangkatkan: ");
            int anilai = input.nextInt();
            png[i].nilai = anilai;
            input.nextLine();
            System.out.println("Masukkan nilai pangkat: ");
            int apangkat = input.nextInt();
            png[i].pangkat = apangkat;
            input.nextLine();
        }

        System.out.println("Pilih \n 1. Brute Force \n 2. Divide Conquer");
        int pilih = input.nextInt();
        input.nextLine();

        switch (pilih) {
            case 1:
                System.out.println("HASIL PANGKAT - BRUTE FORCE");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " +
                            png[i].nilai + " pangkat " +
                            png[i].pangkat + " adalah " +
                            png[i].PangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("HASIL PANGKAT - DEVIDE AND CONQUER");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " +
                            png[i].nilai + " pangkat " +
                            png[i].pangkat + " adalah " +
                            png[i].PangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;

            default:
                break;
        }

     
    }
}
