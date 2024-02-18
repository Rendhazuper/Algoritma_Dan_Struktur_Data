import java.util.Scanner;
public class Pemilihan {
    
    public static void main(String[] args) {
    
    Scanner key = new Scanner(System.in);
    int tugas, kuis, UTS, UAS;

    System.out.println("Program Menghitung Nilai Akhir");
    System.out.println("================================");
    System.out.print("Masukkan Nilai Tugas : ");
    tugas = key.nextInt();
    System.out.print("Masukkan Nilai Kuis : ");
    kuis = key.nextInt();
    System.out.print("Masukkan Nilai UTS : ");
    UTS = key.nextInt();
    System.out.print("Masukkan Nilai UAS : ");
    UAS = key.nextInt();

   double nilAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * UTS) + (0.4 * UAS);
  

    if (tugas >= 0 && tugas <= 100 && kuis >= 0 && kuis <= 100 && UTS >= 0 && UTS <= 100 && UAS >= 0 && UAS <= 100 ) {
        
        
        if (nilAkhir > 80 &&nilAkhir <= 100) {
            System.out.println("=====================");
            System.out.println("=====================");
            System.out.println("nilai akhir : " + nilAkhir);
            System.out.println("Nilai Huruf : A");
            System.out.println("=====================");
            System.out.println("=====================");
            System.out.println("SELAMAT ANDA LULUS");
            
        }else if(nilAkhir > 73 && nilAkhir <= 80) {
            System.out.println("=====================");
            System.out.println("=====================");
            System.out.println("nilai akhir : " + nilAkhir);
            System.out.println("Nilai Huruf : B+");
            System.out.println("=====================");
            System.out.println("=====================");
            System.out.println("SELAMAT ANDA LULUS");
        }else if (nilAkhir > 65 && nilAkhir <= 73){
            System.out.println("=====================");
            System.out.println("=====================");
            System.out.println("nilai akhir : " + nilAkhir);
            System.out.println("Nilai Huruf : B");
            System.out.println("=====================");
            System.out.println("=====================");
            System.out.println("SELAMAT ANDA LULUS");
        }else if (nilAkhir > 60 && nilAkhir <= 65){
            System.out.println("=====================");
            System.out.println("=====================");
            System.out.println("nilai akhir : " + nilAkhir);
            System.out.println("Nilai Huruf : C+");
            System.out.println("=====================");
            System.out.println("=====================");
            System.out.println("SELAMAT ANDA LULUS");
        }else if (nilAkhir > 50 && nilAkhir <= 60){
            System.out.println("=====================");
            System.out.println("=====================");
            System.out.println("nilai akhir : " + nilAkhir);
            System.out.println("Nilai Huruf : C");
            System.out.println("=====================");
            System.out.println("=====================");
            System.out.println("SELAMAT ANDA LULUS");
        }else if (nilAkhir > 39 && nilAkhir <= 50){
            System.out.println("=====================");
            System.out.println("=====================");
            System.out.println("nilai akhir : " + nilAkhir);
            System.out.println("Nilai Huruf : D");
            System.out.println("=====================");
            System.out.println("=====================");
            System.out.println("SELAMAT ANDA TIDAK LULUS");
        }else if(nilAkhir <= 39){
            System.out.println("=====================");
            System.out.println("=====================");
            System.out.println("nilai akhir : " + nilAkhir);
            System.out.println("Nilai Huruf : E");
            System.out.println("=====================");
            System.out.println("=====================");
            System.out.println("SELAMAT ANDA TIDAK LULUS");
        }

        
    } else {
        System.out.println("=====================");
        System.out.println("=====================");
        System.out.println("nilai tidak valid");
        System.out.println("=====================");
        System.out.println("=====================");
        
    }
    }
}
