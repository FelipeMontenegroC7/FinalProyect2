package com.uniquindio.edu.finalprojectclocal.utils;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Node;
import java.io.IOException;

public class Utils {


    //metodo que nos permite cambiar entre ventanas
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


    //Metodo que permite cambiar el contenido del dashboard sin necesidad de abrir y cerrar ventanas
    public static void replaceMainContent(AnchorPane mainContent, String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(Utils.class.getResource("/com/uniquindio/edu/finalprojectclocal" + fxmlPath));
            Node view = loader.load();

            mainContent.getChildren().setAll(view);

            AnchorPane.setTopAnchor(view, 0.0);
            AnchorPane.setBottomAnchor(view, 0.0);
            AnchorPane.setLeftAnchor(view, 0.0);
            AnchorPane.setRightAnchor(view, 0.0);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
