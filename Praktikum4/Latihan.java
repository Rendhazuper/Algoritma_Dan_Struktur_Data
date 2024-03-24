package Praktikum.Praktikum4;

import java.util.Scanner;

public class Latihan {
     public String merk, tipe;
    public int tahun, top_acc, top_pow;

    public Latihan(String merk, String tipe, int tahun, int top_acc, int top_pow) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.top_acc = top_acc;
        this.top_pow = top_pow;
    }

    public int TopAcc() {
        return top_acc;
    }

    public int TopPow() {
        return top_pow;
    }

    public static int HighestAcc(Latihan[] showrooms, int l, int r) {
        if (l == r) {
            return l;
        }
        int mid = l + (r - l) / 2;

        int mr = HighestAcc(showrooms, mid + 1, r);
        int ml = mid;

        if (showrooms[mr].TopAcc() > showrooms[ml].TopAcc()) {
            ml = mr;
        }

        mr = HighestAcc(showrooms, l, mid);

        if (showrooms[mr].TopAcc() > showrooms[ml].TopAcc()) {
            ml = mr;
        }
        return ml;
    }

    public static int LowestAcc(Latihan[] showrooms, int l, int r) {
        if (l == r) {
            return l;
        }

        int mid = l + (r - l) / 2;

        int mr = LowestAcc(showrooms, mid + 1, r);
        int ml = mid;

        if (showrooms[mr].TopAcc() < showrooms[ml].TopAcc()) {
            ml = mr;
        }
        mr = LowestAcc(showrooms, l, mid);

        if (showrooms[mr].TopAcc() < showrooms[ml].TopAcc()) {
            ml = mr;
        }

        return ml;
    }

    public static double AvgPower(Latihan[] showrooms) {
        double totPow = 0;
        int totMobil = 0;
        for (Latihan showroom : showrooms) {
            totPow += showroom.TopPow();
            totMobil++;
        }
        return totPow / totMobil;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // System.out.println("Masukkan jumlah mobil");
        // int jml = input.nextInt();
        // input.nextLine();
        Latihan[] mobil = new Latihan[8];

        mobil[0] = new Latihan("BMW", "M2 Coupe", 2016, 6816, 728);
        mobil[1] = new Latihan("Ford", "Fiesta ST", 2014, 3921, 575);
        mobil[2] = new Latihan("Nissan", "370Z", 2009, 4360, 657);
        mobil[3] = new Latihan("Subaru", "BRZ", 2014, 4058, 609);
        mobil[4] = new Latihan("Subaru", "MImpreza WRX STI", 2013, 6255, 703);
        mobil[5] = new Latihan("Toyota", "MAE86 Trueno", 1986, 3700, 553);
        mobil[6] = new Latihan("Toyota", "86/GT86", 2014, 4180, 609);
        mobil[7] = new Latihan("Volkswagen", "Golf GTI", 2014, 4180, 631);

        int highIndex = Latihan.HighestAcc(mobil, 0, mobil.length - 1);
        int lowIndex = Latihan.LowestAcc(mobil, 0, mobil.length - 1);
        double avg = Latihan.AvgPower(mobil);

        System.out.println(
                "Mobil dengan akselerasi tertinggi : " + mobil[highIndex].merk + " : " + mobil[highIndex].tipe + " : "
                        + mobil[highIndex].top_acc);
        System.out.println("Mobil dengan akselerasi terndah : " + mobil[lowIndex].merk + " : " + mobil[lowIndex].tipe
                + " : " + mobil[lowIndex].top_acc);
        System.out.println("Rata2 power semua mobil adalah " + avg);

        input.close();
    }

}


