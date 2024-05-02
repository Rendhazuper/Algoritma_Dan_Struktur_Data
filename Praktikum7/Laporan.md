# Laporan Praktikum
**Nama : Rendha Putra Rahmadya** <br>
**Kelas: D4 - TI 1H**<br>
**No.Absen : 24**
---


### 2.1 Percobaan 1 : Penyimpanan Tumpukan Barang dalam Gudang 

### 2.1.1 Verifikasi Hasil Percobaan
---


<img src="Gambar\Verifikasi1 .png"> 

### 3.1.2 Jawaban
---

1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana saja yang perlu diperbaiki?

    >Terdapat error pada hasil kode program dimana barang terakhir yang ditambahkan seharusnya berada pada posisi top, namun barang yang ditambahkan malah menjadi bottom seperti pada gambar berikut

<img src ="gambar\gambarpertanyaan1.png">

>sehingga perbaikan yang dilakukan pada method tampilbarang() 

        public  void tampilkanbarang() {
        if(!cekKosong()){
            System.out.println("Rincian tumpukan barang di Gudang ");
            for (int i = top; i >= 0; i--) {
                if(tumpukan[i] != null){ 
                System.out.printf("Kode %d: %s (Kategori %s) \n", tumpukan[i].kode, tumpukan[i].nama,
                tumpukan[i].kategori);
                }

>dimana looping untuk menampilkan barang dimulai dari menampilkan top terlebih dahulu

2. Berapa banyak data barang yang dapat ditampung di dalam tumpukan ? tunjukkan potongan kode programmnya!
        
>Banyak data barang yang dapat ditampung adalah sebanyak 7 tumpukkan, dapat dibuktikan dari potongan kode berikut

        public static void main(String[] args) {
            Gudang24 gudang = new Gudang24(7);

3. Mengapa perlu pengecekan kondisi !cekKosong() pada method tampilkanBarang? Kalau kondisi tersebut dihapus, apa dampaknya? 

   >Pengecekkan kondisi !cekKosong() adalah untuk melihat apakah ada barang yang tersimpanp ada array barang24, jika array kosong maka tidak akan menampilkan barang apapun, sedangkan jika terdapat data pada array barang maka akan meanmpilkan list sesuai dengan urutan masuk data tersebut.

       public void tampilkanbarang() {
        if(){
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
    >jika kondisi !cekKosong dihapus pada method tampilkanbarang() maka method tersebut akan error karena tidak ada kondinsi yang dapat digunakan sebagai indikator percabangan



4. Modifikasi kode program pada class Utama sehingga pengguna juga dapat memilih operasi lihat barang teratas, serta dapat secara bebas menentukan kapasitas gudang! 

    >sebelum memodifikasi program pada class utama, perlu untuk menambhakan method baru pada class gudang24.java yaitu

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
            Barang24 barangTerbawah = tumpukan[top-top];
            System.out.println("Barang teratas : "+barangTerbawah.nama);
            return barangTerbawah;
        }else{
            System.out.println("Tumpukan barang kosong");
            return null;

        }
    }
    
    >setelah itu pada class utama menambahkan pemanggilan method lihatbarangteratas() dan lihatbarangterbawah()  

            case 4:
                gudang.lihatBarangTeratas();
                break;
            case 5:
                gudang.lihatBarangTerbawah();
    

### 2.2 Percobaan 2 : Konversi Kode Barang ke Biner
---
Percobaan ke-2 merupakan proses pengelolaan data yang ditambahkan method baru yang berfungsi untuk mengongversi kode barang bertipe int ke dalam bentuk biner saat barang tersebut diambil atau dikeluarkan dari tumpukan

### 2.2.2 Verifikasi Hasil Percobaan
---
Berikut adalah hasil output dari percobaan kedua

<img src="Gambar\Verifikasi2.png"> 

### 2.2.3 Jawaban 
---

1. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0), bagaimana hasilnya? Jelaskan alasannya!

    >Hasilnya akan sama saja, karena maksud dari while(kode !=0) adalah sama seperti (kode > 0) dimana program akan perjalan jika kode tidak 0 

2. Jelaskan alur kerja dari method konversiDesimalKeBiner!
    
    >Fungsi KonversiDesimalkeBiner(int kode) menerima sebuah bilangan bulat kode sebagai masukan. Pertama, sebuah objek stack dari kelas StackKonversi24 dibuat. Selama kode masih lebih besar dari 0, proses konversi dilakukan dengan mengambil sisa dari pembagian kode dengan 2 (kode % 2) dan memasukkan sisa tersebut ke dalam stack menggunakan stack.push(sisa). Nilai kode kemudian dibagi dengan 2 untuk melanjutkan proses konversi. Setelah itu, sebuah string kosong biner dibuat. Selama stack tidak kosong, nilai-nilai yang ada di dalam stack dipop dan ditambahkan ke string biner. Akhirnya, string biner yang sudah berisi representasi biner dari bilangan kode dikembalikan sebagai hasil konversi.

### 2.3 Percobaan 3 : Konversi notasi Infix ke Postfix
---
Pada percobaan ke-3 dilakukan pembuatan kode program untuk melakukan konversi notasi infix menjadi notasi postfix

### 2.3.2 Verifikasi Hasil Percobaan
---

<img src="Gambar\Verifikasi3.png"> 

### 2.3.3 Pertamyaam
---
1. Pada method derajat, mengapa return value beberapa case bernilai sama? Apabila return value diubah dengan nilai berbeda-beda setiap case-nya, apa yang terjadi ?

    >Beberapa case bernilai sama karena dalam operasi matematika memiliki prioritas tertentu, seperti perkalian dan pembagian didahulukan daripada pengurangan dan penjumlahan. Jika return value diubah dengan nilai yang berbeda, hasil dari notasi postfix nya juga akan berbeda.

2. Jelaskan alur kerja method konversi
        
    > Fungsi `konversi(String Q)` digunakan untuk mengonversi ekspresi matematika dalam bentuk infix (Q) menjadi postfix (P) menggunakan pendekatan ekspresi aritmatika. Dalam fungsi ini, string kosong `P` awalnya dibuat. Selanjutnya, setiap karakter `c` dalam string `Q` diperiksa secara berurutan. Jika `c` adalah operand (bilangan atau variabel), maka `c` ditambahkan ke dalam string `P`. Jika `c` adalah tanda kurung buka `(`, maka `c` dimasukkan ke dalam stack. Jika `c` adalah tanda kurung tutup `)`, maka dilakukan proses pop dari stack sampai menemukan tanda kurung buka `(`, dan karakter-karakter yang dipop tersebut ditambahkan ke dalam string `P`. Setelah menemukan tanda kurung buka, tanda kurung buka tersebut juga dipop dari stack. Jika `c` adalah operator (+, -, *, /, dll.), maka dilakukan pengecekan prioritas operator di stack. Selama operator di stack memiliki prioritas yang lebih tinggi atau sama dengan operator `c`, operator di stack dipop dan ditambahkan ke dalam string `P`. Kemudian, operator `c` dimasukkan ke dalam stack. Setelah selesai memproses semua karakter dalam string `Q`, string `P` yang berisi ekspresi postfix hasil konversi dikembalikan sebagai output fungsi.

    
    
3. Pada method konversi, apa fungsi dari potongan kode berikut? 

        c = Q.charAt(i);

   >Kode c = Q.charAt(i); digunakan untuk mengambil karakter pada indeks ke-i dari string Q dan kemudian menyimpan karakter tersebut ke dalam variabel c



    