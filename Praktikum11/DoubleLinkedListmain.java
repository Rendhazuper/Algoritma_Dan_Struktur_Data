package Praktikum.Praktikum11;

public class DoubleLinkedListmain {
    public static void main(String[] args ) throws Exception {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        dll.addFirst(3);
        dll.add(40,0);
        dll.print();
        System.out.println("data indeks ke - 1 pada linked list adalah : "+dll.get(1));
    }
}
