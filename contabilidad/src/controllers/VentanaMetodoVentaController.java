package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class VentanaMetodoVentaController {

    @FXML
    private Button btPeps;

    @FXML
    private Button btPesoPromedio;

    @FXML
    private Button btUeps;

    @FXML
    void peps(ActionEvent event) {
    	 ((Stage) btPeps.getScene().getWindow()).close();
    }

    @FXML
    void pesoPromedio(ActionEvent event) {
    	((Stage) btPesoPromedio.getScene().getWindow()).close();
    }

    @FXML
    void ueps(ActionEvent event) {
    	((Stage) btUeps.getScene().getWindow()).close();
    }

}
