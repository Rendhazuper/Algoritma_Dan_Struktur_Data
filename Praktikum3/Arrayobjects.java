package Praktikum.Praktikum3;


import java.util.*;


class PresegiPanjang {
    public int panjang;
    public int lebar;
}

public class Arrayobjects {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Berapa banyak persegi panjang ? : ");
        int j = sc.nextInt();
        PresegiPanjang[] ppArray = new PresegiPanjang[j];

        for (int i = 0; i < ppArray.length; i++) 
        {
            int angka = i + 1;
            ppArray[i]  = new PresegiPanjang();
            System.out.println("Persegi panjang ke-"+angka);
            System.out.print("Masukkan panjang :");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan Lebar :");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < ppArray.length; i++) 
        {
            int angka = i + 1;
            System.out.println("persegi panjang ke-"+angka);    
            System.out.println("Panjang : "+ ppArray[i].panjang+ " lebar : "+ppArray[i].lebar);
        }
    }
}
