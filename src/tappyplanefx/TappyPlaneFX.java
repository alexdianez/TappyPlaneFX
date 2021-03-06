/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tappyplanefx;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javafx.animation.AnimationTimer;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene; 
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage; 
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.util.Duration;


/**
 *
 * @author alex
 */
public class TappyPlaneFX extends Application {
int posX= 0;
int posX2= 800;
int posXOBS= ThreadLocalRandom.current().nextInt(800, 1100);
int posXOBS2= ThreadLocalRandom.current().nextInt(1100, 1300);
int posXOBS3=ThreadLocalRandom.current().nextInt(1300, 1500);
int posXOBS4=ThreadLocalRandom.current().nextInt(1500, 1700);
double velocidad=-5;
int velocidadavion=0;
int posXAVION=100;
int posYAVION=0;
int posXScore=0;
int score=0;
Pane root;
Group groupAvion = new Group();
Ellipse elipse = new Ellipse(); 
Rectangle objObs = new Rectangle();
Rectangle objObs2 = new Rectangle();
Rectangle objObs3 = new Rectangle();
Rectangle objObs4 = new Rectangle();
Text puntuacion=new Text("0");
Image image10 = new Image( getClass().getResourceAsStream("recursos/GameOver.png"));
ImageView GameOver = new ImageView();
Image image11 = new Image(getClass().getResourceAsStream("recursos/enter.png"));
ImageView enter = new ImageView();
Image image3 = new Image(getClass().getResourceAsStream("recursos/obst.png"));
ImageView obst = new ImageView();
ImageView obst2 = new ImageView();
ImageView obst3 = new ImageView();
ImageView obst4 = new ImageView();
Image image4 = new Image(getClass().getResourceAsStream("recursos/s.png"));
Image image5 = new Image (getClass().getResourceAsStream("recursos/c.png"));
Image image6 = new Image (getClass().getResourceAsStream("recursos/o.png"));
Image image7 = new Image (getClass().getResourceAsStream("recursos/r.png"));
Image image8 = new Image (getClass().getResourceAsStream("recursos/e.png"));
Image image9 = new Image (getClass().getResourceAsStream("recursos/dospuntos.png"));
ImageView letraS = new ImageView();
ImageView letraC = new ImageView();
ImageView letraO = new ImageView();
ImageView letraR = new ImageView(); 
ImageView letraE = new ImageView();
ImageView dospuntos = new ImageView();
Rectangle rectabajo = new Rectangle();
Rectangle rectarriba = new Rectangle();
Image image2 = new Image (getClass().getResourceAsStream("recursos/suelo.png"));
ImageView suelo = new ImageView();
ImageView suelo2 = new ImageView();
ImageView fondo1 = new ImageView();
ImageView fondo2 = new ImageView();
Image image = new Image (getClass().getResourceAsStream("recursos/fondo.png"));
Image image13= new Image (getClass().getResourceAsStream("recursos/inicio.png"));
ImageView inicio = new ImageView();
AudioStream as2;
AudioStream as3;
Timeline mov;

