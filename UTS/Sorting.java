package Praktikum.UTS;

public class Sorting {

    void mergeSort (int [] data){
        sort(data, 0, data.length - 1);
      }
      
      void sort(int data[], int left, int right){
        if(left < right){
           int middle = (left + right)/ 2;
           sort(data,left,middle);
           sort(data,middle + 1,right);
           merge(data, left, middle, right);
        }
     }
      void merge(int data[], int left, int middle, int right){
       int[] temp  = new int[data.length];
       for (int i = left; i <= right; i++) {
          temp[i] = data[i];
       }   
       int a = left;
       int b = middle + 1;
       int c = left;
  
       while (a <= middle && b <= right) {
          if (temp[a] <= temp [b]) {
              data [c] = temp [a];
              a++;
          }else{
          data[c] = temp[b];
          b++;
       }
       c++;
      }
      int s = middle - a; 
      for (int i = 0; i <= s ; i++) {
        data[c  +i] = temp[a + i];
      }
     }

     int findBinarySearch(int [] data, int cari, int left, int right) {

        if (right >= left) {
            int mid = (right + left) / 2;
    
            if (cari == data[mid]) {
                return mid; 
            } else if (cari < data[mid]) {
                return findBinarySearch(data, cari, left, mid - 1);
            } else {
                return findBinarySearch(data, cari, mid + 1, right);
            }
        }
        return -1;
    }
  
    
    void hasilbinary(int index) {
        if (index != -1) {
            System.out.println("Elemen ditemukan pada indeks: " + index);
        } else {
            System.out.println("Elemen tidak ditemukan dalam array.");
        }
    }

    void printArray(int data[]){
        for (int i = 0; i < data.length; i++) {
           System.out.print(data[i]+ " ");
        }
        System.out.println();
     }
}
