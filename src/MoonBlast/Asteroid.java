/*
 * File: Asteroid.java
 * Author: Shawn Smith ssmith84@uab.edu
 * Assignment:  MoonBlast - EE333 Spring 2019
 * Vers: 1.0.0 04/22/2019 SOS - initial coding
 *
 * Credits:  (if any for sections of code)
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoonBlast;

import java.io.File;
import java.util.Random;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import javafx.application.Application;

/**
 *
 * @author Shawn Smith ssmith84@uab.edu
 */
public class Asteroid{
    private int x;
    private int y;
    private boolean exists;
    private double size;
    private double sizeMax;
    private int position;
    private Random r = new Random();
    
    String asteroidPic = "Asteroid.png";
    
    public String getAsteroid(){
        
    }
    
    public void choosePosition(){
        position = r.nextInt(8) + 1;
        switch(position){
            case 1:
                x = 80;
                y = 80;
                break;
            case 2:
                x = 250;
                y = 80;
                break;
            case 3:
                x = 400;
                y = 80;
                break;
            case 4:
                x = 80;
                y = 240;
                break;
            case 5:
                x = 240;
                y = 240;
                break;
            case 6:
                x = 400;
                y = 240;
                break;
            case 7:
                x = 80;
                y = 400;
                break;
            case 8:
                x = 240;
                y = 400;
                break;
            case 9:
                x = 400;
                y = 400;
                break;
        }
        
    }
    
    public void destroyed(){
        exists = false;
        
    }
    
}
