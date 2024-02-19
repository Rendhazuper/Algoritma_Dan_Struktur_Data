package Praktikum.Praktikum2;

public class Buku25 {
    
    String judul, pengarang; 
    int halaman, stok, harga; 

    public Buku25(){

    }

    public Buku25(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal; 
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi(){
        System.out.println("Judul : "+judul);
        System.out.println("Pengarang : "+ pengarang);
        System.out.println("Jumlah halaman : "+ halaman);
        System.out.println("Sisa Stok : "+ stok);
        System.out.println("Harga : Rp "+ harga);
    }

    void terjual(int jml){
        stok -= jml;
    }

    void restock (int jml){
        stok += jml;
    }

    int gantiHarga(int hrg){
        harga = hrg;
        return harga;
    }
}
