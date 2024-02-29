package Praktikum.Praktikum3;

import java.util.*;


class Mahasiswa {
String nama;
int nim;
String kelamin;
double ip;
    
    public void tampilmhs(){
        System.out.println("nama : "+nama);
        System.out.println("nim : "+nim);
        System.out.println("jenis kelamin : "+kelamin);
        System.out.println("Nilai IPK : "+ip);
    }
    public void hitung(Mahasiswa[] mhs){
        double total = 0;
        for (int i = 0; i < mhs.length; i++) {
            total += mhs[i].ip;
        }
        double rata2 = total /mhs.length;
        System.out.println("Rata-rata IPK  : "+ rata2 );
    }

    public void IPKtertinggi(Mahasiswa [] mhs){
        double target = mhs[0].ip;
        int index = 0;
        for (int i = 0; i < mhs.length; i++) {
            if (mhs[i].ip > target) {
                target = mhs[i].ip;
                index = i;
            }
        }
    System.out.println("Mahasiswa dengan IPK tertinggi: "+mhs[index].nama);
    System.out.println("NIM: "+mhs[index].nim);
    System.out.println("IPK: "+mhs[index].ip);
    System.out.println("Jenis Kelamin: "+mhs[index].kelamin);
    }

}

public class Latihan2 {
    
    public static void main(String[] args) {
        Mahasiswa[] mhs = new Mahasiswa[3];
        Scanner key = new Scanner(System.in);

        for (int i = 0; i < mhs.length; i++) {
            mhs[i] = new Mahasiswa();
            int urutan = i +1;
            System.out.println("Masukkan data mahasiswa ke-"+urutan);
            System.out.print("Masukkan nama : ");
            mhs[i].nama = key.nextLine();
            System.out.print("Masukkan nim : ");
            mhs[i].nim = key.nextInt();
            key.nextLine(); 
            System.out.print("Masukkan jenis kelamin (L/P) : ");
            mhs[i].kelamin = key.nextLine();
            System.out.print("Masukkan IPK : ");
            mhs[i].ip = key.nextDouble();
            key.nextLine();
        }

        for (int i = 0; i < mhs.length; i++) {
            int urutan = i + 1;
            System.out.println("Data mahasiswa ke-"+urutan);
            mhs[i].tampilmhs();
        }
        mhs[0].hitung(mhs);
        mhs[0].IPKtertinggi(mhs);
    }

}
