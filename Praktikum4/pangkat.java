package Praktikum.Praktikum4;

/**
 * pangkat
 */
public class pangkat {
int nilai, pangkat;
    
int PangkatBF(int a, int n) {
    int hasil = 1;
    for (int i = 0; i < n; i++) {
        hasil *= a;
    }
    return hasil;
}
int PangkatDC(int a, int n) {
    if (n == 0) {
        return 1;
    } else {
        if (n % 2 == 1) {// ganjil
            return (PangkatDC(a, n / 2) * PangkatDC(a, n / 2) * a);
        } else {
            return (PangkatDC(a, n / 2) * PangkatDC(a, n / 2));
        }
    }
}

}