package com.example.kodu7;

import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage peaLava) {

        Group juur = new Group(); // luuakse juur

        Canvas lõuend = new Canvas(535, 535); // luuakse lõuend



        GraphicsContext gc = lõuend.getGraphicsContext2D(); // graafiline sisu

        gc.setFill(Color.LIGHTGREEN);
        gc.fillRect(0, 0, 535, 535);
        gc.setFill(Color.BLUE);
        gc.fillRect(50, 50, 435, 100);
        gc.setFill(Color.BLACK);
        gc.fillRect(50, 150, 435, 100);
        gc.setFill(Color.WHITE);
        gc.fillRect(50, 250, 435, 100);



        Button nupp1 = new Button("Olen nõus"); // luuakse nupp
        nupp1.setLayoutX(100); // nupu paigutamine x-koordinaadi mõttes
        nupp1.setLayoutY(60); // nupu paigutamine y-koordinaadi mõttes

        DropShadow vari = new DropShadow(20, Color.GREEN);
        vari.setOffsetX(20);
        nupp1.setEffect(vari);


        juur.getChildren().add(lõuend);  // lõuend lisatakse juure alluvaks
        juur.getChildren().add(nupp1); // nupp lisatakse juure alluvaks

        Circle päike = new Circle(30, 50, 50, Color.YELLOW);
        juur.getChildren().add(päike);

        FadeTransition ft = new FadeTransition(Duration.millis(4000), päike);
        ft.setFromValue(1.0);
        ft.setToValue(0.1);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        ft.play();

        Path path = new Path();
        path.getElements().add(new MoveTo(20,80));
        path.getElements().add(new CubicCurveTo(20, 80, 240, 0, 280, 80));
        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.millis(4000));
        pathTransition.setPath(path);
        pathTransition.setNode(päike);
        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition.setCycleCount(Timeline.INDEFINITE);
        pathTransition.setAutoReverse(true);
        pathTransition.play();

        ParallelTransition parallelTransition = new ParallelTransition();
        parallelTransition.getChildren().addAll(ft,pathTransition);
        parallelTransition.setCycleCount(Timeline.INDEFINITE);
        parallelTransition.play();





        Scene stseen1 = new Scene(juur);  // luuakse stseen

        peaLava.setTitle("Lipp");  // lava tiitelribale pannakse tekst
        peaLava.setScene(stseen1);  // lavale lisatakse stseen
        peaLava.show();  // lava tehakse nähtavaks
    }

    public static void main(String[] args) {
        launch();
    }
}