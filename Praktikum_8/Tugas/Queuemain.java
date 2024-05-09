package Praktikum.Praktikum_8.Tugas;

import java.util.Scanner;

import Praktikum.Praktikum_8.Praktikum2.Nasabah;

/**
 * Queuemain
 */
public class Queuemain {

      public static void menu(){
        System.out.println("Piilih Menu: ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Antrian Belakang");
        System.out.println("5. Cek Posisi Antrian");
        System.out.println("6. Cek Daftar Pembeli");
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int pilih;
        
    System.out.println("Masukkan kapasistas Queue");
    int jumlah = sc.nextInt();
    Pembeli main = new Pembeli(jumlah);
    do {
        menu();
        pilih = sc.nextInt();
        sc.nextLine();
        switch (pilih) {
            case 1:
                System.out.print("Nama : ");
                String Nama = sc.nextLine();
                System.out.print("noHP : ");
                int noHP = sc.nextInt();
                Pembeli dt  = new Pembeli (Nama, noHP);
                sc.nextLine();
                main.Enqueue(dt);
                break;
            case 2:
            Pembeli antrian = main.Dequeue();
            if (!"".equals(antrian.nama) && antrian.noHP != 0)  {
            System.out.println("Antrian yang keluar: " + antrian.nama + " "+ antrian.noHP);
                break;
            }
            case 3: 
            main.peek();
            break;
            case 4:
            main.peekrear();
            case 5:
            System.out.print("Masukkan nama :" );
            String inputnm = sc.nextLine(); 
            main.peekposition(inputnm);
            break;
            case 6:
            main.Daftarpembeli();
            break;

        }
    } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6); 
}
    
}