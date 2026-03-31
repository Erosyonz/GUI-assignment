package com.example.foodorderingsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class foodOrderingSystemController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