    public void avion(){
       
       
        Ellipse elipse5 = new Ellipse(); 
        elipse5.setRotate(-50);
        elipse5.setCenterX(45.0f);
        elipse5.setCenterY(180.0f);
        elipse5.setRadiusX(7.0f);
        elipse5.setRadiusY(2.0f);
        elipse5.setFill(Color.BLACK);
        groupAvion.getChildren().add(elipse5);
        
        
        
          Polygon polygon = new Polygon();
        polygon.getPoints().addAll(new Double[]{
            65.0, 175.0,
            105.0, 185.0,
            105.0, 195.0 });
        polygon.setRotate(15);
        polygon.setFill(Color.BLACK);
        groupAvion.getChildren().add(polygon);
        
         Ellipse elipse2 = new Ellipse(); 
        elipse2.setRotate(50);
        elipse2.setCenterX(45.0f);
        elipse2.setCenterY(195.0f);
        elipse2.setRadiusX(20.0f);
        elipse2.setRadiusY(5.0f);
        elipse2.setFill(Color.RED);
        groupAvion.getChildren().add(elipse2);
        
//        Ellipse elipse = new Ellipse(); 
        elipse.setCenterX(85.0f);
        elipse.setCenterY(200.0f);
        elipse.setRadiusX(40.0f);
        elipse.setRadiusY(15.0f);
        elipse.setFill(Color.RED);
        groupAvion.getChildren().add(elipse);
        
         Polygon polygon2 = new Polygon();
        polygon2.getPoints().addAll(new Double[]{
            63.0, 215.0,
            103.0, 225.0,
            108.0, 235.0 });
        polygon2.setRotate(295);
        polygon2.setFill(Color.BLACK);
        groupAvion.getChildren().add(polygon2);
        
        Polygon polygon3 = new Polygon();
        polygon3.getPoints().addAll(new Double[]{
            24.0, 173.0,
            37.0, 183.0,
            34.0, 193.0 });
        polygon3.setRotate(295);
        polygon3.setFill(Color.RED);
        groupAvion.getChildren().add(polygon3);
        
        Rectangle rect = new Rectangle();
        rect.setRotate(90);
        rect.setX(60);
        rect.setY(200);
        rect.setWidth(10);
        rect.setHeight(5);
        rect.setArcWidth(5);
        rect.setArcHeight(5);
        rect.setFill(Color.WHITE);
        groupAvion.getChildren().add(rect);
        
        Rectangle rect2 = new Rectangle();
        rect2.setRotate(90);
        rect2.setX(70);
        rect2.setY(198);
        rect2.setWidth(5);
        rect2.setHeight(5);
        rect2.setArcWidth(10);
        rect2.setArcHeight(10);
        rect2.setFill(Color.BLACK);
        groupAvion.getChildren().add(rect2);
        
        Rectangle rect3 = new Rectangle();
        rect3.setRotate(90);
        rect3.setX(75);
        rect3.setY(198);
        rect3.setWidth(5);
        rect3.setHeight(5);
        rect3.setArcWidth(10);
        rect3.setArcHeight(10);
        rect3.setFill(Color.BLACK);
        groupAvion.getChildren().add(rect3);
        
         Rectangle rect4 = new Rectangle();
        rect4.setRotate(90);
        rect4.setX(80);
        rect4.setY(198);
        rect4.setWidth(5);
        rect4.setHeight(5);
        rect4.setArcWidth(10);
        rect4.setArcHeight(10);
        rect4.setFill(Color.BLACK);
        groupAvion.getChildren().add(rect4);
        
         Rectangle rect5 = new Rectangle();
        rect5.setRotate(90);
        rect5.setX(85);
        rect5.setY(198);
        rect5.setWidth(5);
        rect5.setHeight(5);
        rect5.setArcWidth(10);
        rect5.setArcHeight(10);
        rect5.setFill(Color.BLACK);
        groupAvion.getChildren().add(rect5);
        
         Rectangle rect6 = new Rectangle();
        rect6.setRotate(90);
        rect6.setX(90);
        rect6.setY(198);
        rect6.setWidth(5);
        rect6.setHeight(5);
        rect6.setArcWidth(10);
        rect6.setArcHeight(10);
        rect6.setFill(Color.BLACK);
        groupAvion.getChildren().add(rect6);
        
        Rectangle rect7 = new Rectangle();
        rect7.setRotate(90);
        rect7.setX(95);
        rect7.setY(198);
        rect7.setWidth(5);
        rect7.setHeight(5);
        rect7.setArcWidth(10);
        rect7.setArcHeight(10);
        rect7.setFill(Color.BLACK);
        groupAvion.getChildren().add(rect7);
        
        Rectangle rectatras = new Rectangle();
        rectatras.setRotate(90);
        rectatras.setX(55);
        rectatras.setY(198);
        rectatras.setWidth(5);
        rectatras.setHeight(5);
        rectatras.setArcWidth(10);
        rectatras.setArcHeight(10);
        rectatras.setFill(Color.BLACK);
        groupAvion.getChildren().add(rectatras);
        
        Rectangle ventana2 = new Rectangle();
        ventana2.setRotate(-25);
        ventana2.setX(110);
        ventana2.setY(193);
        ventana2.setWidth(10);
        ventana2.setHeight(7);
        ventana2.setArcWidth(10);
        ventana2.setArcHeight(10);
        ventana2.setFill(Color.BLACK);
        groupAvion.getChildren().add(ventana2);
        
        Rectangle ventana = new Rectangle();
        ventana.setRotate(-25);
        ventana.setX(111);
        ventana.setY(194);
        ventana.setWidth(8);
        ventana.setHeight(5);
        ventana.setArcWidth(10);
        ventana.setArcHeight(10);
        ventana.setFill(Color.AQUAMARINE);
        groupAvion.getChildren().add(ventana);
        
       Ellipse elipse6 = new Ellipse(); 
        elipse6.setRotate(-50);
        elipse6.setCenterX(33.0f);
        elipse6.setCenterY(195.0f);
        elipse6.setRadiusX(9.0f);
        elipse6.setRadiusY(2.0f);
        elipse6.setFill(Color.BLACK);
        groupAvion.getChildren().add(elipse6);

        root.getChildren().add(groupAvion);
        groupAvion.setScaleX(0.8);
        groupAvion.setScaleY(0.8);
        groupAvion.setLayoutX(posXAVION);
        groupAvion.setLayoutY(posYAVION);
        
    }

