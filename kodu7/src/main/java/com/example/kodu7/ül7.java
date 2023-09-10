package com.example.kodu7;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ül7 extends Application {

    @Override
    public void start(Stage peaLava) {
        BorderPane piir = new BorderPane();
        FlowPane flow = new FlowPane();
        StackPane stack = new StackPane();
        BorderPane border = new BorderPane();


        Rectangle ristkülik = new Rectangle(100, 500);
        ristkülik.setFill(Color.BLACK);

        Circle ring = new Circle(30, 50, 50, Color.RED);
        flow.getChildren().add(ring);

        FadeTransition ft = new FadeTransition(Duration.millis(500), ring);
        ft.setFromValue(1.0);
        ft.setToValue(0.1);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        ft.play();

        stack.getChildren().addAll(ristkülik, ring);
        piir.setLeft(stack);

        Text tekst = new Text(0, 0, "Valitavad ajad");
        tekst.setFont(Font.font("null", FontWeight.BOLD, 30));

        ListView<String> list = new ListView<>();
        ObservableList<String> items = FXCollections.observableArrayList (
                "10.00", "11.00", "12.00", "12.15", "13.00", "13.30", "16.00", "17.15");
        list.setMaxHeight(500);
        list.setMinWidth(400);
        list.setItems(items);


        border.setMinWidth(400);
        Button nupp1 = new Button("Lisa aeg");
        border.setLeft(nupp1);
        Button nupp2 = new Button("Vali aeg");
        border.setRight(nupp2);

        flow.getChildren().addAll(tekst, list, border);
        piir.setRight(flow);

        Scene stseen1 = new Scene(piir, 500, 500, Color.SNOW);
        peaLava.setTitle("ül7");
        peaLava.setScene(stseen1);
        peaLava.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
