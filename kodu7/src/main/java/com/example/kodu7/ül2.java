package com.example.kodu7;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ül2 extends Application {

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

        juur.getChildren().add(lõuend);

        Scene stseen1 = new Scene(juur);  // luuakse stseen

        peaLava.setTitle("ül2");  // lava tiitelribale pannakse tekst
        peaLava.setScene(stseen1);  // lavale lisatakse stseen
        peaLava.show();  // lava tehakse nähtavaks
    }

    public static void main(String[] args) {
        launch();
    }
}
