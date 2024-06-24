package Praktikum.Praktikum13;


public class DoubleLinkedList24 {

    Node24 head;
    int size;

    public DoubleLinkedList24() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new Node24(null, item, jarak, null);
        } else {
            Node24 newNode = new Node24(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public int get(int index) throws Exception {
        if (index > size || index < 0) {
            throw new Exception("Nilai index di luar batas");
        }
        Node24 temp = head;
        for (int i = 1; i < index + 1; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public void update (int a, int t, int j){
        Node24 temp = head;
        for (int i = 1; i < a + 1; i++) {
            temp = temp.next;
        }
        temp.inputTujuan(t);
        temp.inputJarak(j);
    }

    public int gerJarak(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        Node24 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.jarak;
    }

    public void print() {
        if (!isEmpty()) {
            Node24 temp = head;
            while (temp != null) {
                System.out.print(temp.data + "\t");
                temp = temp.next;
            }
            System.out.println("\n berhasil diisi");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    // PRAK2

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, dapat dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node24 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) {
        Node24 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
        size--;
    }

    // PRAK3

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        Node24 temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }
        return temp.data;
    }

    
    
}
