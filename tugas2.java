import java.util.*;
public class tugas2 {

    static int kecepatan (int jarak, int waktu) { 
        int v; 
        int s = jarak; 
        int t = waktu;

        v = s/t;

        return v;
    }
    static int jarak (int kecepatan, int waktu){
        int s;
        int v = kecepatan; 
        int t = waktu;

        s = v*t;

        return s;
    }
    static int waktu (int jarak, int kecepatan){
        int t;
        int v = kecepatan;
        int s = jarak; 

        t = s / v;

        return t;
    }

    public static void main(String[] args) {
        int v, s, t, menu;
        Scanner key = new Scanner (System.in);

        System.out.println("masukkan data kecepatan : ");
        v = key.nextInt();
        System.out.println("masukkan data jarak : ");
        s = key.nextInt();
        System.out.println("masukkan data waktu : ");
        t = key.nextInt();
        System.out.println("===============================");
        System.out.println("            Data Anda          ");
        System.out.println("V = "+v+" S = "+s+ " T = "+t);
        System.out.println();
        System.out.println("===========  Menu  ============");
        System.out.println("1. Kecepatan");
        System.out.println("2. jarak");
        System.out.println("3. Waktu");
        System.out.print("pilih menu : ");
        menu = key.nextInt();

        switch (menu) {
            case 1:
                System.out.println(kecepatan(s, t) + " km/j");
                break;
            case 2:
            System.out.println(jarak(v, t)+ " km");
            break;
            case 3:
            System.out.println(waktu(s, v)+ " jam");
            break; 
            default:
                break;
        }
    }
}
