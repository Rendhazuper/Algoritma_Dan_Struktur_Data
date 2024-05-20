package Praktikum.Kuis;
import java.util.*;

public class Method {

    Scanner input = new Scanner (System.in);
    TeamPutra head;
    int sizeputra, sizeputri;
    int poin = 0, pilih = -1;



    public Method(){
        head = null;
        sizeputra = 0;
    }

    public boolean kosongputra(){
        return head == null;
    }


    public void tambahputra(String nama, int poin){
        if (kosongputra()) {
            head = new TeamPutra(null, nama, poin, null);
            sizeputra++;
        }else{
            TeamPutra current = head;
            while (current.next != null) {
                current = current.next;
            }
            TeamPutra baru = new TeamPutra (current, nama, poin, null);   
            current.next = baru;
            sizeputra++;
        }
    }


    

    public void tampilputra(){
        if (!kosongputra()) {
            TeamPutra current = head;
            System.out.println("|\t    " + "Tim Putra Proliga 2023" + " \t      |");
            System.out.println("===============================================");
            while (current != null) {
                System.out.printf("| %-30s | %-10d |\n" , current.nama, current.poin);
                current = current.next;
            }
            System.out.println("===============================================");
            System.out.println("jumlah tim: "+ sizeputra);
        }else{
            System.out.println("kosong");
        }
    }
   

    public int menu(){
    System.out.println();
    System.out.println("============ PENGATURAN DATA ============");
    System.out.println("1. Data Team Putra");
    System.out.println("2. Mulai Pertandingan! ");
    System.out.println("========================================== ");
    System.out.println("Pilih menu :");
    return pilih = input.nextInt();
    
    }
    public void inputSkor(String tim1, String tim2, int skor1, int skor2) {
        int poinTim1 = 0;
        int poinTim2 = 0;
    
        if (skor1 == 3 && (skor2 == 0 || skor2 == 1)) {
            poinTim1 = 3;
            poinTim2 = 0;
        } else if (skor1 == 3 && skor2 == 2) {
            poinTim1 = 2;
            poinTim2 = 1;
        } else if (skor2 == 3 && (skor1 == 0 || skor1 == 1)) {
            poinTim1 = 0;
            poinTim2 = 3;
        } else if (skor2 == 3 && skor1 == 2) {
            poinTim1 = 1;
            poinTim2 = 2;
        }
    
        updatePoinTim(tim1, poinTim1);
        updatePoinTim(tim2, poinTim2);
    }
    
    private void updatePoinTim(String tim, int poin) {
        if (head != null) {
            TeamPutra current = head;
            while (current != null) {
                if (current.nama.equals(tim)) {
                    current.poin += poin;
                    break;
                }
                current = current.next;
            }
        }
    }

    
    

