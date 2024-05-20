package Praktikum.Kuis;
import java.util.*;

public class Volimain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Method panggil = new Method();

        panggil.tambahputra("Jakarta STIN BIN",0);
        panggil.tambahputra("Jakarta BNI 46",0);
        panggil.tambahputra("Jakarta Bhayangkara Presisi",0);
        panggil.tambahputra("Jakarta Pertamina Pertamax",0);
        panggil.tambahputra("Kudus Sukun Badak",0);
        panggil.tambahputra("Jakarta LavAni Allo Bank",0);
        panggil.tambahputra("Palembang Bank Sumsel Babel",0);
        panggil.tambahputra("Surabaya BIN Samator",0);

    

        while (panggil.pilih != 0) {
            panggil.menu();

            switch (panggil.pilih) {
                case 1:
                    panggil.tampilputra();
                    break;
                
                case 2:
                    panggil.pertandinganputra();
                    panggil.sortfinal();
                    System.out.println( "============= Tim Yang Menuju Grand Final ============= ");
                    panggil.grandfinal();
                    System.out.println("Tandingkan ? : ");
                    System.out.println("1. ya   ");
                    System.out.println("2. tidak   ");
                    int tanding = input.nextInt();
                    if (tanding == 1) {
                        panggil.skorfinal();
                        System.out.println( "============= Kelasemen Proliga 2023 ============= ");
                        panggil.tampiljuara();
                    
                    }
                    break;

                case 3:
                
                default:
                break;
            }
        }
        

    

    }
}
