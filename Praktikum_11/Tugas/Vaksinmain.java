package Praktikum.Praktikum_11.Tugas;
import java.util.*;

public class Vaksinmain {
   public static void main(String[] args) throws Exception {
    //array menu
  

    //instance scanner
    Scanner input = new Scanner(System.in);
    Vaksin vk = new Vaksin ();

    //main menu 
    int pilih = -1;
    while (pilih != 4) {
        vk.menu();
        System.out.print("Input menu : ");
        pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan data penerima vaksin");
                    System.out.println("-----------------------------");
                    System.out.println("Nomor antrian : ");
                    int antrian = input.nextInt();
                    System.out.println("Nama Penerima  : ");
                    input.nextLine();
                    String penerima = input.nextLine();
                    vk.add(antrian, penerima);
                    
                break;
                case 2:
                vk.remove(); 
                    break;
                case 3:
                vk.print();
                break;
            }
     
    }
      
    }
    
    //testing code 
    // vk.add(1, "budi");
    // vk.add(2, "bagogo");
    // vk.print();




   }

