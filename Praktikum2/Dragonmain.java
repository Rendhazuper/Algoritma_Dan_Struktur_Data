package Praktikum.Praktikum2;
import java.util.*;
public class Dragonmain {
    
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Dragon D1 = new Dragon();
        char move;
        D1.width = 10;
        D1.height = 10;
        int height = D1.height;
        int width = D1.width;
        System.out.print("Masukkan koordinat X : " );
        D1.x = key.nextInt();
        int x = D1.x;
        System.out.print("Masukkan koordinat y : ");
        D1.y = key.nextInt();
        int y = D1.y;
        D1.printPosition();
        while(x >  0 || x < width || y >  0 || y < height){
            System.out.println("move where ? (L/R/U/D)");
            key.nextLine();
            move = key.next().charAt(0);
            switch (move) {
                case 'L':
                D1.moveLeft();
                D1.printPosition();
                    break;
            
                case 'R':
                D1.moveRight();
                D1.printPosition();
                    break;
                
                case 'U':
                D1.moveUp();
                D1.printPosition();
                    break;

                case 'D':
                D1.moveDown();
                D1.printPosition();
                    break;
            }
            
        };
    }
    
}
