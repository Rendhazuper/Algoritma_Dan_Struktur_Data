package Praktikum.UTS;
/**
 * Data
 */
import java.util.*;


public class Data {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Sorting method = new Sorting();
        int data[] = {9,40,44,13,26,40,14,35,4,13,10,19,35,39,11,27,43};
        

        System.out.println("DATA UTS POLINEMA");
        System.out.println("-------------------------------------------------");
        System.out.println("\t \t  DATA ASLI  \t \t");
        for (int i = 0; i < data.length; i++) {
         System.out.print(data[i] + " ");   
        }
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("\t  \t  HASIL  MERGE SORT  \t \t");
        method.mergeSort(data);
        method.printArray(data);
        System.out.println("-------------------------------------------------");
        System.out.println("\t  \t  PENCARIAN DATA  \t \t");
        System.out.print("data yang ingin dicari :");
        int cari = input.nextInt();
        int hasil = method.findBinarySearch(data, cari, 0, data.length - 1);
        method.hasilbinary(hasil);

    }
 
}
