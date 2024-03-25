package Praktikum.Praktikum5;

/**
 * DaftarMahasiswaBerprestasi
 */
public class DaftarMahasiswaBerprestasi {

    Mahasiswa listmhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m){
        if (idx<listmhs.length) {
            listmhs[idx]=m ;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh!!");
        }
    }

    void tampil(){
        for(Mahasiswa m : listmhs){
            m.tampil();
            System.out.println("--------------------------------------");
        }
    }
    void bubbleSort(){
        for (int i = 0; i < listmhs.length-1 ; i++) {
            for (int j = 1; j < listmhs.length-i; j++) {
                if (listmhs[j].ipk > listmhs [j-1].ipk) {
                    Mahasiswa temp = listmhs[j];
                    listmhs[j] = listmhs[j-1];
                    listmhs[j-1] = temp; 

                }
            }
        }
    }
    void insertionSort(){
        for (int i = 1; i < listmhs.length; i++) {
            Mahasiswa temp = listmhs[i];
            int j = i; 
            while (j > 0 && listmhs [j - 1].ipk > temp.ipk){
                listmhs[j] = listmhs [j - 1];
                j--;
            }
            listmhs[j] = temp;

        }
    }
}

