package Praktikum.Praktikum_11;

import java.lang.reflect.Executable;
import java.util.concurrent.ExecutionException;

public class DoubleLinkedLists {
    Node head;
    int size;

    public DoubleLinkedLists(){
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head == null;
    } 

    public void addFirst(int item){
        if (isEmpty()) {
            head = new Node(null, item, head);
        }else{
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item){
        if (isEmpty()) {
           addFirst(item); 
        }else{
            Node current = head;
            while (current.next !=null) {
                current = current.next;
            }
            Node newNode = new Node (current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        }else if (index < 0 || index > size){
            // System.out.println("Nilai indeks di luar batas");
            throw new Exception("Nilai diluar batas");
           
        }else{
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            }else{
                Node newNode = new Node(current.prev, item, current);
                newNode.prev  = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size(){
        return size;
    }
    public void clear(){
        head = null;
        size = 0; 

    }

    public void print(){
        if (!isEmpty()) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "\t");
                temp = temp.next;
            }
            System.out.println("\n berhasil diisi");
        }else{
            System.out.println("Linked list kosong");
        }
    }

    public void removeFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("linked list masih kosong, tidak dapat dihapus");
        }else if (size == 1){
            removeLast();
        }else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLast() throws Exception{
        if (isEmpty()) {
            throw new Exception("linked list masih kosong, tidak dapat dihapus");
        }else if (head.next == null){
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next !=null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public void remove(int index) throws Exception{
        if (isEmpty()) {
            throw new Exception("Nilai indeks di luar batas");
        }else if (index == 0){
            removeFirst();
            // size--;
        }else{
            Node current = head;
            int i = 0;
            while (i<index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            }else if(current.prev == null){
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

    public int getFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked list kosong");
        }
        return head.data; 
    }

    public int getLast() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked list kosong");
        }
        Node current = head;
        while (current.next !=null) {
            current = current.next;
        }
        return current.data;
    }
    public int get(int index) throws Exception{
        if(isEmpty() || index > size){
            throw new Exception("Nilai indeks di luar batas");
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }
    
}
