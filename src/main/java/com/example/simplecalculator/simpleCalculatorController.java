package com.example.simplecalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class simpleCalculatorController {

    @FXML private TextField tfNumber1;
    @FXML private TextField tfNumber2;
    @FXML private ComboBox<String>  cbOperations;
    @FXML private Button btnCompute;
    @FXML private Label lblResult;
    @FXML private Label errorDisplay;

    @FXML
    public void initialize(){
        cbOperations.getItems().addAll("+","-","*","/");
        tfNumber1.setId("tfNumber1");
        tfNumber2.setId("tfNumber2");
        cbOperations.setId("cbOperations");
        btnCompute.setId("btnCompute");
        lblResult.setId("lblResult");
        errorDisplay.setId("errorDisplay");
    }

    @FXML
    public void onComputeClick(){
        errorDisplay.setText("");
        lblResult.setText("");
        double a = 0;
        try{

            String num1 = tfNumber1.getText();
            String num2 = tfNumber2.getText();

            a = Double.parseDouble(num1);
            double b = Double.parseDouble(num2);
            double x = 0.0;

            String op = cbOperations.getValue();
            if(op != null){
                switch (op){
                    case "+":
                        x = a + b;
                        break;
                    case "-":
                        x = a - b;
                        break;
                    case "/":
                        x = a / b;
                        break;
                    case "*":
                        x = a * b;
                        break;
                }
            }
            lblResult.setText(String.format("%.2f", x));
        }catch (NumberFormatException e){
            errorDisplay.setText("Numbers only");
        }catch(ArithmeticException e){
            errorDisplay.setText("Cannot divide " + String.format("%.2f", a) +"/0");
        }
    }


}
