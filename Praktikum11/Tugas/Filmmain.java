package Praktikum.Praktikum11.Tugas;
import java.util.*;

public class Filmmain {
    public static void main(String[] args) throws Exception {



        Scanner input = new Scanner(System.in);    
        Filmlist film = new Filmlist();


        while (film.pilih != 0) {
            film.menu();

        switch (film.pilih) {
            case 1:
            System.out.println("Masukkan Data Film Posisi Awal");
            System.out.println("ID Film");
            int id = input.nextInt();
            System.out.println("Judul Film");
            input.nextLine();
            String judul = input.nextLine();
            System.out.println("Rating Film");
            float rating = input.nextFloat();
            film.tambahawal(id, judul, rating);
                break;
        
            case 2:
            System.out.println("Masukkan Data Film Posisi Akhir");
            System.out.println("ID Film");
            id = input.nextInt();
            System.out.println("Judul Film");
            input.nextLine();
            judul = input.nextLine();
            System.out.println("Rating Film");
            rating = input.nextFloat();
            film.tambahakhir(id, judul, rating);
                break;
            case 3:
            System.out.println("Masukkan Data Film");
            System.out.print("Urutan ke-");
            int urutan = input.nextInt();
            System.out.println("ID Film :");
            id = input.nextInt();
            System.out.println("Judul Film :");
            input.nextLine();
            judul = input.nextLine();
            System.out.println("Rating Film :");
            rating = input.nextFloat();
            film.tambahindex(id, judul, rating, urutan);
            break;
            case 4: 
            film.hapusPertama();
            break;
            case 5:
            film.hapusterakhir();
            break;
            case 6:
            film.cetak();
            System.out.print("Urutan film yang ingin dihapus :");
            int hapus = input.nextInt();
            film.hapus(hapus);
            break;
            case 7:
            film.cetak();
            break;
            case 8:
            System.out.print("Masukkan id film yang dcari : ");
            int keysearch = input.nextInt();
            film.search(keysearch);
            break;
            case 9:
            film.sorting();
            break;
        }
            
        }
        
    }
    

    
}
