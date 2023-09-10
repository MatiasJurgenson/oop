package com.example.praks8;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage pealava) throws IOException {
        Group juur = new Group();
        Scene stseen = new Scene(juur, 500, 500, Color.SNOW);

        Text tekst = new Text();
        juur.getChildren().add(tekst);

        stseen.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                double x = event.getX();
                double y = event.getY();

                tekst.setX(x);
                tekst.setY(y);
                tekst.setText(x + ", " + y);

            }
        });

        stseen.setOnMouseReleased(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {

                tekst.setText("");

            }
        });

        pealava.setTitle("Hello!");
        pealava.setScene(stseen);
        pealava.show();
    }

    public static void main(String[] args) {
        launch();
    }
}