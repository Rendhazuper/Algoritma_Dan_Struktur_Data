package Praktikum.Praktikum6;

import Praktikum.Praktikum4.pangkat;

/**
 * InnerTestSearching
 */
class buku24 {
    String kodeBuku, judulBuku, pengarang;;
    int tahunTerbit, stok;

    buku24(String kode, String judul, int tahun, String pengarang, int stok) {
        this.kodeBuku = kode;
        this.judulBuku = judul;
        this.tahunTerbit = tahun;
        this.pengarang = pengarang;
        this.stok = stok;
    }

    void tampilDataBuku() {
        System.out.println("=============================");
        System.out.println("Kode Buku : " + this.kodeBuku);
        System.out.println("Judul Buku : " + this.judulBuku);
        System.out.println("Tahun terbit : " + this.tahunTerbit);
        System.out.println("Pengarang : " + this.pengarang);
        System.out.println("Stok : " + this.stok);
    }
    
    void tampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " ditemukan pada index " + pos);
        } else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }
}