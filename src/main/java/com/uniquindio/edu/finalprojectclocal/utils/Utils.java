package com.uniquindio.edu.finalprojectclocal.utils;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import java.io.IOException;

public class Utils {

    public static void replaceScene(ActionEvent event, String fxmlPath, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(Utils.class.getResource("/com/uniquindio/edu/finalprojectclocal/"+fxmlPath));
            Parent root = loader.load();

            Stage newStage = new Stage();
            newStage.setTitle(title);
            newStage.setScene(new Scene(root));
            newStage.show();

            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
