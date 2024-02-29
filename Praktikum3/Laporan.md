# Laporan Praktikum

### 3.1 Percobaan 1 : Membuat Array dari Object, Mengisi dan Menampilkan 


pada percobaan pertama dalam praktikum 3.1 ini, saya membuat file java bernama Arrayobjects.java yang akan di isi array dari object, kemudian mengisi dan menampilkan array tersebut

### 3.1.1 Verifikasi Hasil Percobaan
---


<img src="Gambar\Verifikasi1.png"> 

### 3.1.2 Jawaban
---

1. Berdasarkan uji coba 3.1, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method? Jelaskan!
    
    >Harus memiliki atribut namun tidak harus memiliki method, karena fungsi dari atribut adalah untuk menyimpan nilai dari setiap variabel

2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan konstruktur pada baris program berikut : 
        
        ppArray[1] = new PersegiPanjang();

    >class PersegiPanjang memiliki konstruktor namun hanyak konstruktor kosong

3. Apa yang dimaksud kode berikut

        PersesgiPanjang[] ppArray = new PersegiPanjang[3];

    >Baris kode tersebut bertujuan untuk menginisiasi Array of Object ppArray yang index array berjumlah 3

4. Apa yang dimaksud dengan kode berikut ini

        ppArray[1] = new PresegiPanjang();
        ppArray[1].panjang = 80;
        ppArray[1].lebar = 40 ;
    
    >Baris kode tersebut bertjuan untuk memasukkan nilai kedalam atrubut pada class PersegiPanjang()

5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?

    >Karena dalam java tidak bisa menempatkan class di dalam class, hal itu akan menimbulkan error, sehingga penempatannya harus dipisahkan

### 3.2 Percobaan 2 : Menerima Input Isian Array Menggunakan Looping
---
Pada percobaan ke-2 ini saya akan membuat program untuk menerima input dan menggunakan looping untuk mengisikan atribut dari semua persegi panjang yang ada di ppArray

### 3.2.1 Verifikasi Hasil Percobaan
---
Berikut adalah hasil output dari percobaan kedua

<img src="Gambar\Verifikasi2.png"> 

### 3.2.2 Jawaban 
---

1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi? 

    >Bisa, karena array of object sama seperti implementasi array pada umumnya

2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan !
    
    >untuk membuat array 2 dimensi membutuhkan kode seperti berikut

            PresegiPanjang[][] ppArray = new PresegiPanjang[i][j];

3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode dibawah ini akan memunculkan error saat dijalankan. Mengapa? 

        Persegi[]pgArray = new Persegi[100]
        pgArray[5].sisi = 20;
    >Akan muncul error karena belum ada instansiasi

4. Modifikasi kode program pada praktikum 3.2 agar length array menjadi inputan dengan Scanner! 

    >modifikasi bisa dengna menambahkan baris kode seperti berikut
    
        System.out.print("Berapa banyak persegi panjang ? : ");
        int j = sc.nextInt();
        PresegiPanjang[] ppArray = new PresegiPanjang[j];

5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan pada ppArray[i] sekaligus ppArray[0]?Jelaskan ! 

    >Boleh saja, karena dalam ppArray[i] adalah looping sehingga instansiasi sebenarnya sudah dilakukan

### 3.3 Percobaan 3 : Penambahan Operasi Matematika di Dalam Method 
---
Pada percobaan ke-3 ini saya akan melakukan pengoprasian matematika beberapa atribut pada masing-masing anggota array

### 3.3.1 Verifikasi Hasil Percobaan
---
Berikut adalah hasil run dari kode percobaan 3.3

<img src="Gambar\Verifikasi3.png"> 

### 3.3.2 Jawaban
---
1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan 
contoh!

    > bisa, dalam satu class dapat memuat banyak konstrukor, contoh sebagai berikut

        public balok(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;    
        }
            public int hitungVolume(){
            return panjang * lebar * tinggi;
        }

2. Jika diketahui terdapat class <b> Segitiga </b> seperti berikut ini
        
        Public class segitiga{ 
            public int alas; 
            public int tinggi;
        }
    tambahkan konstruktor pada class <b> Segitiga </b> tersebut yang berisi parameter <b> int a, int t </b> yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi;

    >sebelum itu kita harus membuat method untuk menyimpan nilai

        public segitiga(int a, int t){
            alas = a;
            tinggi = t;
        }

    
    
3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga tersebut. Asumsi segitiga adalah segitiga siku-siku. (Hint: Anda dapat menggunakan bantuan library Math pada Java untuk mengkalkulasi sisi miring)

        public double hitungLuas(){
        double luas = (double) 0.5 * alas * tinggi;
        return luas;
        }
        public double hitungKeliling(){
            double miring = Math.sqrt(alas * alas + tinggi * tinggi);
            return 2 * miring + alas;
        }

4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing atributnya sebagai berikut: 

        sgArray[0] = new segitiga(10,4);
        sgArray[1] = new segitiga(20,10);
        sgArray[2] = new segitiga(15,6);
        sgArray[3] = new segitiga(25,10);

