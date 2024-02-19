package Praktikum.Praktikum2;

public class Dragon {
    int x,y,width, height;


    void moveLeft(){
        x -= 1;
        if (x < 0) {
            detectCollision();
        }
    }

    void moveRight(){
        x += 1;
        if (x > width) {
            detectCollision();
        }
    }

    void moveUp(){
        y -= 1;
        if (y > 0) {
            detectCollision();
        }
    }

    void moveDown(){
        y += 1;
        if (y > 0) {
            detectCollision();
        }
    }

    void printPosition(){
        System.out.print("your position now");
        System.out.println("(" + x + "," +y+ ")");
        
    }

    void detectCollision(){
            System.out.println("Game over");
            System.exit(0);
        }
        
    }



