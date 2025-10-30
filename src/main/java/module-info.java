module com.uniquindio.edu.finalprojectclocal {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;
    requires java.desktop;
    requires javafx.graphics;


    opens com.uniquindio.edu.finalprojectclocal to javafx.fxml;
    exports com.uniquindio.edu.finalprojectclocal;
    opens com.uniquindio.edu.finalprojectclocal.controller to javafx.fxml;
}