/*
 * File: HUD.java
 * Author: Andrew Doss adoss2@uab.edu
 * Assignment: Group Project
 * Vers: 1.0.0 4/18/2019 add - initial coding  
 */
package uab.tedwa98.ee333;
import javafx.scene.media.*;

/**
 *
 * @author Andrew Doss
 */
public class HUD {
    
    private int health;
    private int score;
    private int bombcount;
    private boolean currentLaser; //Fire = true, ice = false;
    private final String gameover = "GAME OVER";
    
    public HUD(){
        this.health = 100;
        this.score = 0;
        this.bombcount = 3;
        this.currentLaser = true;
    }

    public int getHealth() {
        return health;
    }

    public int getScore() {
        return score;
    }

    public int getBombcount() {
        return bombcount;
    }
    
    

    public boolean isCurrentLaser() {
        return currentLaser;
    }
    
    /**
     * reduce health by value given by meteor
     * @param pain 
     */
    public void changeHealth(int pain){
        this.health += pain; //pain is negative for meteors, positive for restores
        if(health < 0){
            health = 0;
            lose();
        } else if(health > 100){
            health = 100;
        }
    }
    
    
    public void increaseScore(int point){
        this.score += point;
    }
    
//    public void reduceBomb(){
//        this.bombcount --;
//    }
//    
//    public void increaseLevel(){
//        this.level++;
//    }
    
    
    
    public void lose(){
        
    }
    
    
}
