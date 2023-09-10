module com.example.kodu8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kodu8 to javafx.fxml;
    exports com.example.kodu8;
}