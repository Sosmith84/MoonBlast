/*
 * File: Timer.java
 * Author: Andrew Doss adoss2@uab.edu
 * Assignment: Group
 * Vers: 1.0.0 4/22/2019 add - initial coding  
 */
package uab.tedwa98.ee333;

/**
 *
 * @author Andrew Doss
 */
public class Timer {
    
    private int time;
    private int level;
    
    public Timer(){
        this.time = 9999;
        decreaseTime();
    }
    
    public int getLevel(){
        return level;
    }
    
    public void decreaseTime(){
        while(true){
            if(time <=0){
                time = 9999;
                level++;
            }
            else{
                time--;
            }
        }
    }
}
