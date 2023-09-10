package com.example.praks8;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;

public class lippAgaParem extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage peaLava) {
        Group juur = new Group(); // luuakse juur

        Canvas lõuend = new Canvas(535, 535); // luuakse lõuend


        GraphicsContext gc = lõuend.getGraphicsContext2D(); // graafiline sisu

        double kõrgus = lõuend.getHeight()/3;
        double laius = lõuend.getWidth();

        gc.setFill(Color.BLUE);
        gc.fillRect(0, 0, laius, kõrgus);
        gc.setFill(Color.BLACK);
        gc.fillRect(0, kõrgus, laius, kõrgus);
        gc.setFill(Color.WHITE);
        gc.fillRect(0, kõrgus*2, laius, kõrgus);

        juur.getChildren().add(lõuend);

        Scene stseen1 = new Scene(juur);  // luuakse stseen

        peaLava.setTitle("UwU");  // lava tiitelribale pannakse tekst
        peaLava.setScene(stseen1);  // lavale lisatakse stseen
        peaLava.show();  // lava tehakse nähtavaks

    }
}
