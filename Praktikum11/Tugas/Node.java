package Praktikum.Praktikum11.Tugas;

public class Node {
    
    String nama;
    int Noantrian;
    Node prev, next;

    public Node (Node prev, int Noantrian, String nama, Node next){
        this.prev = prev;
        this.nama = nama;
        this.Noantrian = Noantrian;
        this.next = next;
    }

    public Node(){

    }
}
