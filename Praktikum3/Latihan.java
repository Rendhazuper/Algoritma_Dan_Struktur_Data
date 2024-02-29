package Praktikum.Praktikum3;
import java.util.*;


class bola {
    double jari2;
    double pi = 3.14;

    public double LPbola(){
        return 4 * pi * jari2 * jari2;
    }

    public double Vbola(){
        return 1.3 * Math.PI * jari2 * jari2 * jari2;
    }
}
class limas{
    double sisi;
    double tinggi; 

    public double LPlimas(){
        return (4 * (sisi * tinggi / 2)) + (sisi * sisi);
    }

    public double VolLimas(){
        return 0.33 * (sisi * sisi) * tinggi;
    }

}
class kerucut{
    double r;
    double selimut;

    public double hitungtinggi(){
        double tinggi = Math.sqrt(selimut * selimut - r * r);
        return tinggi;
    }
    public double LPkerucut(){
        return Math.PI * r * selimut + Math.PI * r * r;
    }
    public double Volkerucut(){
        return 0.33 * (Math.PI * r *r) * hitungtinggi();
    }
}

public class Latihan {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Pilih Bangun Ruang ");
        System.out.println("1. Kerucut");
        System.out.println("2. Limas segi empat sama sisi");
        System.out.println("3. Bola");
        System.out.println(" pilih : ");
        int menu = key.nextInt();

        switch (menu) {
            case 1:
            System.out.println("=============== Hitung Kerucut ================ ");
            kerucut[] kr = new kerucut[1];
            for (int i = 0; i < kr.length; i++) {
                kr[i] = new kerucut();
                System.out.println("Input jari-jari : ");
                kr[i].r = key.nextDouble();
                System.out.println("Input sisi mriing : ");
                kr[i].selimut = key.nextDouble();
                
    
                System.out.println("=============================");
                System.out.println(" Diketahui ");
                System.out.println("jari jari = "+ kr[i].r);
                System.out.println("selimut = "+ kr[i].selimut);
                System.out.println("tinggi = "+ kr[i].hitungtinggi());
                System.out.println("=============================");
                System.out.println("Luas permukaan  = "+ kr[i].LPkerucut());
                System.out.println("Volume = "+ kr[i].Volkerucut());
            }
                break;
            case 2:
            System.out.println("=============== Hitung Limas ================ ");
            limas[] lim = new limas[1];
            for (int i = 0; i < lim.length; i++) {
                lim[i] = new limas();
                System.out.print("Input sisi : ");
                lim[i].sisi = key.nextDouble();
                System.out.print("Input tinggi :  ");
                lim[i].tinggi = key.nextDouble();
                
    
                System.out.println("=============================");
                System.out.println(" Diketahui ");
                System.out.println("sisi persegi = "+ lim[i].sisi);
                System.out.println("tinggi = "+ lim[i].tinggi);
                System.out.println("=============================");
                System.out.println("Luas permukaan  = "+ lim[i].LPlimas());
                System.out.println("Volume = "+ lim[i].VolLimas());
            }
                break;
            
            case 3:
            System.out.println("=============== Hitung Bola ================ ");
            bola[] ball = new bola [1];
            for (int i = 0; i < ball.length; i++) {
                ball[i] = new bola();
                System.out.print("Input jari-jari : ");
                ball[i].jari2 = key.nextDouble();
             
                
    
                System.out.println("=============================");
                System.out.println(" Diketahui ");
                System.out.println("jari-jari= "+ ball[i].jari2);
                System.out.println("=============================");
                System.out.println("Luas permukaan  = "+ ball[i].LPbola());
                System.out.println("Volume = "+ ball[i].Vbola());
            }
                break;

            default:
                break;
        }
        
    }
    
}
