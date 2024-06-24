package Praktikum.Praktikum13;
import java.util.*;

public class GraphMain24 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n");
        Graph24 gdg = new Graph24(6);

        int pil = -1;
        while (pil != 0) {
            System.out.println("Menu");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Update Jarak");
            System.out.println("7. Hitung Edge (dalam graph)");
            System.out.print("Masukkan Nomor Menu : ");
            pil = input.nextInt();
            input.nextLine();

            switch (pil) {
                case 1:
                    System.out.print("Masukkan Asal : ");
                    int asal = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan Tujuan : ");
                    int tujuan = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan Jarak : ");
                    int jarak = input.nextInt();
                    input.nextLine();
                 gdg.addEdge(asal, tujuan, jarak);
                    break;

                case 2:
                    System.out.print("Masukkan Asal : ");
                    asal = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan Tujuan : ");
                    tujuan = input.nextInt();
                    input.nextLine();
                 gdg.remEdge(asal, tujuan);
                    break;

                case 3:
                    System.out.print("Masukkan Asal : ");
                     asal = input.nextInt();
                    input.nextLine();
                    gdg.degree(asal);
                    break;

                case 4:
                 gdg.printGraph();
                    break;

                case 5:
                System.out.print("Masukkan gedung asal: ");
                asal = input.nextInt();
                System.out.print("Masukkan gedung tujuan: ");
                 tujuan = input.nextInt();
                if (gdg.isPath(asal, tujuan)) {
                    System.out.println("Hasil: Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan) + " bertetangga");
                } else {
                    System.out.println("Hasil: Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan) + " tidak bertetangga");
                }
                break;

                case 6:
                    System.out.print("Masukkan Asal : ");
                    asal = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan Tujuan : ");
                    tujuan = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan Jarak : ");
                    jarak = input.nextInt();
                    input.nextLine();
                    gdg.updateJarak(asal, tujuan, jarak);
                    break;

                case 7:
                    gdg.hitungEdge();
                    break;

                default:
                    break;
            }
    }
}
}
