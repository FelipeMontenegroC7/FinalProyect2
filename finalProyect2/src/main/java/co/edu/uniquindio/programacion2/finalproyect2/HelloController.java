package co.edu.uniquindio.programacion2.finalproyect2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Hola Sapaaas");
    }
}
