package com.example.prax7;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Kalkulaator extends Application {
    @Override
    public void start(Stage peaLava) throws IOException {

        int[] numbrid = new int[]{45, 78, 69, 21, 33, 96, 47, 10, 76, 50};

        Group juur = new Group(); // luuakse juur
        Canvas lõuend = new Canvas(535, 535); // luuakse lõuend
        GraphicsContext gc = lõuend.getGraphicsContext2D(); // graafiline sisu


        for (int i = 0; i < numbrid.length; i++) {
            if (numbrid[i] > 50) {
                gc.setFill(Color.RED);
            } else {
                gc.setFill(Color.BLUE);
            }
            gc.fillRect(125 + i* 30,350-numbrid[i]*2, 20, numbrid[i]*2);
            gc.fillText(Integer.toString(numbrid[i]), 130 + i* 30, 370);
        }


        juur.getChildren().add(lõuend);  // lõuend lisatakse juure alluvaks
        Scene stseen1 = new Scene(juur);  // luuakse stseen
        peaLava.setTitle("Tulpdeagramm");  // lava tiitelribale pannakse tekst
        peaLava.setScene(stseen1);  // lavale lisatakse stseen
        peaLava.show();  // lava tehakse nähtavaks
    }

    public static void main(String[] args) {
        launch();
    }
}
