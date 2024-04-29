package Praktikum.Praktikum7;

public class Gudang24 {

 Barang24[] tumpukan;
 int size, top ; 
 
public Gudang24 (int kapasitas){
    size = kapasitas;
    tumpukan = new Barang24[size];
    top = -1;
 }

 public boolean cekKosong(){
    if (top == -1) {
        return true;
    }else{
        return false;
    }
 }
 public boolean cekPenuh(){
    if (top == size -1) {
        return true;
    }else{
        return false;
    }
 }
 public void tambahbarang(Barang24 brg){
    if(!cekPenuh()){
        top++;
        tumpukan[top] = brg;
        System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
    }else{
        System.out.println("Gagal ! TUmpukan barang di Gudang sudah penuh.");
    }
}

    public Barang24 ambilbarang(){
        if(!cekKosong()){
            Barang24 delete = tumpukan[top];
            tumpukan[top] = null;
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang");
            System.out.println("Kode unik dalam biner: " + KonversiDesimalkeBiner(delete.kode));
            return delete; 

          
        }else{
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang24 lihatBarangTeratas(){
        if (!cekKosong()) {
            Barang24 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas : "+barangTeratas.nama);
            return barangTeratas;
        }else{
            System.out.println("Tumpukan barang kosong");
            return null;

        }
    }
    public Barang24 lihatBarangTerbawah(){
        if (!cekKosong()) {
            Barang24 barangTerbawah = tumpukan[size - top];
            System.out.println("Barang teratas : "+barangTerbawah.nama);
            return barangTerbawah;
        }else{
            System.out.println("Tumpukan barang kosong");
            return null;

        }
    }

    public  void tampilkanbarang() {
        if(!cekKosong()){
            System.out.println("Rincian tumpukan barang di Gudang ");
            for (int i = top; i >= 0; i--) {
                if(tumpukan[i] != null){ 
                System.out.printf("Kode %d: %s (Kategori %s) \n", tumpukan[i].kode, tumpukan[i].nama,
                tumpukan[i].kategori);
                }
            }
        }else{
            System.out.println("Tumpukan barang kosong");
        }
    }

    public String KonversiDesimalkeBiner(int kode){
        StackKonversi24 stack = new StackKonversi24();
        while (kode > 0 ) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode/2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
         biner += stack.pop();   
        }
        return biner;
    }
 }


