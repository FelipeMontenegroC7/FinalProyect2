module co.edu.uniquindio.programacion2.finalproyect2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens co.edu.uniquindio.programacion2.finalproyect2 to javafx.fxml;
    exports co.edu.uniquindio.programacion2.finalproyect2;
}