    public void pertandinganputra() {
        //pekan 1
           
                inputSkor("Jakarta BNI 46", "Jakarta LavAni Allo Bank", 0, 3);
                inputSkor("Surabaya BIN Samator", "Palembang Bank Sumsel Babel", 2, 3);
                inputSkor("Jakarta STIN BIN", "Kudus Sukun Badak", 3, 1);
                inputSkor("Jakarta Pertamina Pertamax", "Jakarta LavAni Allo Bank", 0, 3);
                inputSkor("Jakarta Bhayangkara Presisi", "Palembang Bank Sumsel Babel", 3, 0);
                inputSkor("Kudus Sukun Badak", "Surabaya BIN Samator", 1, 3);
                inputSkor("Jakarta STIN BIN", "Jakarta BNI 46", 3, 0);
                inputSkor("Surabaya BIN Samator", "Jakarta Pertamina Pertamax", 3, 0);
                inputSkor("Jakarta Bhayangkara Presisi", "Jakarta BNI 46", 3, 0);
                inputSkor("Jakarta STIN BIN", "Jakarta LavAni Allo Bank", 2, 3);
               
           
         //pekan 2
                inputSkor("Kudus Sukun Badak", "Jakarta LavAni Allo Bank", 0, 2);
                inputSkor("Jakarta BNI 46", "Jakarta Pertamina Pertamax", 2, 3);
                inputSkor("Jakarta STIN BIN", "Palembang Bank Sumsel Babel", 3, 0);
                inputSkor("Kudus Sukun Badak", "Jakarta BNI 46", 0, 3);
                inputSkor("Surabaya BIN Samator", "Jakarta Bhayangkara Presisi", 3, 1);
                inputSkor("Jakarta STIN BIN", "Jakarta Pertamina Pertamax", 3, 1);
                inputSkor("Surabaya BIN Samator", "Jakarta LavAni Allo Bank", 1, 3);
                inputSkor("Kudus Sukun Badak", "Jakarta Bhayangkara Presisi", 1, 3);
                inputSkor("Palembang Bank Sumsel Babel", "Jakarta Pertamina Pertamax", 0, 3);
                
             
          //pekan 3
                inputSkor("Jakarta STIN BIN", "Jakarta Bhayangkara Presisi", 1, 3);
                inputSkor("Palembang Bank Sumsel Babel", "Jakarta LavAni Allo Bank", 2, 3);
                inputSkor("Kudus Sukun Badak", "Jakarta Pertamina Pertamax", 3, 0);
                inputSkor("Surabaya BIN Samator", "Jakarta BNI 46", 1, 3);
                inputSkor("Jakarta Bhayangkara Presisi", "Jakarta LavAni Allo Bank", 3, 2);
                inputSkor("Kudus Sukun Badak", "Palembang Bank Sumsel Babel", 1, 3);
                inputSkor("Jakarta Bhayangkara Presisi", "Jakarta Pertamina Pertamax", 3, 0);
                inputSkor("Jakarta STIN BIN", "Surabaya BIN Samator", 3, 0);
                inputSkor("Jakarta BNI 46", "Palembang Bank Sumsel Babel", 3, 1);
                
               
           
                inputSkor("Jakarta STIN BIN", "Surabaya BIN Samator", 3, 0);
                inputSkor("Kudus Sukun Badak", "Jakarta Bhayangkara Presisi", 0, 3);
                inputSkor("Palembang Bank Sumsel Babel", "Jakarta LavAni Allo Bank", 0, 3);
                inputSkor("Jakarta BNI 46", "Surabaya BIN Samator", 0, 3);
                inputSkor("Jakarta Pertamina Pertamax", "Jakarta Bhayangkara Presisi", 1, 3);
                inputSkor("Jakarta LavAni Allo Bank", "Kudus Sukun Badak", 3, 0);
                inputSkor("Palembang Bank Sumsel Babel", "Jakarta STIN BIN", 0, 3);
                inputSkor("Kudus Sukun Badak", "Jakarta BNI 46", 0, 3);
                inputSkor("Jakarta Pertamina Pertamax", "Jakarta STIN BIN", 2, 3);
                inputSkor("Palembang Bank Sumsel Babel", "Surabaya BIN Samator", 1, 3);
                
              
            
                inputSkor("Jakarta LavAni Allo Bank", "Surabaya BIN Samator", 3, 1);
                inputSkor("Jakarta STIN BIN", "Jakarta BNI 46", 3, 1);
                inputSkor("Palembang Bank Sumsel Babel", "Jakarta Bhayangkara Presisi", 0, 3);
                inputSkor("Jakarta LavAni Allo Bank", "Jakarta STIN BIN", 3, 0);
                inputSkor("Kudus Sukun Badak", "Jakarta Pertamina Pertamax", 0, 3);
                inputSkor("Palembang Bank Sumsel Babel", "Jakarta BNI 46", 0, 3);
                inputSkor("Kudus Sukun Badak", "Surabaya BIN Samator", 0, 3);
                inputSkor("Jakarta LavAni Allo Bank", "Jakarta Pertamina Pertamax", 3, 0);
                inputSkor("Jakarta Bhayangkara Presisi", "Jakarta BNI 46", 3, 2);
                

                inputSkor("Palembang Bank Sumsel Babel", "Jakarta Pertamina Pertamax", 3, 2);
                inputSkor("Jakarta Bhayangkara Presisi", "Surabaya BIN Samator", 3, 1);
                inputSkor("Jakarta LavAni Allo Bank", "Jakarta BNI 46", 3, 0);
                inputSkor("Kudus Sukun Badak", "Jakarta STIN BIN", 1, 3);
                inputSkor("Jakarta Pertamina Pertamax", "Surabaya BIN Samator", 0 ,3);
                inputSkor("Jakarta LavAni Allo Bank", "Jakarta Bhayangkara Presisi", 3, 0);
                inputSkor("Jakarta Pertamina Pertamax", "Jakarta BNI 46", 3, 1);
                inputSkor("Palembang Bank Sumsel Babel", "Kudus Sukun Badak", 3, 2);
                inputSkor("Jakarta STIN BIN", "Jakarta Bhayangkara Presisi", 3, 0);
                
                sortfinal();
                tampilputra();
    }

