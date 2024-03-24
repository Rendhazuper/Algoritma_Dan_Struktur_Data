package Praktikum.Praktikum4;

public class Sum {
    int elemen;
    double keuntungan[], total;
    int perusahaan;

    Sum(int elemen, int perusahaan) {
        this.perusahaan = perusahaan;
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }

    double totalBF(double arr[]) {
        for (int i = 0; i < elemen; i++) {
            total += arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = l + (r - l) / 2;
            double lsum = totalDC(arr, l, mid - 1);
            double rsum = totalDC(arr, mid + 1, r);
            return (lsum + rsum) + arr[mid];
        }
        return 0;
    }

}