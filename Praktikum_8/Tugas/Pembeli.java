package Praktikum.Praktikum_8.Tugas;

import Praktikum.Praktikum4.pangkat;
import Praktikum.Praktikum_8.Praktikum2.Nasabah;

public class Pembeli {
    String nama;
    int noHP, front, rear, size, max;
    Pembeli[]antrian;

    Pembeli (String nama, int noHP){
        this.nama  = nama;
        this.noHP = noHP;
    }

    Pembeli(){

    }
     public Pembeli(int n){
        max = n;
        antrian = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty(){
        if(size == 0){
            return true;

        }else{
            return false;
        }
    }

    public boolean IsFull(){
        if(size == max){
            return true;

        }else{
            return false;
        
        }
    }

    public void peek(){
        if (!IsEmpty()) {
            System.out.println("Antrian terdepan : " + antrian[front].nama + " " + antrian[front].noHP); 
            
        }else{
            System.out.println("Queue masih kosong");
        }
    }

    public void peekrear(){
        if (!IsEmpty()) {
            System.out.println("Antrian terakhir : " + antrian[rear].nama + " " + antrian[rear].noHP); 
            
        }else{
            System.out.println("Queue masih kosong");
        }
    }

    public void peekposition(String nama){
        int cari = -1;
        for (int i = 0; i < antrian.length; i++) {
            if (antrian[i].nama.equals(nama)) {
                cari = i + 1;
                System.out.println("Posisi antrian  : " + nama + " adalah " + cari);
            }
            
        }
    }
    public void Daftarpembeli(){
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        }else{
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHP);
            System.out.println("jumlah elemen = " + size);
        }
    }

    public void clear(){
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        }else{
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(Pembeli  antri){
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        }else{
            if(IsEmpty()){
                front = rear = 0;
            }else{
                if(rear == max -  1){
                    rear = 0;
                }else{
                    rear++;
                }
            }
            antrian [rear] = antri;
            size++;
        }
    }

    public Pembeli Dequeue(){
        Pembeli antri = new Pembeli();
        if(IsEmpty()){
            System.out.println("Queue Masih Kosong");
        }else{
            antri = antrian[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            }else{
                if (front == max -1) {
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return antri;
    }
}
