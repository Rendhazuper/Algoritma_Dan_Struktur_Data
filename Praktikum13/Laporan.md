# Laporan Praktikum
**Nama : Rendha Putra Rahmadya** <br>
**Kelas: D4 - TI 1H**<br>
**No.Absen : 24**
---


### 2.1 Praktikum 1 : Implementasi Graph menggunakan Linked List

### 2.1.2 Verifikasi Hasil Percobaan
---
### Hasil running pada langkah 14  
<img src="Gambar\Verif1.png">  

### Hasil running pada langkah 17
<img src="Gambar\Verif2.png">  

### 12.2.3 Jawaban
---

1. Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai!

        public void addFirst(int item, int jarak){
            if (isEmpty()){
            head = new Node24 (null, item, jarak, null);
            }else{
                Node24 newNode = new Node24(null, item, jarak, head);
                head.prev = newNode;
                head = newNode;
            }
            size++;


2. Pada class Graph, terdapat atribut list[] bertipe DoubleLinkedList. Sebutkan tujuan pembuatan variabel tersebut! 

    >Untuk menyimpan data objek DoubleLinkedList sehingga dapat di akses menggunakan index

3. Jelaskan alur kerja dari method __removeEdge__! 

       >pertama input asal dan tujuan, i bernilai 0, selama nilai i kurang dari vertex lakukan pengecekan jika tujuan sama dengan nilai i maka akan dipanggil pada list[asal] untuk menghapus tujuan dari list edge yang terhubung dengan asal

4. Apakah alasan pemnaggilan method __addfirst()__ untuk menambahkan data, bukan method add jenis lain saat digunakan pada method __addEdge__ pada class graph?

        head = new Node(null, item, head);

    >Karena addfirst digunakan untuk menambahkan data pada index pertama, dan pada index pertama prev nya adalah null

5. Modifikasi kode program sehingga dapat dilakukan pengecekan apkaah terdapat jalur antara suatu node dengan node lainnya, seperti contoh berikut (Anda dapat meamnfaatkan Scanner)

        head.prev = newNode ?

    >Arti dari statement tersebut adalah data data yang ditambahkan akan menjadi prev dari data head sebelumnya 


### 2.2 Percobaan 2 : Implementasi Graph menggunakan Matriks  

### 2.2.2 Verifikasi Hasil Percobaan
---

<img src="Gambar\Verif3.png"> 

### 2.2.3 Jawaban 
---

1. Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai! 

       public void removeEdge(int asal, int tujuan){
        matriks[asal][tujuan] = 0;
    
2. Apa jenis graph yang digunakan pada Percobaan 2? 

    >Graph Matriks

3. Apa maksud dari dua baris kode b

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
