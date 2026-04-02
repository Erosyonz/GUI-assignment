module com.example.foodorderingsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.foodorderingsystem to javafx.fxml;
    exports com.example.foodorderingsystem;
}