/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tappyplanefx;

import java.awt.event.MouseEvent;
import java.util.Random;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.NodeOrientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.application.Application;
import javafx.event.EventHandler;
 import javafx.geometry.Rectangle2D;
 import javafx.scene.Group;
 import javafx.scene.Scene; 
 import javafx.scene.image.Image;
 import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
 import javafx.scene.layout.HBox;
 import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
 import javafx.stage.Stage; 

/**
 *
 * @author alex
 */
public class TappyPlaneFX extends Application {
    int posX= 0;
    int posX2= 800;
    int posXOBS=0;
    int posXOBS2=0;
    int posXOBS3=0;
    int posXOBS4=0;
    int velocidad=-1;
    int velocidadavion=2;
    int posXAVION=100;
    int posYAVION=0;
    Pane root;
    public void avion(){
       Group groupAvion = new Group();
       
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
        
        Ellipse elipse = new Ellipse(); 
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
    public void start(Stage primaryStage) {
        Image image = new Image("fondo.png");
        Image image2 = new Image("suelo.png");
        Image image3 = new Image("obst.png");
        
         ImageView fondo1 = new ImageView();
         ImageView fondo2 = new ImageView();
         
         ImageView suelo = new ImageView();
         ImageView suelo2 = new ImageView();
         
         ImageView obst = new ImageView();
         ImageView obst2 = new ImageView();
         ImageView obst3 = new ImageView();
         ImageView obst4 = new ImageView();
         
         fondo1.setImage(image);
         fondo2.setImage(image);
         
         suelo.setImage(image2);
         suelo2.setImage(image2);
         
         obst.setImage(image3);
         obst2.setImage(image3);
         obst3.setImage(image3);
         obst4.setImage(image3);
        
        
       
        root = new Pane(); 
        Scene scene = new Scene(root, 800, 400, Color.BLACK);
        primaryStage.setTitle("Tappy Plane");
        primaryStage.setScene(scene);
        primaryStage.show();
        Random aleatorio=new Random();
        
        scene.setOnKeyPressed((KeyEvent event) -> {
            switch(event.getCode()){
                case UP:
                    velocidadavion=2;
                    break;
                case DOWN:
                    velocidadavion=-2;
                    break;
            }
        });
        scene.setOnKeyReleased((KeyEvent event) -> {
            velocidadavion=-2;
        });
        
        AnimationTimer mov = new AnimationTimer(){
            @Override
            public void handle (long now){
                
                
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
               
               //Redimensionado de imagenes
                obst2.setFitHeight(120);
                obst2.setFitWidth(54);
                obst2.setRotate(180);
                obst4.setFitHeight(190);
                obst4.setFitWidth(54);
                obst4.setRotate(180);
                if(posXOBS==0){
                    int separacion=aleatorio.nextInt(950);
                    posXOBS+=separacion;
                }
                if(posXOBS2==0){
                    int separacion=aleatorio.nextInt(950);
                    posXOBS2=posXOBS+separacion;
                }
                if(posXOBS3==0){
                    int separacion=aleatorio.nextInt(950);
                    posXOBS3=posXOBS2+separacion;
                }
                if(posXOBS4==0){
                    int separacion=aleatorio.nextInt(950);
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
                //avion.setY(posYAVION);
                
            };
        };
        mov.start();
        root.getChildren().add(fondo2);
        root.getChildren().add(fondo1);
        root.getChildren().add(obst);
        root.getChildren().add(obst2);
        root.getChildren().add(obst3);
        root.getChildren().add(obst4);
        root.getChildren().add(suelo);
        root.getChildren().add(suelo2);
        avion();
        }
    


}
  