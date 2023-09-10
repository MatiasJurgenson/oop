module com.example.praks8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.praks8 to javafx.fxml;
    exports com.example.praks8;
}