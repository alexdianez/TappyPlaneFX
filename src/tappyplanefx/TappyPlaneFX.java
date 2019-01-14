/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tappyplanefx;

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
 import javafx.geometry.Rectangle2D;
 import javafx.scene.Group;
 import javafx.scene.Scene; 
 import javafx.scene.image.Image;
 import javafx.scene.image.ImageView;
 import javafx.scene.layout.HBox;
 import javafx.scene.paint.Color;
 import javafx.stage.Stage; 

/**
 *
 * @author alex
 */
public class TappyPlaneFX extends Application {
    int PosX= 50;
    int velocidad=1;
    @Override
    public void start(Stage primaryStage) {
        Image image = new Image("fondo.png");
         ImageView fondo1 = new ImageView();
         fondo1.setImage(image);
         Group groupPerson = new Group();
         Group root2 = new Group();
         HBox prueba = new HBox();
         prueba.getChildren().add(fondo1);
         root2.getChildren().add(prueba);
        
         
        Pane root = new Pane(); 
        Scene scene = new Scene(root2, 600, 400, Color.BLACK);
        primaryStage.setTitle("Tappy Plane");
        primaryStage.setScene(scene);
        primaryStage.show();
        
       
       
        Ellipse elipse5 = new Ellipse(); {
        elipse5.setRotate(-50);
        elipse5.setCenterX(45.0f);
        elipse5.setCenterY(180.0f);
        elipse5.setRadiusX(7.0f);
        elipse5.setRadiusY(2.0f);
        elipse5.setFill(Color.WHITE);
        groupPerson.getChildren().add(elipse5);
        
        Ellipse elipse3 = new Ellipse(); {
        elipse3.setRotate(50);
        elipse3.setCenterX(85.0f);
        elipse3.setCenterY(189.0f);
        elipse3.setRadiusX(20.0f);
        elipse3.setRadiusY(5.0f);
        elipse3.setFill(Color.WHITE);
        groupPerson.getChildren().add(elipse3);
        
        
         Ellipse elipse2 = new Ellipse(); {
        elipse2.setRotate(50);
        elipse2.setCenterX(45.0f);
        elipse2.setCenterY(195.0f);
        elipse2.setRadiusX(20.0f);
        elipse2.setRadiusY(5.0f);
        elipse2.setFill(Color.RED);
        groupPerson.getChildren().add(elipse2);
        
        Ellipse elipse = new Ellipse(); {
        elipse.setCenterX(85.0f);
        elipse.setCenterY(200.0f);
        elipse.setRadiusX(40.0f);
        elipse.setRadiusY(15.0f);
        elipse.setFill(Color.RED);
        groupPerson.getChildren().add(elipse);
        
        
        Ellipse elipse4 = new Ellipse(); {
        elipse4.setRotate(-50);
        elipse4.setCenterX(85.0f);
        elipse4.setCenterY(223.0f);
        elipse4.setRadiusX(20.0f);
        elipse4.setRadiusY(5.0f);
        elipse4.setFill(Color.WHITE);
        groupPerson.getChildren().add(elipse4);
        
        Rectangle rect = new Rectangle();{
        rect.setRotate(90);
        rect.setX(60);
        rect.setY(200);
        rect.setWidth(10);
        rect.setHeight(5);
        rect.setArcWidth(5);
        rect.setArcHeight(5);
        rect.setFill(Color.WHITE);
        groupPerson.getChildren().add(rect);
        
        Rectangle rect2 = new Rectangle();{
        rect2.setRotate(90);
        rect2.setX(70);
        rect2.setY(198);
        rect2.setWidth(5);
        rect2.setHeight(5);
        rect2.setArcWidth(10);
        rect2.setArcHeight(10);
        rect2.setFill(Color.BLACK);
        groupPerson.getChildren().add(rect2);
        
        Rectangle rect3 = new Rectangle();{
        rect3.setRotate(90);
        rect3.setX(75);
        rect3.setY(198);
        rect3.setWidth(5);
        rect3.setHeight(5);
        rect3.setArcWidth(10);
        rect3.setArcHeight(10);
        rect3.setFill(Color.BLACK);
        groupPerson.getChildren().add(rect3);
        
         Rectangle rect4 = new Rectangle();{
        rect4.setRotate(90);
        rect4.setX(80);
        rect4.setY(198);
        rect4.setWidth(5);
        rect4.setHeight(5);
        rect4.setArcWidth(10);
        rect4.setArcHeight(10);
        rect4.setFill(Color.BLACK);
        groupPerson.getChildren().add(rect4);
        
         Rectangle rect5 = new Rectangle();{
        rect5.setRotate(90);
        rect5.setX(85);
        rect5.setY(198);
        rect5.setWidth(5);
        rect5.setHeight(5);
        rect5.setArcWidth(10);
        rect5.setArcHeight(10);
        rect5.setFill(Color.BLACK);
        groupPerson.getChildren().add(rect5);
        
         Rectangle rect6 = new Rectangle();{
        rect6.setRotate(90);
        rect6.setX(90);
        rect6.setY(198);
        rect6.setWidth(5);
        rect6.setHeight(5);
        rect6.setArcWidth(10);
        rect6.setArcHeight(10);
        rect6.setFill(Color.BLACK);
        groupPerson.getChildren().add(rect6);
        
        Rectangle rect7 = new Rectangle();{
        rect7.setRotate(90);
        rect7.setX(95);
        rect7.setY(198);
        rect7.setWidth(5);
        rect7.setHeight(5);
        rect7.setArcWidth(10);
        rect7.setArcHeight(10);
        rect7.setFill(Color.BLACK);
        groupPerson.getChildren().add(rect7);
        
        Rectangle rectatras = new Rectangle();{
        rectatras.setRotate(90);
        rectatras.setX(55);
        rectatras.setY(198);
        rectatras.setWidth(5);
        rectatras.setHeight(5);
        rectatras.setArcWidth(10);
        rectatras.setArcHeight(10);
        rectatras.setFill(Color.BLACK);
        groupPerson.getChildren().add(rectatras);
        
        Rectangle ventana2 = new Rectangle();{
        ventana2.setRotate(-25);
        ventana2.setX(110);
        ventana2.setY(193);
        ventana2.setWidth(10);
        ventana2.setHeight(7);
        ventana2.setArcWidth(10);
        ventana2.setArcHeight(10);
        ventana2.setFill(Color.BLACK);
        groupPerson.getChildren().add(ventana2);
        
        Rectangle ventana = new Rectangle();{
        ventana.setRotate(-25);
        ventana.setX(111);
        ventana.setY(194);
        ventana.setWidth(8);
        ventana.setHeight(5);
        ventana.setArcWidth(10);
        ventana.setArcHeight(10);
        ventana.setFill(Color.AQUAMARINE);
        groupPerson.getChildren().add(ventana);
        
       Ellipse elipse6 = new Ellipse(); {
        elipse6.setRotate(-50);
        elipse6.setCenterX(33.0f);
        elipse6.setCenterY(195.0f);
        elipse6.setRadiusX(9.0f);
        elipse6.setRadiusY(2.0f);
        elipse6.setFill(Color.WHITE);
        groupPerson.getChildren().add(elipse6);
        
        AnimationTimer mov = new AnimationTimer(){
            @Override
            public void handle (long now){
                 groupPerson.setLayoutX(PosX);
                 PosX+=velocidad;
            };
        };
        mov.start();
        root.getChildren().add(groupPerson);
        root2.getChildren().add(groupPerson);
         
        }
    
    }
    }
}
}
}
}
}
}
}
}
    }
}
}
}
}
}
};
