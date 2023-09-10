package com.example.kodu7;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ül4 extends Application {

    @Override
    public void start(Stage peaLava) {

        Group juur = new Group(); // luuakse juur

        Canvas lõuend = new Canvas(535, 535); // luuakse lõuend

        Button nupp1 = new Button("Olen nõus"); // luuakse nupp
        nupp1.setLayoutX(100); // nupu paigutamine x-koordinaadi mõttes
        nupp1.setLayoutY(60); // nupu paigutamine y-koordinaadi mõttes

        Reflection peegeldus = new Reflection();
        peegeldus.setFraction(1);
        nupp1.setEffect(peegeldus);

        juur.getChildren().add(lõuend);
        juur.getChildren().add(nupp1);

        Scene stseen1 = new Scene(juur);  // luuakse stseen

        peaLava.setTitle("ül4");  // lava tiitelribale pannakse tekst
        peaLava.setScene(stseen1);  // lavale lisatakse stseen
        peaLava.show();  // lava tehakse nähtavaks
    }

    public static void main(String[] args) {
        launch();
    }

}
