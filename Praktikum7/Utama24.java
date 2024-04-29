package Praktikum.Praktikum7;
import java.util.*;
public class Utama24 {
    public static void main(String[] args) {
        Gudang24 gudang = new Gudang24(7);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih operasi :");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang : ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori : ");
                    String kategori = scanner.nextLine();
                    Barang24 barangbaru = new Barang24(kode, nama, kategori);
                    gudang.tambahbarang(barangbaru);
                    break;
                case 2:
                gudang.ambilbarang();
                break;
                case 3: 
                gudang.tampilkanbarang();
                break;
                case 4:
                break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi");;
            }
        }
    }
}
