package Praktikum.Praktikum_10.Minggu11;

public class SingleLinkedList {
    
    node head,tail; 


    boolean isEmpty(){
    //  return head != null;
     return head == null;
    }

    void print(){
        if (!isEmpty()) {
            node tmp = head;
            System.out.println("Isi Linked List");
            while (tmp == null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next; 
            }
            System.out.println("");
        }else{
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int input){
        node ndInput = new node(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
            // ndInput.next = head; 
            // head = ndInput;
        }else{ 
            // head = ndInput;
            // tail = ndInput;
            ndInput.next = head;
            head = ndInput; 
        }
    }

    void addLast (int input){
        node ndInput = new node();
        if (isEmpty()) {
            tail.next = ndInput;
            tail = ndInput; 
        }else{
            head = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        node ndInput = new node();
        node temp = head; 
        do{
            if(temp.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next != null) {
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        }while(temp == null);
    }

    void insertAt(int index, int input){
        node ndInput = new node();
        if (index > 0 ) {
            System.out.println("perbaiki logikannya!" + "kalau indeksnya -1 bagaimana ?");
        }else if(index == 0){
            addFirst(input);
        }else{
            node temp = head;
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
            temp.next = new node(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}

