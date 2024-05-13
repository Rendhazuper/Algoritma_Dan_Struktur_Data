package Praktikum.Praktikum_11.Tugas;

/**
 * Vaksin
 */
public class Vaksin {

    Node awal;
    int size;
    String menu[] = {"Tambah Data Penerima Vaksin",
    "Hapus Data Pengantri Vaksin",
    "Daftar Penerima vaksin",
    "Keluar"};

    public Vaksin(){
        awal = null;
        size = 0;
    }

    public void menu(){
    System.out.println("++++++++++++++++++++++++++++");
    System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
    System.out.println("++++++++++++++++++++++++++++");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i+1 + ". " + menu[i]);
        }
    }

    public boolean isEmpty(){
        return awal == null;
    } 
    
    // public void addFirst(int nomor, String Nama){
    //     if (isEmpty()) {
    //        Node awal = new Node(null, nomor, Nama, null);
    //     size++;
    //  }
    // }


    public void add(int nomor, String nama) throws Exception {
        if (isEmpty()) {
            awal = new Node(null, nomor, nama, null);
            size++;
         }else{
             Node current = awal ;
             while (current.next !=null) {
                 current = current.next;
             }
             Node newNode = new Node (current, nomor, nama, null);
             current.next = newNode;
             size++;
         }
    }

    public void print(){
        if (!isEmpty()) {
            Node current = awal;
            System.out.println("|" + "No." + "\t | " + "Nama" + "\t \t|" );
            while (current != null) {
                System.out.println("|" + current.Noantrian + "\t | " + current.nama + "\t|" );
                current = current.next;
            }
            System.out.println("sisa antrian : " + size);
        }else{
            System.out.println("Linked list kosong");
        }
    }

    public void remove() throws Exception{
        if (isEmpty()) {
            throw new Exception("Antrian kosong");
        }else if (awal.next == null) {
            System.out.println(awal.nama + " sudah divaksinasi");
            awal = null;
            size--;
        }else{
            Node current = awal;
            System.out.println(current.nama + " sudah divaksinasi");
            current = current.next;
            current.prev = null;
            awal = current;
            size--;
        }

}
}