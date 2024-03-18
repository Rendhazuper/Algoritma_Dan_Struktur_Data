package Praktikum.Praktikum4;

import java.util.*;

class Faktorial {
int nilai; 

 Faktorial(int nilai){
        this.nilai = nilai;
    }

int FaktorialBF(int n){
    int fakto = 1;
    int i = 1;
    while (i <= n) {
        fakto = fakto * i;
        i++;
    }
    return fakto;
}
    
int FaktorialDC(int n){
if(n==1){
    return 1;
} else {
    int fakto = n * FaktorialDC(n-1);
    return fakto;
}
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("--------------------");
    System.out.println("Masukkan jumlah elemen: ");
    int iJml = sc.nextInt();

    Faktorial[] fk = new Faktorial[iJml];
    for (int i = 0; i <iJml; i++) {
        System.out.println("masukkan nilai data ke-" + (i+1)+":");
        int iNilai = sc.nextInt();
        fk[i] = new Faktorial(iNilai);
        
    }

    System.out.println("HASIL - BRUTE FORCE");
    for (int i = 0; i < iJml; i++) {
        System.out.println("Hasil penghitung faktorial menggunakan Brute Force adalah "
        + fk[i].FaktorialBF(fk[i].nilai));
    }
    System.out.println("HASIL - DEVIDE AND CONQUER");
    for (int i = 0; i < iJml; i++) {
        System.out.println("Hasil penghitungan faktorial menggunakan Devide and Conquer adalah "
        + fk[i].FaktorialDC(fk[i].nilai));
    }
}
}