5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method hitungLuas() dan hitungKeliling(). 
<img src="Gambar\hasil 3.5.png"> 

### 3.4.1 Latihan Praktikum
---
1.Pada latihan praktikum saya membuat program bernama Latihan.java yang berisi class bola, class limas, dan class kerucut seperti berikut
        
    class bola {
        double jari2;
        double pi = 3.14;

        public double LPbola(){
            return 4 * pi * jari2 * jari2;
        }

        public double Vbola(){
            return 1.3 * Math.PI * jari2 * jari2 * jari2;
        }
    }
<br>

    class limas{
        double sisi;
        double tinggi; 

        public double LPlimas(){
            return (4 * (sisi * tinggi / 2)) + (sisi * sisi);
        }

        public double VolLimas(){
            return 0.33 * (sisi * sisi) * tinggi;
        }

    }
<br>

    class kerucut{
        double r;
        double selimut;

        public double hitungtinggi(){
            double tinggi = Math.sqrt(selimut * selimut - r * r);
            return tinggi;
        }
        public double LPkerucut(){
            return Math.PI * r * selimut + Math.PI * r * r;
        }
        public double Volkerucut(){
            return 0.33 * (Math.PI * r *r) * hitungtinggi();
        }
    }

lalu membuat intansiasi pada class main dengan menggunakan switch case

        case 1:
            System.out.println("=============== Hitung Kerucut ================ ");
            kerucut[] kr = new kerucut[1];
            for (int i = 0; i < kr.length; i++) {
                kr[i] = new kerucut();
                System.out.println("Input jari-jari : ");
                kr[i].r = key.nextDouble();
                System.out.println("Input sisi mriing : ");
                kr[i].selimut = key.nextDouble();
                
    
                System.out.println("=============================");
                System.out.println(" Diketahui ");
                System.out.println("jari jari = "+ kr[i].r);
                System.out.println("selimut = "+ kr[i].selimut);
                System.out.println("tinggi = "+ kr[i].hitungtinggi());
                System.out.println("=============================");
                System.out.println("Luas permukaan  = "+ kr[i].LPkerucut());
                System.out.println("Volume = "+ kr[i].Volkerucut());
            }
                break;
<br>

        case 2:
            System.out.println("=============== Hitung Limas ================ ");
            limas[] lim = new limas[1];
            for (int i = 0; i < lim.length; i++) {
                lim[i] = new limas();
                System.out.print("Input sisi : ");
                lim[i].sisi = key.nextDouble();
                System.out.print("Input tinggi :  ");
                lim[i].tinggi = key.nextDouble();
                
    
                System.out.println("=============================");
                System.out.println(" Diketahui ");
                System.out.println("sisi persegi = "+ lim[i].sisi);
                System.out.println("tinggi = "+ lim[i].tinggi);
                System.out.println("=============================");
                System.out.println("Luas permukaan  = "+ lim[i].LPlimas());
                System.out.println("Volume = "+ lim[i].VolLimas());
            }
                break;
            
<br>            
            
        case 3:
            System.out.println("=============== Hitung Bola ================ ");
            bola[] ball = new bola [1];
            for (int i = 0; i < ball.length; i++) {
                ball[i] = new bola();
                System.out.print("Input jari-jari : ");
                ball[i].jari2 = key.nextDouble();
             
                
    
                System.out.println("=============================");
                System.out.println(" Diketahui ");
                System.out.println("jari-jari= "+ ball[i].jari2);
                System.out.println("=============================");
                System.out.println("Luas permukaan  = "+ ball[i].LPbola());
                System.out.println("Volume = "+ ball[i].Vbola());
            }
                break;

Berikut adalah output dari latihan praktikum 1 
<img src="Gambar\Jawaban latihan1.png"> 
<img src="Gambar\Jawaban latihan2.png"> 
<img src="Gambar\Jawaban latihan3.png"> 


2. pada latihan ke-2 ini saya membuat file baru bernama latihan2.java, dalam file tersebut saya membuat class baru bernama class Mahasiswa, dalam class tersebut saya menambahkan konstruktor tampilMhs() untuk menampilkan data mahasiswa yang di inputkan

berikut adalah tangkapan layar untuk input program
<img src="Gambar\Latihan input.png"> 

dan untuk output program akan seperti berikut
<img src="Gambar\Latihan ouput.png"> 


3. untuk modifikasi saya memasukan method hitung() untuk mencari rata rata dengan IPK tertinggi dan IPKTertinggi() mencari mahasiswa dengan IPK tertinggi dengan parameter Mahasiswa [] mhs pada file Latihan2.java

         public void hitung(Mahasiswa[] mhs){
            double total = 0;
            for (int i = 0; i < mhs.length; i++) {
                total += mhs[i].ip;
            }
            double rata2 = total /mhs.length;
            System.out.println("Rata-rata IPK  : "+ rata2 );
    }
<br>

        public void IPKtertinggi(Mahasiswa [] mhs){
            double target = mhs[0].ip;
            int index = 0;
            for (int i = 0; i < mhs.length; i++) {
                if (mhs[i].ip > target) {
                    target = mhs[i].ip;
                    index = i;
                }
            }
        }

    