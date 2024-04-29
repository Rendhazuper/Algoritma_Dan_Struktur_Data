package Praktikum.Praktikum7;
import java.util.*;


public class PostfixMain24 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String P,Q;
    System.out.println("Masukkan ekspresi matematika (infix): ");
    Q = sc.nextLine();
    Q = Q.trim();
    Q = Q + ")";     

    int total = Q.length();
    Postfix24 post = new Postfix24(total);
    P = post.konversi(Q);
    System.out.println("Postfix : " + P);
    }

    
}
