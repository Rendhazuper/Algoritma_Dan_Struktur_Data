package Praktikum.Kuis;

public class TeamPutra {
    
    String nama;
    int poin;
    TeamPutra prev, next;

    public TeamPutra(TeamPutra prev, String nama, int poin, TeamPutra next){
        this.nama = nama; 
        this.poin = poin;
    }

    public TeamPutra(){
        
    }
}
