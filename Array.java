import java.util.*;

import javax.management.loading.MLet;
public class Array {
    
    public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    String MK [] = {"Pancasila", "KTI","CTPS", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"}; 
    double [] nilai = new double[8];
    String[] huruf = new String[nilai.length];
    double[] bobot = new double[huruf.length];
    int[] bobotSKS = {2,2,2,3,2,2,3,2};
    int jumlahSKS  = 18;
    double semua = 0;



        System.out.println("============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("============================");

        for (int i = 0; i < MK.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK "+ MK[i] + " :");
            nilai[i] = key.nextDouble();
            if (nilai[i] > 80 && nilai[i] <= 100) {
                huruf[i] = "A";
                bobot[i] = 4;
            } else if (nilai[i] > 73 && nilai[i] <= 80) {
                huruf[i] = "B+";
                bobot[i] = 3.5;
            } else if (nilai[i] > 65 && nilai[i] <= 73) {
                huruf[i] = "B";
                bobot[i] = 3;
            } else if (nilai[i] > 60 && nilai[i] <= 65) {
                huruf[i] = "C+";
                bobot[i] = 2.5;
            } else if (nilai[i] > 50 && nilai[i] <= 60) {
                huruf[i] = "C";
                bobot[i] = 2;
            } else if (nilai[i] > 39 && nilai[i] <= 50) {
                huruf[i] = "D";
                bobot[i] = 1;
            } else if (nilai[i] <= 39) {
                huruf[i] = "E";
                bobot[i] = 0;
            } 
        }
        
        for (int i = 0; i < bobot.length; i++) {
            semua += bobot[i] * bobotSKS[i];
        }
        double ips = semua / jumlahSKS;

        System.out.println("=========================================================================================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=========================================================================================================");
        System.out.printf("%-40s %-40s %-40s %-30s \n","MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("=========================================================================================================");
        for (int i = 0; i < MK.length; i++) {
            if (MK[i] != null) {
                System.out.printf("%-40s %-40f %-40s %-30f \n", MK[i], nilai[i], huruf[i], bobot[i]);
            }
        }
        System.out.println("=========================================================================================================");
        System.out.print("IP : " + ips);
        


        
        
    }

}