    public void skorfinal(){
        
            inputSkor("Jakarta STIN BIN", "Jakarta Bhayangkara Presisi", 3, 2);
            inputSkor("Jakarta LavAni Allo Bank", "Surabaya BIN Samator", 3, 0);
            inputSkor("Jakarta STIN BIN", "Surabaya BIN Samator", 3, 0);
            inputSkor("Jakarta LavAni Allo Bank", "Jakarta Bhayangkara Presisi", 3, 2);

           
            inputSkor("Jakarta Bhayangkara Presisi", "Surabaya BIN Samator", 3, 0);
            inputSkor("Jakarta LavAni Allo Bank", "Jakarta STIN BIN", 3, 1);
            inputSkor("Jakarta STIN BIN", "Jakarta Bhayangkara Presisi", 0, 3);
            inputSkor("Surabaya BIN Samator", "Jakarta LavAni Allo Bank",0, 3);

            
            inputSkor("Jakarta STIN BIN", "Surabaya BIN Samator", 3, 0);
            inputSkor("Jakarta LavAni Allo Bank", "Jakarta Bhayangkara Presisi", 3, 2);
            inputSkor("Jakarta Bhayangkara Presisi", "Surabaya BIN Samator", 3, 1);
            inputSkor("Jakarta LavAni Allo Bank", "Jakarta STIN BIN", 3, 1);
        sortfinal();
        grandfinal();
        }

    

    public void sortfinal(){
        if (head == null || head.next == null) {
            return; // Daftar kosong atau hanya satu elemen
        }
    
        TeamPutra sorted = null; // Daftar sementara untuk tim yang diurutkan
    
        TeamPutra current = head;
        while (current != null) {
            TeamPutra next = current.next; // Simpan next node sebelum memutuskan hubungan
            sorted = insertsort(sorted, current);
            current = next;
        }
    
        head = sorted; // Setel head ke daftar yang diurutkan
    }
    public TeamPutra insertsort(TeamPutra sorted, TeamPutra newNode){
        if (sorted == null || sorted.poin < newNode.poin) {
            newNode.next = sorted;
            if (sorted != null) {
                sorted.prev = newNode;
            }
            newNode.prev = null;
            return newNode;
        } else {
            TeamPutra current = sorted;
            while (current.next != null && current.next.poin >= newNode.poin) {
                current = current.next;
            }
            newNode.next = current.next;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        return sorted;
    }

    public TeamPutra[] ambil4final() {
        TeamPutra[] final4 = new TeamPutra[4];
        TeamPutra current = head;
    
        // Inisialisasi 4 tim teratas
        for (int i = 0; i < 4 && current != null; i++) {
            final4[i] = current;
            current = current.next;
        }
    
        // Bandingkan dengan sisa tim untuk mendapatkan 4 teratas
        while (current != null) {
            for (int i = 0; i < 4; i++) {
                if (current.poin > final4[i].poin) {
                    // Geser tim yang lebih rendah
                    for (int j = 3; j > i; j--) {
                        final4[j] = final4[j - 1];
                    }
                    final4[i] = current;
                    break;
                }
            }
            current = current.next;
        }
    
        return final4;
    }

    
    public void grandfinal(){
        
        TeamPutra[] final4 = ambil4final();
        
        System.out.println("====================================================");
        System.out.printf("| %-3s | %-30s | %-10s |\n", "No", "Nama Tim", "Poin");
        System.out.println("=====================================================");
        for (int i = 0; i < final4.length; i++) {
            if (final4[i] != null) {
                System.out.printf("| %-3d | %-30s | %-10d |\n", (i + 1), final4[i].nama, final4[i].poin);
    }
}
System.out.println("=====================================================");
    }

    public void tampiljuara(){
        if (!kosongputra()) {
            TeamPutra current = head;
            int i = 1;
            System.out.println("====================================================");
            System.out.printf("| %-3s | %-30s | %-10s |\n", "Juara", "Nama Tim", "Poin");
            System.out.println("=====================================================");
            while (current != null) {
                System.out.printf("| %-3d | %-30s | %-10d |\n" , i, current.nama, current.poin);
                current = current.next;
                i++;
            }
            System.out.println("===============================================");
            System.out.println("jumlah tim: "+ sizeputra);
        }else{
            System.out.println("kosong");
        }
    }


}