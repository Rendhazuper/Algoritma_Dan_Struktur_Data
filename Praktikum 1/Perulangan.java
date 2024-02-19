import java.util.*;
public class Perulangan {
    
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        double NIM;

        System.out.print("Masukkan NIM : ");
        NIM = key.nextDouble();
        System.out.println("====================");
        double duadigit = NIM;
        double digit = duadigit % 100;
        System.out.println("N = "+digit);

        if (digit < 10) {
            digit += 10;
        }

        for (int i = 1; i <= digit; i++) {
            if (i != 6 && i != 10) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }else{
                    System.out.print("* ");
                }
            }
        }
    }
}
