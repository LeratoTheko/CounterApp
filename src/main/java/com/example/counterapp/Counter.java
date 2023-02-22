package com.example.counterapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Counter {

    public Label CounterText;

    @FXML
    private Button DecreaseButton;

    @FXML
    private Button IncreaseButton;

    @FXML
    void DecreaseButtonClick(ActionEvent event) {
        int count = Integer.parseInt(CounterText.getText());
        CounterText.setText(Integer.toString(count - 3));

    }

    @FXML
    void IncreaseButtnClick(ActionEvent event) {
        int count = Integer.parseInt(CounterText.getText());
        CounterText.setText(Integer.toString(count + 3));
    }

}
