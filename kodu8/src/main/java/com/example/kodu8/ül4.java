package com.example.kodu8;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ül4 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage pealava) {
        /*Kirjutada programm, mis loob akna ja lisab aknasse mingile kohale nupu.
        Sündmuste abil korraldada, et hiirega nupule liikudes "hüppab" nupp eest ära juhuslikule kohale aknas.
        Tagada, et nupp ei hüppaks aknast välja (ka peale akna suuruste muutmist).*/

        Group juur = new Group();
        Scene stseen = new Scene(juur, 500, 300, Color.SNOW);
        pealava.setScene(stseen);

        Button nupp = new Button("vajuta");
        nupp.setLayoutX((int)(Math.random()*450));
        nupp.setLayoutY((int)(Math.random()*250));
        juur.getChildren().add(nupp);
        pealava.show();


        nupp.setOnMouseEntered(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event){
                nupp.setLayoutX((int)(Math.random()*(stseen.getWidth() - 50)));
                nupp.setLayoutY((int)(Math.random()*(stseen.getHeight() - 50)));
            }
        });

    }
}
