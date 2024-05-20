package Praktikum.Praktikum11.Tugas;
import java.util.*;
import java.util.concurrent.ExecutionException;


public class Filmlist {
    Scanner input = new Scanner(System.in);
    Film head;
    int size, pilih =-1;
    public Filmlist() {
        head = null;
        size = 0;
    }

    public int menu(){ 
        System.out.println("===========================");
        System.out.println("DATA FILM LAYAR LEBAR");
        System.out.println("===========================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Index Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urut Data Rating Film-DESC");
        System.out.println("0. Keluar");
        System.out.println("============================");
        System.out.print("Pilih menu : ");
        return pilih = input.nextInt();
        
    }

    public boolean isEmpty(){
        return head == null;
    }



    public void tambahawal(int id, String judul, float rating){
        if (isEmpty()) {
            head = new Film(null, id, judul, rating, head);
        }else{ 
            Film newNode = new Film(null, id, judul, rating, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void tambahakhir(int id, String judul, float rating){
        if (isEmpty()) {
            tambahawal(id, judul, rating);
        }else{
            Film current = head;
            while (current.next !=null) {
                current = current.next;
            }
            Film databaru = new Film (current, id, judul, rating, null);
            current.next = databaru;
            size++;
        }
    }
    public void tambahindex(int id, String judul, float rating, int index) throws Exception{
        if (isEmpty()) {
            tambahawal(id, judul, rating);
        }else if(index < 0 || index > size){
            throw new Exception("Index diluar batas");
        }else{
            Film current = head; 
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Film databaru = new Film(null, id, judul,rating, current);
                current.prev = databaru;
                head = databaru;
            }else{
                Film databaru = new Film(current.prev, id, judul, rating, null);
                databaru.prev = current.prev;
                databaru.next = current;
                current.prev.next = databaru;
                current.prev = databaru; 
            }
            }
            size++;
        }

        public void cetak(){
            if (!isEmpty()) {
                Film current = head;
                while (current != null) {
                    System.out.println("-----------------------------");
                    System.out.println("ID : " +   current.id); 
                    System.out.println("Judul : " +  current.judul); 
                    System.out.println("Rating : " +  current.rating); 
                    System.out.println("-----------------------------"); 
                    current = current.next;
                    
                }
                System.out.println("banyak data : "+ size);;
            }else{ 
                System.out.println("-----------------------------");
                System.out.println("List film kosong");
                System.out.println("-----------------------------"); 
                
            }
        }

        public void hapusPertama() throws Exception{
            if (isEmpty()) {
                throw new Exception("Data film masih kosong");
            }else if(size == 1){
                hapusterakhir();
            }else{
                head = head.next;
                head.prev = null;
                size--;
            }
        }

        public void hapusterakhir() throws Exception{
            if (isEmpty()) {
                throw new Exception("data film masih kosong, tidak ada yang bisa dihapus");
            }else if (head.next == null){
                head = null;
                size--;
                return;
            }
            Film current = head; 
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            size--;
        }

        public void hapus(int index) throws Exception{
            if (isEmpty()) {
                throw new Exception("nilai index di luar batas");
            }else if (index == 0){
                hapusPertama();
            }else{
                Film current = head; 
                int i = 0;
                while (i < index) {
                    current = current.next;
                    i++;
                }
                if (current.next == null) {
                    current.prev.next = null;
                }else if (current.prev == null){
                    current = current.next;
                    current.prev = null;
                    head = current;
                }else{
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
            }
        }
        public void search(int key) throws Exception{ 
            Film current = head; 
            int posisi = 1;
            while (current != null) {
                if (current.id == key) {
                    System.out.println("Data ID Film : " + key + "berada di node ke-" + posisi);
                    System.out.println("IDENTITAS:");
                    System.out.println("id Film : " + current.id);
                    System.out.println("Judul Film : " + current.judul);
                    System.out.println("IMDB Rating : " + current.rating); 
                    return;
                }
                current = current.next; 
                posisi++;
            }
            throw new Exception("Data Film tidak ditemukan");
        }
        public void sorting() {
            if (size <= 1) {
                return; 
            }
            Film current = head;
            while (current != null) {
                Film maxNode = current;
                Film nextNode = current.next;
    
                while (nextNode != null) {
                    if (nextNode.rating > maxNode.rating) {
                        maxNode = nextNode;
                    }
                    nextNode = nextNode.next;
                }
    
                if (maxNode != current) {
                    int tempId = current.id;
                    String tempJudul = current.judul;
                    float tempRating = current.rating;
    
                    current.id = maxNode.id;
                    current.judul = maxNode.judul;
                    current.rating = maxNode.rating;
    
                    maxNode.id = tempId;
                    maxNode.judul = tempJudul;
                    maxNode.rating = tempRating;
                }
                current = current.next;
            }

            System.out.println("Urutan film berdasarkan rating tertinggi:");
            Film node = head;
            while (node != null) {
                System.out.println("========================");
                System.out.println("id fiLm: " + node.id );
                System.out.println("Judul : " + node.judul);
                System.out.println("Rating : " + node.rating);   
                System.out.println("========================");
                node = node.next;
            }
        }

    }
