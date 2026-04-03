package com.example.simplecalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class simpleCalculatorApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(simpleCalculatorApplication.class.getResource("simple-calculator.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 520, 240);
        stage.setTitle("Simple Calculator");
        stage.setScene(scene);
        stage.show();
    }
}
