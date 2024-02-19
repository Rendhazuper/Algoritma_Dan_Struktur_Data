# Laporan Praktikum 
### 2.1 Percobaan 1 : Deklarasi class, Atribut dan Method
---

pada percobaan pertama dalam praktikum 2.1 ini, saya mmebuat file java bernama Buku25.java yang akan di isi atribut dan method seperti pada class diagram dibawah

<img src="Gambar\Diagram Class.png"> 

### 2.1.1 Verifikasi Hasil Percobaan
berikut adalah hasil output dari percobaan pertama, dimana hal ini dikarenakan tidak adanya fungsi main dalam file java 


<img src="Gambar\Percobaan1.png"> 

### 2.1.2 Jawaban Pertanyaan
---
1. Sebutkan dua karakteristik class atau object
    - Sebuah class default dapat diakses oleh class lain jika class tersebut berada di satu folder yang sama dengan class yang mengakses
    - Sebuah class private hanya bisa diakses oleh class dengan satu file yang sama dengan yang mengakses
2. Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Buku? Sebutkan apa saja atributnya!

    terdapat 5 atribut yaitu :
    - String Judul
    - String Pengarang
    - int halaman
    - int stok 
    - int harga
3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya! 

    terdapat 4 method yaitu : 
    - void tampilinformasi()
    - void terjual(int jml)
    - void restok(int jml)
    - int gantiHarga(int hrg)

4. Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)! 

    Saya menambahkan kode seperti berikut, dimana saya menambahkan percabangan dalam method terjual(), hal ini supaya jika stok masih ada dan lebih besar dari 0, maka proses pengurangan dapat dilakukan, namun jika stok lebih kecil dari 0, program tidak akan melakukan pengurangan, begitu pula jika stok adalah 0
    <img src="Gambar\Jawaban 1 nomor 4.1.png"> 

    berikut adalah hasil outputnya jika stok = 0 

    ![alt text](image-1.png)

    dan berikut adalah hasil output jika stok kurang dari jml input

    ![alt text](image-2.png)

5. Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int? 

    Karena input yang akan digunakan adalah bilangan bulat, yang mana tipe data untuk input tersebut adalah int

### 2.2 Percobaan 2 : Instansiasi Object, serta mengakses Atribut dan Method
---
Pada percobaan ini saya membuat file baru bernama <b> Bukumain25.java </b> yang akan digunakan untuk menginisiasi object, serta mengakses atribut dan method dari file <b> Buku25.java </b>

### 2.2.1 Verifikasi Hasil Percobaan
----
Berikut adalah hasil output dari percobaan 2

![alt text](image-3.png)

### 2.2.2 Jawaban Pertanyaan
---
1. Pada class BukuMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?

    untuk melakukan instansiasi pada class <b> Bukumain25.java </b> perlu kode seperti berikut

        Buku25 bk1 = new Buku25();

    yang akan menghasilkan object <b> bk1 </b>

2. Bagaimana cara mengakses atribut dan method dari suatu objek?

    Cara untuk mengakses atribut dari suatu objek adalah dengan menggunakan kode

        [object].[atribut] = value

    dan untuk mengakses method adalah dengan menggukana kode

        [object].[method](value)

3. Mengapa hasil output pemanggilan method tampilInformasi() pertama dan kedua berbeda?

    Karena <b> tampilinformasi() </b> yang pertama menampilkan value atribut yang belum terproses oleh method, sedangkan <b> tampilinformasi() </b> yang kedua menampilkan value atribut yang sudah terproses oleh method

### 2.3 Percobaan 3 : Membuat Konstruktor
---
pada percobaan kali ini saya menambahkan objek baru yaitu <b> bk2 </b> seperti berikut

        Buku25 bk2 = new Buku25("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        System.out.println();
        bk2.tampilInformasi();

### 2.3.1 Verifikasi Hasil Percobaan
---
output dari hasil penambahan kode diatas adalah sebagai berikut

![alt text](image-4.png)

### 2.3.2 Jawaban Pertanyaan
---
1. Pada class Buku di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter!
    
    terdapat 3 kode program yang digunakan untuk mendeklarasikan konstruktor berparameter

        void terjual(int jml){
        if(jml < stok )      {
            stok -= jml;
        }else if (stok == 0) {
            System.out.println("maaf stok kosong");
        }else if (jml > stok){
            System.out.println("maaf stok tidak mencukupi");
            }
        }
    <br> 

        void restock (int jml){
            stok += jml;
        }
    <br>

        int gantiHarga(int hrg){
            harga = hrg;
            return harga;
        }
2. Perhatikan class BukuMain. Apa sebenarnya yang dilakukan pada baris program berikut? 
    > Buku25 bk2 = new Buku25("Self Reward", "Maheera Ayesha", 160, 29, 59000);

    baris tersebut digunakan untuk memasukkan nilai kepada atribut yang terdapat class <b> buku </b>

3. Hapus konstruktor default pada class Buku, kemudian compile dan run program. Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!

    Jika konstruktor default dihapus, maka akan terjadi error, dikarenakan kita perlu konstruktor default jika dalam class terdapat konstruktor berparameter

4. Setelah melakukan instansiasi object, apakah method di dalam class Buku harus diakses secara berurutan? Jelaskan alasannya! 

    tidak harus, method dalam class dapat diakses secara tidak berurutan, karena method tersebut bisa digunakan kapan saja, namun jika ingin mencapai suatu hasil yang akurat, tentu harus diakses secara berurutan sesuai dengan algoritma sistem yang dibangun

5. Buat object baru dengan nama <b> buku(NamaMahasiswa) </b> menggunakan konstruktor berparameter dari class Buku!

        Buku25 bukurendha = new Buku25("Negeri Para Bedebah", "Tere Liye", 440, 5, 35000);
        
    


 


