module com.example.prax7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prax7 to javafx.fxml;
    exports com.example.prax7;
}