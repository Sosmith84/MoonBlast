/*
 * File: MoonBlast.java
 * Author: Shawn Smith ssmith84@uab.edu
 * Assignment:  MoonBlast - EE333 Spring 2019
 * Vers: 1.0.0 03/25/2019 SOS - initial coding
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
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.RotateEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Shawn Smith ssmith84@uab.edu
 */
public class MoonBlast extends Application{
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Shoot!");
        
//        String asteroidPic = "Asteroid.png";
//        
//        Image asteroid = new Image(new File(asteroidPic).toURI().toString());
//        ImageView imageView = new ImageView(asteroid);
//        RotateTransition rT = new RotateTransition();
//        ScaleTransition sT = new ScaleTransition(Duration.millis(5000));
//        
//        
//        rT.setDuration(Duration.millis(5000));
//        rT.setNode(imageView);
//        sT.setNode(imageView);
//        rT.setByAngle(360);
//        sT.setByX(1.5);
//        sT.setByY(1.5);
//        rT.setCycleCount(5);
//        sT.setCycleCount(5);
//        rT.setAutoReverse(false);
//        sT.setAutoReverse(false);
//        sT.play();
//        rT.play();
//        
//        imageView.setX(50); 
//        imageView.setY(25); 
//      
//        //setting the fit height and width of the image view 
//        imageView.setFitHeight(455); 
//        imageView.setFitWidth(500); 
//
//        //Setting the preserve ratio of the image view 
//        imageView.setPreserveRatio(true);  

        Asteroid asteroid = new Asteroid();
        
        Group root = new Group();
        root.getChildren().add(asteroid.getIV());
        Scene theScene = new Scene( root, 650,800 );
        theScene.setOnRotationFinished(new EventHandler<RotateEvent>() {
            @Override
            public void handle(RotateEvent t) {

            }
        });
        primaryStage.setScene( theScene );
        primaryStage.show();
        
        
        
        

//        primaryStage.setTitle("Shoot!");
//        
//        String musicFile = "Laser_Shoot2.wav";
//        
//        Media sound = new Media(new File(musicFile).toURI().toString());
//        MediaPlayer mediaPlayer = new MediaPlayer(sound);
//        MediaView mv = new MediaView(mediaPlayer);
//        
//        Group main = new Group();
//        Scene scene = new Scene(main, 300, 300);
//
//        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
//            @Override
//            public void handle(KeyEvent t) {
//                switch (t.getCode()){
//                    case Q:
//                        mediaPlayer.stop();
//                        mediaPlayer.play();
//                        break;
//                    case W:
//                        mediaPlayer.stop();
//                        mediaPlayer.play();
//                        break;
//                    case E:
//                        mediaPlayer.stop();
//                        mediaPlayer.play();
//                        break;
//                    case A:
//                        mediaPlayer.stop();
//                        mediaPlayer.play();
//                        break;
//                    case S:
//                        mediaPlayer.stop();
//                        mediaPlayer.play();
//                        break;
//                    case D:
//                        mediaPlayer.stop();
//                        mediaPlayer.play();
//                        break;
//                    case Z:
//                        mediaPlayer.stop();
//                        mediaPlayer.play();
//                        break;
//                    case X:
//                        mediaPlayer.stop();
//                        mediaPlayer.play();
//                        break;
//                    case C:
//                        mediaPlayer.stop();
//                        mediaPlayer.play();
//                        break;
//                    case NUMPAD1:
//                        mediaPlayer.stop();
//                        mediaPlayer.play();
//                        break;
//                    case NUMPAD2:
//                        mediaPlayer.stop();
//                        mediaPlayer.play();
//                        break;
//                    case NUMPAD3:
//                        mediaPlayer.stop();
//                        mediaPlayer.play();
//                        break;
//                    case NUMPAD4:
//                        mediaPlayer.stop();
//                        mediaPlayer.play();
//                        break;
//                    case NUMPAD5:
//                        mediaPlayer.stop();
//                        mediaPlayer.play();
//                        break;
//                    case NUMPAD6:
//                        mediaPlayer.stop();
//                        mediaPlayer.play();
//                        break;
//                    case NUMPAD7:
//                        mediaPlayer.stop();
//                        mediaPlayer.play();
//                        break;
//                    case NUMPAD8:
//                        mediaPlayer.stop();
//                        mediaPlayer.play();
//                        break;
//                    case NUMPAD9:
//                        mediaPlayer.stop();
//                        mediaPlayer.play();
//                        break;
//                }
//                
//            }
//            
//        });
//
//        main.getChildren().add(mv);
//        primaryStage.setScene(scene);
//        primaryStage.show();

        
        
        
    }
}
