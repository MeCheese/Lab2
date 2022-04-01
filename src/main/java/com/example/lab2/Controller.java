package com.example.lab2;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {


    public Button btnMain;
    int clickCounter = 0;
    public TextField text1;
    Integer cnt = 0;



    private Label welcomeText;

    @FXML


    public void OnAction(ActionEvent actionEvent) {


    }

    public void OnBtnAction(ActionEvent actionEvent) {
        text1.setText("Klawisz kliknięty po raz " + ++cnt);
        System.out.println("Kliknięcie nr " + ++clickCounter);
        if (clickCounter == 1)
            btnMain.setText("I jeszcze raz");
    }
}