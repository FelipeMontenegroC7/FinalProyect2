package com.uniquindio.edu.finalprojectclocal.controller;

import com.uniquindio.edu.finalprojectclocal.utils.Utils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class LoginViewController {

    @FXML
    private Button btnLogin;

    @FXML
    private Hyperlink hyperLRegister;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    private BorderPane rootPane;

    @FXML
    void goToRegister(ActionEvent event) {
        Utils.replaceScene(event, "registerView.fxml", "Register - Neo Delivery");
    }

    @FXML
    void login(ActionEvent event) {
        System.out.println("Click Login button");
    }

}
