module com.example.rahinat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rahinat to javafx.fxml;
    exports com.example.rahinat;
}