module com.example.kodu7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kodu7 to javafx.fxml;
    exports com.example.kodu7;
}