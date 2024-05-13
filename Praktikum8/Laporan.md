# Laporan Praktikum
**Nama : Rendha Putra Rahmadya** <br>
**Kelas: D4 - TI 1H**<br>
**No.Absen : 24**
---


### 10.1 Praktikum 1

### 10.2.2 Verifikasi Hasil Percobaan
---

<img src="Gambar\Verifikasi 1.png"> 

### 10.2.3 Jawaban
---

1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size 
bernilai 0? 

    >Karena mengacu pada urutan index, dimana index -1 adalah urutan ke-0. Atribut size tidak megnacu pada urutan index 


2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode beirkut

        if(rear == max -  1){
                    rear = 0;

    >Kode tersebut berfungsi ketika kondisi data tidak kosong dan sudah ada data yang sudah keluar sebelumnya, sehingga rear menjadi 0

3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!
        if (front == max -1) {
                    front = 0;

   >Kode tersebut berfungsi jika front sudah mencapai akhir dari max, sehingga ketika melakukan dequeue, front akan kembali ke depan

4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 __(int i =0)__ melainkan __int i = front?__ 

    >Karena posisi index ke-0 tidak selalu menjadi antrian terdepan, yang menjadi antrian terdepan adalah front

5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut !

         i = (i + 1) % max

    >Kode tersebut berfungsi untuk menggerakan variabel 'i' ke elemen berikutnya dalam array, jika 'i' telah mencapai ke index rear, maka operasi  % max akan membawa i kembali ke index awal atau 0

6. Tunjukkan potongan kode porgram yang merupakan queue overflow!

        if (IsFull()) {
            System.out.println("Queue sudah penuh");
    
    >kode diatas merupakan contoh dari Queue overflow, atau suatu kondisi yang akan dihasilkan dari mencoba menambahkan elemen ke queue yang sudah penuh

7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan 
dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi 
queue overflow dan queue underflow, program dihentikan! 

    >Dengan hanya menambahkan System.exit(0);  pada saat overflow atau underflow

### 10.3 Praktikum 2 

### 10.3.2 Verifikasi Hasil Percobaan
---
Berikut adalah hasil output dari percobaan kedua

<img src="Gambar\Verifikasi 2.png"> 

### 10.3.3 Jawaban 
---

1. Pada class QueueMain, jelaskan fungsi IF pada potongan kode program berikut !

        if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat)
                && data.umur != 0 && data.saldo != 0)  {
                
            System.out.println("Antrian yang keluar: " + data.norek + " "+ data.nama + " " + 
            data.alamat + " " + data.umur + " " + data.saldo);
                break;

    >fungsi IF pada potongoan kode tersebut untuk memeriksa apakah norek, nama, alamat, uumur, saldo kosong atau tidak, jika tidak maka akan menampilkan data antrian

2. Lakukan modifikasi program dengan menambahkan method baru bernama peekRear pada class 
Queue yang digunakan untuk mengecek antrian yang berada di posisi belakang! Tambahkan pula 
daftar menu 5. Cek Antrian paling belakang pada class QueueMain sehingga method peekRear 
dapat dipanggil! 
    
        Menambahkan kode 
        public void peekrear(){
        if (!IsEmpty()) {
            System.out.println("Antrian terakhir : " +data[rear].norek + " " + data[rear].nama 
            + " " + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo); 
            
        }else{
            System.out.println("Queue masih kosong");
        }
 