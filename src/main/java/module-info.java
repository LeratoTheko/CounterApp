module com.example.counterapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.counterapp to javafx.fxml;
    exports com.example.counterapp;
}