package com.uniquindio.edu.finalprojectclocal.controller;

import com.uniquindio.edu.finalprojectclocal.utils.Utils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;


public class CourierDashboardController {

    @FXML
    private Button btnLogOut;

    @FXML
    private Label lblWelcomeCourier;

    @FXML
    private AnchorPane mainContent;

    @FXML
    private Button menuButton;

    @FXML
    private AnchorPane menu;

    private boolean visibleMenu = true;

    @FXML
    void logOut(ActionEvent event) {
        Utils.replaceScene(event, "loginView.fmxl", "Login - Neo Delivery");
    }

    @FXML
    void slideMenu(ActionEvent event) {
        if(visibleMenu) {
            menu.setVisible(false);
            menu.setManaged(false);
        }else{
            menu.setVisible(true);
            menu.setManaged(true);
        }
        visibleMenu = !visibleMenu;
    }

}
