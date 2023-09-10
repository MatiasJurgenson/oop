package com.example.prax7;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Kalkulaator2 extends Application {
    @Override
    public void start(Stage peaLava) throws IOException {
        FlowPane flow = new FlowPane();

        TextField tekst = new TextField("11");
        tekst.setMinWidth(535);
        tekst.setAlignment(Pos.BASELINE_RIGHT);
        flow.getChildren().add(tekst);


        Button nuppnr1 = new Button("1");
        Button nuppnr2 = new Button("2");
        Button nuppnr3 = new Button("3");
        Button nuppnr4 = new Button("4");
        Button nuppnr5 = new Button("5");
        Button nuppnr6 = new Button("6");
        Button nuppnr7 = new Button("7");
        Button nuppnr8 = new Button("8");
        Button nuppnr9 = new Button("9");
        Button nuppnr0 = new Button("0");

        Button backspace = new Button("Backspace");
        Button ce = new Button("ce");
        Button c = new Button("c");

        Button jaga = new Button("/");
        Button sqrt = new Button("sqrt");
        Button korda = new Button("*");
        Button protsent = new Button("%");
        Button miinus = new Button("-");
        Button jagatudÜhega = new Button("1/x");
        Button vastandarv = new Button("+/-");
        Button koma = new Button(",");
        Button pluss = new Button("+");
        Button võrdub = new Button("=");

        Button[][] nuppud = new Button[][]{{nuppnr7, nuppnr8, nuppnr9, jaga,sqrt},
                {nuppnr4, nuppnr5, nuppnr6, korda, protsent},
                {nuppnr1, nuppnr2, nuppnr3, miinus, jagatudÜhega},
                {nuppnr0, vastandarv, koma, pluss, võrdub}};

        GridPane greed = new GridPane();


        GridPane.setConstraints(backspace, 0, 0);
        greed.getChildren().add(backspace);



        flow.getChildren().add(greed);


        Scene stseen1 = new Scene(flow, 535, 535, Color.SNOW);
        peaLava.setScene(stseen1);
        peaLava.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
