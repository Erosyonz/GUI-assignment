module com.example.numbercounter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.numbercounter to javafx.fxml;
    exports com.example.numbercounter;
}