        @Override
    public void start(Stage primaryStage) throws IOException {
        //InputStream in = new FileInputStream("sonido.wav");
        // Create an AudioStream object from the input stream.
        AudioStream as = new AudioStream((getClass().getResourceAsStream("recursos/sonido.wav")));     
        as2 = new AudioStream((getClass().getResourceAsStream("recursos/iniciocancion.wav")));
        as3=  new AudioStream((getClass().getResourceAsStream("recursos/muerte.wav")));
        
        // Use the static class member "player" from class AudioPlayer to play
        // clip.       
        AudioPlayer.player.stop(as); 
        
         inicio.setImage(image13);
         fondo1.setImage(image);
         fondo2.setImage(image);
         
         inicio.setScaleX(0.7);
          inicio.setScaleY(0.7);
          inicio.setX(-70);
          inicio.setY(-100);
         
         suelo.setImage(image2);
         suelo2.setImage(image2);
         
         obst.setImage(image3);
         obst2.setImage(image3);
         obst3.setImage(image3);
         obst4.setImage(image3);
         
         
         
         letraS.setImage(image4);
         letraC.setImage(image5);
         letraO.setImage(image6);
         letraR.setImage(image7);
         letraE.setImage(image8);
         dospuntos.setImage(image9);
         
         
       
        root = new Pane(); 
        Scene scene = new Scene(root, 800, 400, Color.BLACK);
        primaryStage.setTitle("Tappy Plane");
        primaryStage.setScene(scene);
        primaryStage.show();
        Random aleatorio=new Random();
        //Objetos para colision

         mov = new Timeline(
            // 0.017 ~= 60 FPS
            new KeyFrame(Duration.seconds(0.017), new EventHandler<ActionEvent>() {
            public void handle (ActionEvent ae){  
               
                 //Colocamos el fondo
                fondo1.setX(posX);
                fondo2.setX(posX2);
                //Colocamos el suelo
                suelo.setY(335);
                suelo2.setY(335);
                suelo2.setX(posX2);
                suelo.setX(posX);
                //Colocamos los obstaculos
                //Eje X
                //Obstaculo 1
                obst.setY(200);
                obst.setX(posXOBS);
                //Obstaculo 2
                obst3.setY(250);
                obst3.setX(posXOBS2);
                //EjeY
                //Obstaculo 3
                obst2.setY(0);
                obst2.setX(posXOBS3);
                //Obstaculo 4
                obst4.setY(0);
                obst4.setX(posXOBS4);

               //Objetos para colision
                objObs.setRotate(0);
                objObs.setX(posXOBS+60);
                objObs.setY(200);
                objObs.setWidth(10);
                objObs.setHeight(800);
                objObs.setArcWidth(5);
                objObs.setArcHeight(5);
                objObs.setFill(Color.RED);
                objObs.setVisible(false);

                objObs2.setRotate(0);
                objObs2.setX(posXOBS2+60);
                objObs2.setY(250);
                objObs2.setWidth(10);
                objObs2.setHeight(800);
                objObs2.setArcWidth(5);
                objObs2.setArcHeight(5);
                objObs2.setFill(Color.RED);
                objObs2.setVisible(false); 

                objObs3.setRotate(0);
                objObs3.setX(posXOBS3+15);
                objObs3.setY(-680);
                objObs3.setWidth(10);
                objObs3.setHeight(800);
                objObs3.setArcWidth(5);
                objObs3.setArcHeight(5);
                objObs3.setFill(Color.RED);
                objObs3.setVisible(false); 

                objObs4.setRotate(0);
                objObs4.setX(posXOBS4+15);
                objObs4.setY(-610);
                objObs4.setWidth(10);
                objObs4.setHeight(800);
                objObs4.setArcWidth(5);
                objObs4.setArcHeight(5);
                objObs4.setFill(Color.RED);
                objObs4.setVisible(false); 

               //Redimensionado de imagenes
                obst2.setFitHeight(120);
                obst2.setFitWidth(54);
                obst2.setRotate(180);
                obst4.setFitHeight(190);
                obst4.setFitWidth(54);
                obst4.setRotate(180);
               
                
                //Colision
                Shape colision= Shape.intersect(rectabajo,elipse);
                Shape colision2= Shape.intersect(rectarriba,elipse);
                
                Shape colisionobs1= Shape.intersect(objObs,elipse);
                Shape colisionobs2= Shape.intersect(objObs2,elipse);
                Shape colisionobs3= Shape.intersect(objObs3,elipse);
                Shape colisionobs4= Shape.intersect(objObs4,elipse);

                boolean choque=colision.getBoundsInLocal().isEmpty();
                boolean choque2=colision2.getBoundsInLocal().isEmpty();
                
                boolean choqueobs1=colisionobs1.getBoundsInLocal().isEmpty();
                boolean choqueobs2=colisionobs2.getBoundsInLocal().isEmpty();
                boolean choqueobs3=colisionobs3.getBoundsInLocal().isEmpty();
                boolean choqueobs4=colisionobs4.getBoundsInLocal().isEmpty();
                //reinicia el juego
                if(choque==false){
                AudioPlayer.player.stop(as);
                     mov.pause();
                    gameover();
                    AudioPlayer.player.start(as3);
                }
                if(choque2==false){
               AudioPlayer.player.stop(as);
                     mov.pause();
                    gameover();
                    AudioPlayer.player.start(as3);
                }
                if(choqueobs1==false){
                  AudioPlayer.player.stop(as);
                     mov.pause();
                    gameover();
                    AudioPlayer.player.start(as3);
                }
                if(choqueobs2==false){
                     AudioPlayer.player.stop(as);
                     mov.pause();
                    gameover();
                    AudioPlayer.player.start(as3);
                }
                if(choqueobs3==false){
               AudioPlayer.player.stop(as);
                     mov.pause();
                    gameover();
                    AudioPlayer.player.start(as3);
                }
                if(choqueobs4==false){
                 AudioPlayer.player.stop(as);
                  AudioPlayer.player.start(as3);
                    mov.pause();
                    gameover();
                }
                puntuacion.setFont(Font.font(50));
                puntuacion.setFill(Color.BLACK);
                puntuacion.setText(String.valueOf(score));
                puntuacion.setX(170);
                puntuacion.setY(50);
                //Suma puntuacion
                if(choque==true){
                    score++;
                }
//                System.out.println(score);
                
               int min= 170;
               int max= 300;
                if(posXOBS<=-80){
                    int separacion=ThreadLocalRandom.current().nextInt(min, max);
                    posXOBS=posXOBS4+separacion;
                }
                if(posXOBS2<=-80){
                    int separacion=ThreadLocalRandom.current().nextInt(min, max);
                    posXOBS2=posXOBS+separacion;
                }
                if(posXOBS3<=-80){
                    int separacion=ThreadLocalRandom.current().nextInt(min, max);
                    posXOBS3=posXOBS2+separacion;
                }
                if(posXOBS4<=-80){
                    int separacion=ThreadLocalRandom.current().nextInt(min, max);
                    posXOBS4=posXOBS3+separacion;
                } 
                if(posX2==0){
                    posX=800;
                }
                if(posX==0){
                    posX2=800;
                }
                
                
                posXOBS+=velocidad;
                posXOBS2+=velocidad;
                posXOBS3+=velocidad;
                posXOBS4+=velocidad;
                posX+=velocidad;
                posX2+=velocidad;
                posYAVION+=velocidadavion;
                //Muestra posicion y velocidad
                System.out.println(velocidadavion);
                System.out.println(posYAVION);
                groupAvion.setLayoutY(posYAVION);
                };
            
        })
        );
        mov.setCycleCount(Timeline.INDEFINITE);
        scene.setOnKeyPressed((KeyEvent event) -> {
            switch(event.getCode()){
                case SPACE:
//                    if(score==1000){
//                    velocidadavion=-4;
//                    System.out.println(velocidadavion);
//                    System.out.println(score);
//                }
                    velocidadavion=-5;
                    groupAvion.setRotate(-30);
                    break;
               case ENTER:
//                  AudioPlayer.player.stop(as3); 
                  AudioPlayer.player.start(as);  
                  reiniciar();
                  mov.play();
                   break;
               case S:
                   AudioPlayer.player.stop(as2);
                    AudioPlayer.player.start(as);  
                     inicio();  
                     mov.play();
                    break;
                case M:
                    AudioPlayer.player.stop(as);  
                    break;
                }
        });
        scene.setOnKeyReleased((KeyEvent event) -> {
             velocidadavion=4;
             groupAvion.setRotate(30);
        });
        root.getChildren().add(fondo1);
        pantallainicio();
        }
    public void pantallainicio(){
        AudioPlayer.player.start(as2);
        root.getChildren().add(inicio);
    }
    public void inicio(){
         
        root.getChildren().add(fondo2);
        root.getChildren().add(objObs);
        root.getChildren().add(objObs2);
        root.getChildren().add(objObs3);
        root.getChildren().add(objObs4);
        root.getChildren().add(obst);
        root.getChildren().add(obst2);
        root.getChildren().add(obst3);
        root.getChildren().add(obst4);
        root.getChildren().add(rectabajo);
        root.getChildren().add(rectarriba);
        root.getChildren().add(suelo);
        root.getChildren().add(suelo2);
        root.getChildren().add(letraS);
        root.getChildren().add(letraC);
        root.getChildren().add(letraO);
        root.getChildren().add(letraR);
        root.getChildren().add(letraE);
        root.getChildren().add(dospuntos);
        root.getChildren().add(puntuacion);
        root.getChildren().remove(inicio);
        
        
        
       
        
         letraS.setScaleX(0.5);
         letraS.setScaleY(0.5);
         letraC.setScaleX(0.5);
         letraC.setScaleY(0.5);
         letraO.setScaleX(0.5);
         letraO.setScaleY(0.5);
         letraR.setScaleX(0.5);
         letraR.setScaleY(0.5);
         letraE.setScaleX(0.5);
         letraE.setScaleY(0.5);
         dospuntos.setScaleX(0.04);
         dospuntos.setScaleY(0.04);
         
         //Posicion score
         letraS.setX(posXScore);
         letraC.setX(posXScore+25);
         letraO.setX(posXScore+50);
         letraR.setX(posXScore+85);
         letraE.setX(posXScore+115);
         dospuntos.setX(-96);
         dospuntos.setY(-223);
         
        
        
        //        Rectangle rectabajo = new Rectangle();
        rectabajo.setRotate(0);
        rectabajo.setX(0);
        rectabajo.setY(370);
        rectabajo.setWidth(800);
        rectabajo.setHeight(1);
        rectabajo.setArcWidth(5);
        rectabajo.setArcHeight(5);
        rectabajo.setFill(Color.WHITE);
        rectabajo.setVisible(false);
        
//        Rectangle rectarriba = new Rectangle();
        rectarriba.setRotate(0);
        rectarriba.setX(0);
        rectarriba.setY(0);
        rectarriba.setWidth(800);
        rectarriba.setHeight(1);
        rectarriba.setArcWidth(5);
        rectarriba.setArcHeight(5);
        rectarriba.setFill(Color.WHITE);
        rectarriba.setVisible(false);   
        avion();
    }
    public void gameover(){
        enter.setImage(image11);
        enter.setX(-50);
        enter.setY(0);
        root.getChildren().add(enter); 
        enter.setScaleX(0.5);
        enter.setScaleY(0.5);
        
        GameOver.setImage(image10);
        GameOver.setX(200);
        GameOver.setY(100);
        root.getChildren().add(GameOver); 
        groupAvion.setVisible(false); 
    }
    public void reiniciar(){
        posX= 0;
        posX2= 800;
        posXOBS=820;
        posXOBS2=900;
        posXOBS3=960;
        posXOBS4=1070;
        velocidad=-5;
        velocidadavion=0;
        posXAVION=100;
        posYAVION=0;
        posXScore=0;
        score=0;
        System.out.println("Reiniciando...");
        root.getChildren().remove(GameOver); 
        root.getChildren().remove(enter);
        groupAvion.setVisible(true); 
    }
    public static void main(String[] args){
        launch(args);
    }
}
  