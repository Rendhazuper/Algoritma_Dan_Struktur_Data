package Praktikum.Praktikum11.Tugas;

public class Film {

    
    int id;
    String judul;
    float rating;
    Film prev, next;

    public Film(Film prev, int id, String judul, float rating, Film next){
        this.prev = prev;
        this.id = id;
        this.judul = judul ;
        this.rating = rating;
        this.next = next;
    }

    public Film (){

    }
}


