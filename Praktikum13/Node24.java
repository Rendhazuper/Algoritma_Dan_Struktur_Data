package Praktikum.Praktikum13;

public class Node24 {
    int data, jarak;
    Node24 prev, next;

    Node24(Node24 prev, int data, int jarak, Node24 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }

    public void inputTujuan(int t){
        data = t;
    }
    public void inputJarak(int j){
        jarak = j;
    }
}
