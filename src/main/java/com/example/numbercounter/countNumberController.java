package com.example.numbercounter;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class countNumberController {


    private int num = 0;
    @FXML
    private Button increaseButton;

    @FXML
    private Button decreaseButton;
    @FXML
    private Text countLabel;

    @FXML
    protected void initialize(){
        increaseButton.setId("increaseButton");
        decreaseButton.setId("decreaseButton");
        countLabel.setId("countLabel");
    }
    @FXML
    protected void onDecreaseButtonClick() {
        num -= 1;
        countLabel.setText(String.valueOf(num));
    }

    @FXML
    protected void onIncreaseButtonClick() {
        num += 1;
        countLabel.setText(String.valueOf(num));
    }

}
