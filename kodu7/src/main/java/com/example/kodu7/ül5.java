package com.example.kodu7;

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ül5 extends Application {

    @Override
    public void start(Stage peaLava) {

        Group juur = new Group(); // luuakse juur

        Canvas lõuend = new Canvas(535, 535); // luuakse lõuend

        Circle päike = new Circle(30, 50, 50, Color.YELLOW);
        juur.getChildren().add(päike);

        FadeTransition ft = new FadeTransition(Duration.millis(4000), päike);
        ft.setFromValue(1.0);
        ft.setToValue(0.1);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        ft.play();

        Path path = new Path();
        path.getElements().add(new MoveTo(100,100));
        path.getElements().add(new CubicCurveTo(200, 200, 100, 300, 400, 100));
        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.millis(4000));
        pathTransition.setPath(path);
        pathTransition.setNode(päike);
        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition.setCycleCount(Timeline.INDEFINITE);
        pathTransition.setAutoReverse(true);
        pathTransition.play();

        ParallelTransition parallelTransition = new ParallelTransition();
        parallelTransition.getChildren().addAll(ft,pathTransition);
        parallelTransition.setCycleCount(Timeline.INDEFINITE);
        parallelTransition.play();

        Rectangle ristkülik = new Rectangle (100, 40, 100, 100);
        juur.getChildren().add(ristkülik);
        ristkülik.setArcHeight(50);
        ristkülik.setArcWidth(50);
        ristkülik.setFill(Color.RED);

        Duration SEC_2 = Duration.millis(2000);
        Duration SEC_3 = Duration.millis(3000);

        PauseTransition pt = new PauseTransition(Duration.millis(1000));
        TranslateTransition tt = new TranslateTransition(SEC_2);
        tt.setFromX(-100);
        tt.setToX(100);
        tt.setCycleCount(2);
        tt.setAutoReverse(true);
        RotateTransition rt = new RotateTransition(SEC_3);
        rt.setByAngle(180);
        rt.setCycleCount(1);
        rt.setAutoReverse(true);

        SequentialTransition seqT = new SequentialTransition (ristkülik, pt, tt, rt);
        seqT.play();

        juur.getChildren().add(lõuend);

        Scene stseen1 = new Scene(juur);  // luuakse stseen

        peaLava.setTitle("ül5");  // lava tiitelribale pannakse tekst
        peaLava.setScene(stseen1);  // lavale lisatakse stseen
        peaLava.show();  // lava tehakse nähtavaks
    }

    public static void main(String[] args) {
        launch(args);
    }


}
