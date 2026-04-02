package com.example.foodorderingsystem;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import javax.swing.*;

public class foodOrderingSystemController {


    @FXML private CheckBox cPizza;
    @FXML private CheckBox cBurger;
    @FXML private CheckBox cFries;
    @FXML private CheckBox cSoftDrinks;
    @FXML private CheckBox cTea;
    @FXML private CheckBox cSundae;
    @FXML private RadioButton rbNone;
    @FXML private RadioButton rb5;
    @FXML private RadioButton rb10;
    @FXML private RadioButton rb15;
    @FXML private Button btnOrder;
    @FXML private ToggleGroup DC;

     double amount;
     double discount;
     boolean clicked =  false;
    @FXML
    public void initialize(){

        DC = new ToggleGroup();
        rbNone.setToggleGroup(DC);
        rb15.setToggleGroup(DC);
        rb10.setToggleGroup(DC);
        rb5.setToggleGroup(DC);

        cPizza.setId("cPizza");
        cBurger.setId("cBurger");
        cFries.setId("cFries");
        cSoftDrinks.setId("cSoftDrinks");
        cTea.setId("cTea");
        cSundae.setId("cSundae");
        rbNone.setId("rbNone");
        rb15.setId("rb15");
        rb10.setId("rb10");
        rb5.setId("rb5");
        btnOrder.setId("btnOrder");
    }


    @FXML
    public void onMenuClick(){
        if(cPizza.isSelected()) amount += 100;
        if(cBurger.isSelected()) amount += 80;
        if(cFries.isSelected()) amount += 65;
        if(cSoftDrinks.isSelected()) amount += 55;
        if(cTea.isSelected()) amount += 50;
        if(cSundae.isSelected()) amount += 40;
    }

    public void onDiscountClick(){

        if(rbNone.isSelected()) discount = 0.00;;

        if(rb15.isSelected()) discount = 0.15;
        if(rb10.isSelected())discount = 0.10;
        if(rb5.isSelected())discount = 0.05;
    }

    public void onOrderClick(){
        amount = 0.0;
        discount = 0.0;

        onMenuClick();
        onDiscountClick();

        double finalPrice = amount - (amount * discount);
        JOptionPane.showMessageDialog(null, "The total price is Php " + String.format("%.2f", finalPrice));


    }

}
