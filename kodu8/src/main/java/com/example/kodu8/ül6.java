package com.example.kodu8;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class ül6 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage pealava) {
        VBox juur = new VBox();

        Label lause = new Label("Mis on lause " + '"' + "See lause on väär" + '"' + " tõeväärtus?");
        Label vale = new Label("Vale vastus!");
        Label õige = new Label("Õige vastus!");

        RadioButton raadioNupp1 = new RadioButton("tõene");
        RadioButton raadioNupp2 = new RadioButton("Väär");
        RadioButton raadioNupp3 = new RadioButton("Paradoks");

        ToggleGroup nupuRühm = new ToggleGroup();
        raadioNupp1.setToggleGroup(nupuRühm);
        raadioNupp2.setToggleGroup(nupuRühm);
        raadioNupp3.setToggleGroup(nupuRühm);

        raadioNupp1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (juur.getChildren().contains(vale)) {
                    juur.getChildren().remove(vale);
                }
                if (juur.getChildren().contains(õige)) {
                    juur.getChildren().remove(õige);
                }
                juur.getChildren().add(vale);
            }
        });

        raadioNupp2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (juur.getChildren().contains(vale)) {
                    juur.getChildren().remove(vale);
                }
                if (juur.getChildren().contains(õige)) {
                    juur.getChildren().remove(õige);
                }
                juur.getChildren().add(vale);
            }
        });

        raadioNupp3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (juur.getChildren().contains(vale)) {
                    juur.getChildren().remove(vale);
                }
                juur.getChildren().add(õige);
            }
        });

        juur.getChildren().add(lause);
        juur.getChildren().add(raadioNupp1);
        juur.getChildren().add(raadioNupp2);
        juur.getChildren().add(raadioNupp3);

        Scene stseen = new Scene(juur, 300, 300);

        pealava.setTitle("Lause tõeväärtus");
        pealava.setScene(stseen);
        pealava.show();
    }
}
