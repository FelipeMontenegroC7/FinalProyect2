package com.uniquindio.edu.finalprojectclocal.controller;

import com.uniquindio.edu.finalprojectclocal.utils.Utils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class RegisterViewController {

    @FXML
    private Button btnRegister;

    @FXML
    private Hyperlink hyperLLogin;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtLastName;

    @FXML
    private TextField txtName;

    @FXML
    private PasswordField txtPassword;

    @FXML
    void goToLogin(ActionEvent event) {
        Utils.replaceScene(event, "loginView.fxml", "Login - Neo Delivery");
    }

    @FXML
    void register(ActionEvent event) {

    }

}
