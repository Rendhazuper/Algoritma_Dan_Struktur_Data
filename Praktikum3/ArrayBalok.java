package Praktikum.Praktikum3;
import java.util.* ;

class segitiga{
    public int alas;
    public int tinggi;
    public int sisi;

    public segitiga(int a, int t) {
        alas = a;
        tinggi = t;
        //TODO Auto-generated constructor stub
    }


    public double hitungLuas(){
        double luas = (double) 0.5 * alas * tinggi;
     return luas;
    }
    public double hitungKeliling(){
        double miring = Math.sqrt(alas * alas + tinggi * tinggi);
        return 2 * miring + alas;
    }

}
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
        Scanner key = new Scanner(System.in);
        balok[] blArray = new balok[3];
        blArray [0] = new balok (100,30,12); 
        blArray [1] = new balok (120,40,15); 
        blArray [2] = new balok (210,50,25); 

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke "+ blArray[i].hitungVolume());
        }
       
        segitiga[] sgArray = new segitiga[4];
        sgArray[0] = new segitiga(10,4);
        sgArray[1] = new segitiga(20,10);
        sgArray[2] = new segitiga(15,6);
        sgArray[3] = new segitiga(25,10);
        for (int i = 0; i < sgArray.length; i++) {

            System.out.println("Luas dari segitiga ke-"+i+ " adalah : "+ sgArray[i].hitungLuas());
            System.out.println("Keliling dari segitiga ke-"+i+ " adalah : "+ sgArray[i].hitungKeliling());
         
           
        }

    }
       
}

