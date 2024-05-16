# Laporan Praktikum
**Nama : Rendha Putra Rahmadya** <br>
**Kelas: D4 - TI 1H**<br>
**No.Absen : 24**
---


### 12.1 Praktikum 1

### 12.2.1 Verifikasi Hasil Percobaan
---

<img src="Gambar\Verifikasi1.png"> 

### 12.2.3 Jawaban
---

1. jelaskan perbedaan antara single linked list dengan double linked list!

    >Linked list hanya bisa maju, double linked list bisa mengakses data sebelumnya


2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Untuk apakah atribut tersebut? 


    >Untuk dapat mengakses data selanjut dan sebelumnya, sehingga next dan prev digunakan untuk pointer data setelah dan data sebelumnya

3. Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan inisialisasi atribut head dan size seperti pada kode berikut ini? 

        public DoubleLinkedLists(){
        head = null;
        size = 0;
    

   >untuk data default dari linked list, bahwa data masih kosong belum ada isinya

4. Pada method __addFirst()__, kenapa dalam pembuatan object dari konstruktor class Node prev dianggap sama dengan null?  

        head = new Node(null, item, head);

    >Karena addfirst digunakan untuk menambahkan data pada index pertama, dan pada index pertama prev nya adalah null

5. Perhatikan pada method __addFirst()__.  Apakah arti statement 
    
        head.prev = newNode ?

    >Arti dari statement tersebut adalah data data yang ditambahkan akan menjadi prev dari data head sebelumnya 

6. Perhatikan isi method addLast(), apa arti dari pembuatan object Node dengan mengisikan parameter prev dengan current, dan next dengan null? 
    
        Node newNode = new Node(current, item, null);  

    >Karena pada data terakhir pointer selanjutnya adalah null

7. Pada method add(), terdapat potongan kode program sebagai berikut: 

         if (current.prev == null) {
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;

    >Maksud dari kode program tersebut adlaah, jika data current sebelumnya adalah null maka menambahkan data node baru di dengan prev null dan next current, lalu data yang ditambahkan akan menjadi prev dari current, dan head akan menjadi data node yang ditambahkan

### 12.3 Praktikum 2 

### 12.3.2 Verifikasi Hasil Percobaan
---
Berikut adalah hasil output dari percobaan kedua

<img src="Gambar\Verifikasi2.png"> 

### 12.3.3 Jawaban 
---

1. Apakah maksud statement berikut pada method removeFirst()? 

        head = head.next; 
        head.prev = null; 

    >Node awal dipindah ke node next karena node awal akan dihapus, dan node yang dipindah prev nya diubah menjadi null karena dia sudah berada di index awal

2. Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method __removeLast()__? 

    >Menggunakan current, awalnya current diatur pada head, lalu berjalan ketika current.next.next tidak null maka current akan terus bertambah hingga current.next.next = null

3. Jelaskan alan potongan kode program dibawah ini tidak cocok untuk perintah __remove__!

        Node tmp = head.next;

        head.next = tmp.next;
        tmp.next.prev = head;

    >karena tidak ada set null

4. Jelaskan fungsi kode program berikut ini pada fungsi __remove!__ 

        current.prev.next = current.next;
        current.next.prev = current.prev;

    >Node tersebut berada di tengah tengah dimana node tersebut prev dan next nya tidak null, sehingga ketika node tersebut di remove next dari node sebelumnya menjadi current.next, dan prev dari node selanjutnya menjadi current.prev

### 12.4 Praktikum 3

### 12.4.2 Verifikasi Hasil Percobaan
---

<img src="Gambar\varifikasi3.png">

---
1. Jelaskan method __size()__ pada class DoubleLinkedList!

    >method size() berfungsi untuk mengembalikan nilai untuk ditampilkan sesuai dengan kondisi size pada saat itu

2. Jelaskan cara mengatur indeks pada double linked lists supaya dapat dimulai dari indeks ke-1!

    >dengan mengubah looping for dimana i dimulai dari 1

        for (int i = 1; i < index; i++)

3. Jelaskan perbedaan karakteristik fungsi __Add__ pada Double Linked Lists dan Single Linked Lists!  

    >SLL hanya memilik isatu referensi yaitu next, sedangkan DLL memiliki dua referensi yaitu prev dan next

4. Jelaskan perbedaan logika dari kedua kode program di bawah ini!

        (a)
        public boolean isEmpty(){
            if(size == 0){
                return true;
            }else {
                return false;
            }
        } 

        (b)
        public boolean isEmpty(){
            return head == null;
        } 

    >(a) isEmpty() digunakan untuk mengecek kosong tidaknya data berdasarkan size, jika size = 0 maka true, jika tidak maka false, (b) isEmpty() diguankan untuk mengecek kosong tidaknya data berdasarkan head, jika head == null maka true, jika tidak maka false
