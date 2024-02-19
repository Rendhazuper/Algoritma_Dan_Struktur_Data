package Praktikum.Praktikum2;

public class Buku25 {
    
    String judul, pengarang; 
    int halaman, stok, harga, total, jumlahbeli;
    double hargadiskon, bayar; 

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
    
    void tampilstruk(){
        System.out.println("Judul : "+ judul);
        System.out.println("Jumlah beli : "+jumlahbeli);
        System.out.println("Harga total : "+ total);
        System.out.println("dapatan diskon : "+ hargadiskon);
        System.out.println("Jumlah bayar : "+ bayar);

    }

    void terjual(int jml){
       if(jml < stok )      {
        stok -= jml;
       }else if (stok == 0) {
        System.out.println("maaf stok kosong");
       }else if (jml > stok){
        System.out.println("maaf stok tidak mencukupi");
       }
        
    }

    int hitungHargaTotal(int jml){
        jumlahbeli = jml;
        total = harga * jml;
        return total;

    }

    double hitungDiskon(){
        if (total > 150000) {
            hargadiskon = total * 0.12;
           
        }else if(total > 75000 && total < 150000 ){
            hargadiskon = total * 0.5;
        }else if (total < 75000) {
            hargadiskon = total * 0;
    }
    return hargadiskon;
}

    double hitungHargaBayar(){
        bayar = total - hargadiskon;
        return bayar;
        
    }

    void restock (int jml){
        stok += jml;
    }

    int gantiHarga(int hrg){
        harga = hrg;
        return harga;
    }
}
