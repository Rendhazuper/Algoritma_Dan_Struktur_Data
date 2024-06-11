package Praktikum.Praktikum13;


public class DoubleLinkedList24 {

    Node24 head; 
    int size = 0;
    
    public int size(){ 
        return size; 
    }

    public int get(int index) throws Exception{
        if( index > size){
            throw new Exception("Nilai indeks di luar batas");
        }else{
        Node24 current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        return current.data;
     }
        
    }

    public boolean isEmpty(){
        return head == null;
    }
    public void clear() {
        head = null;
        size = 0;  
    }
    public void addFirst(int item, int jarak){
        if (isEmpty()){
           head = new Node24 (null, item, jarak, null);
        }else{
            Node24 newNode = new Node24(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;

        
    }

    public int getJarak(int index) throws Exception{
        if (isEmpty() || index >= size){
            throw new Exception("Nilai indeks di luar batas");
        }
        Node24 tmp = head; 
        for (int i = 0; i < index; i++) {
            tmp = tmp.next; 
        }
        return tmp.jarak;
    }

    public void remove(int index){
        Node24 current = head; // 1 2 3 4 5
        while (current != null) { // current = 1 masuk while
            if (current.data == index) { //index = 1
                if (current.prev != null) {
                    current.prev.next = current.next;
                }else{
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
    
    
}
