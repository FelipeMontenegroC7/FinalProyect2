package com.uniquindio.edu.finalprojectclocal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class DeliveryApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(DeliveryApplication.class.getResource("/com/uniquindio/edu/finalprojectclocal/loginView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 600);
        stage.setTitle("Login - Neo Delivery");
        stage.setScene(scene);
        stage.show();
    }
}
