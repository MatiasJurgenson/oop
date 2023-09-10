package com.example.kodu8;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ül3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage pealava) {
        Group juur = new Group();
        Scene stseen = new Scene(juur, 500, 300, Color.SNOW);
        pealava.setScene(stseen);

        Circle ring = new Circle(250, 150, 100, Color.RED);
        juur.getChildren().add(ring);
        pealava.show();

        ring.setOnMouseEntered(event -> ring.setFill(Color.YELLOW));
        ring.setOnMouseExited(event -> ring.setFill(Color.GREEN));
    }
}
