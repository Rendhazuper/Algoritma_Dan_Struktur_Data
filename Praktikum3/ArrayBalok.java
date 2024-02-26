package Praktikum.Praktikum3;

class balok {
    public int panjang, lebar, tinggi;

    public balok(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
        
    }

    public int hitungVolume()
    {
        return panjang * lebar * tinggi;
    }
}

public class ArrayBalok {

    public static void main(String[] args) {
        balok[] blArray = new balok[3];
        blArray [0] = new balok (100,30,12); 
        blArray [1] = new balok (120,40,15); 
        blArray [2] = new balok (210,50,25); 

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke "+ blArray[i].hitungVolume());
        }
    }
       
}

