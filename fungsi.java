import java.util.*;
public class fungsi {

    static String [] cabang = {"RoyalGarden 1","RoyalGarden 2","RoyalGarden 3","RoyalGarden 4"};
    static int [][] Stok = 
    {{10,5,15,7},
     {6,11,9,12},
     {2,10,10,5},
     {5,7,12,9}};
    static int [] harga = {75000, 50000, 60000, 10000};
    static int[] pendapatan = new int[cabang.length];

    static void pendapatanfung () {
       
        for (int i = 0; i < cabang.length; i++) {
            int totalpendapatancabang = 0;
            for (int j = 0; j < Stok[i].length; j++) {
            totalpendapatancabang += harga[j] * Stok[i][j];
            }
            pendapatan[i] = totalpendapatancabang;
          
        }
    }
    static void cekStokBungaCabang(int cabang) {
        int cab = cabang;
        cab -= 1;

        System.out.println("====================================================================================");
        if (cab == 3) {
            Stok[cab][0] -= 1;
            Stok[cab][1] -= 2;
            Stok[cab][2] -= 0;
            Stok[cab][3] -= 5;
            System.out.printf("%-15s %-15s %-15s  %-15s \n", "Algonema", "Keladi", "Alocasia",
                    "Mawar");

            System.out.printf("%-15d %-15d %-15d  %-15d \n", Stok[cab][0], Stok[cab][1],
                    Stok[cab][2], Stok[cab][3]);
            System.out.println(
                    "pengurangan bunga :  Aglonema -1, Keladi -2, Alocasia -0, Mawar -5.(bunga mati)");
        } else {

            System.out.printf("%-15s %-15s %-15s  %-15s \n", "Algonema", "Keladi", "Alocasia",
                    "Mawar");

            System.out.printf("%-15d %-15d %-15d  %-15d \n", Stok[cab][0], Stok[cab][1],
                    Stok[cab][2], Stok[cab][3]);
        }
        System.out.println("====================================================================================");

    }

    public static void main(String[] args) {
        int menu;
        Scanner key = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("                 Admin Royal                 ");
        System.out.println("=============================================");
        System.out.println("menu :");
        System.out.println("1. pendapatan tiap cabang");
        System.out.println("2. cek stok");
        System.out.print("pilih menu : ");
        menu = key.nextInt();
        switch (menu) {
            case 1:
            pendapatanfung();
            System.out.println("Pendapatan tiap cabang");
            System.out.println("==========================");
            for (int i = 0; i < cabang.length; i++) {
            System.out.println(cabang[i] + " : " +pendapatan[i]);
            }
                break;
            case 2:
            int cabang;
                    System.out.println("====================");
                    System.out.println("cek stok cabang");
                    System.out.println("====================");
                    System.out.println("1. RoyalGarden 1");
                    System.out.println("2. RoyalGarden 2");
                    System.out.println("3. RoyalGarden 3");
                    System.out.println("4. RoyalGarden 4");
                    System.out.print("Pilih Cabang : ");
                    cabang = key.nextInt();
                    cekStokBungaCabang(cabang);

                break;
            default:
            System.out.println("input tidak valid");
                break;
        }
        

    
    
    }
}
