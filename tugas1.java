import java.util.*;
public class tugas1 {
    
    public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    char pilih; 
    char [] KODE = {'A', 'B', 'D', 'E', 'F', 'G' , 'H', 'L', 'N', 'T'};
    char [][] KOTA = {
    { 'B', 'A', 'N', 'T', 'E', 'N' },
    { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
    { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
    { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
    { 'B', 'O', 'G', 'O', 'R' },
    { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
    { 'S', 'E', 'M', 'A', 'R','A', 'N', 'G' },
    { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
    { 'M', 'A', 'L', 'A', 'N', 'G' },
    { 'T', 'E', 'G', 'A', 'L' }
    };

    System.out.println("pilih plat nomor");
    for (int i = 0; i < KODE.length; i++) {
        int nomor = i +1;
        System.out.println(nomor + "." + KODE[i]);
    }
    System.out.print(":");
    pilih = key.next().charAt(0);

    for (int i = 0; i < KODE.length; i++) {
        for (int j = 0; j < KOTA[i].length; j++) {
            if (Character.toLowerCase(pilih) == Character.toLowerCase(KODE[i]) ) {
            System.out.print(KOTA[i][j]);
            }
            
        }
       
    }
    }
}
