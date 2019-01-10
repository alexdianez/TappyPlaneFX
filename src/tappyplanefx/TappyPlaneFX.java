/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tappyplanefx;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.NodeOrientation;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

/**
 *
 * @author alex
 */
public class TappyPlaneFX extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane(); 
        Scene scene = new Scene(root, 600, 400, Color.BLACK);
        
        primaryStage.setTitle("Tappy Plane");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        Ellipse elipse3 = new Ellipse(); {
        elipse3.setRotate(50);
        elipse3.setCenterX(85.0f);
        elipse3.setCenterY(190.0f);
        elipse3.setRadiusX(15.0f);
        elipse3.setRadiusY(5.0f);
        elipse3.setFill(Color.WHITE);
        root.getChildren().add(elipse3);
        
         Ellipse elipse2 = new Ellipse(); {
        elipse2.setRotate(50);
        elipse2.setCenterX(45.0f);
        elipse2.setCenterY(190.0f);
        elipse2.setRadiusX(20.0f);
        elipse2.setRadiusY(10.0f);
        elipse2.setFill(Color.RED);
        root.getChildren().add(elipse2);
        
        Ellipse elipse = new Ellipse(); {
        elipse.setCenterX(85.0f);
        elipse.setCenterY(200.0f);
        elipse.setRadiusX(40.0f);
        elipse.setRadiusY(15.0f);
        elipse.setFill(Color.RED);
        root.getChildren().add(elipse);
        
        Ellipse elipse4 = new Ellipse(); {
        elipse4.setRotate(-50);
        elipse4.setCenterX(85.0f);
        elipse4.setCenterY(215.0f);
        elipse4.setRadiusX(15.0f);
        elipse4.setRadiusY(5.0f);
        elipse4.setFill(Color.WHITE);
        root.getChildren().add(elipse4);
        
        Circle pelota= new Circle(40,185,3);
        pelota.setFill(Color.WHITE);
        root.getChildren().add(pelota);
         
        }
    
    }
    }
}
}
};
