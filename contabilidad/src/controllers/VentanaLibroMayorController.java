package controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.stage.Stage;

public class VentanaLibroMayorController {
	@FXML
	private Button BtRegresar;
	@FXML
	private Label LbBancoIzq1;
	@FXML
	private Label LbBancoIzq2;
	@FXML
	private Label LbBancoIzq3;
	@FXML
	private Label LbBancoIzq4;
	@FXML
	private Label LbResulBancoIzq;
	@FXML
	private Label LbBancoDer1;
	@FXML
	private Label LbBancoDer2;
	@FXML
	private Label LbBancoDer3;
	@FXML
	private Label LbBancoDer4;
	@FXML
	private Label LbResulBancoDer;
	@FXML
	private Label LbDocIzq1;
	@FXML
	private Label LbDocResIzq;
	@FXML
	private Label LbPapeleriaIzq1;
	@FXML
	private Label LbPapeleriaIzqRes;
	@FXML
	private Label LbPapeleriaDer1;
	@FXML
	private Label LbPapeleriaDerRes;
	@FXML
	private Label LbSeguroIzq1;
	@FXML
	private Label LbSeguroRes;
	@FXML
	private Label LbSeguroDer1;
	@FXML
	private Label LbSeguroDer2;
	@FXML
	private Label LbSeguroIzq2;
	@FXML
	private Label LbAlmacenIzq1;
	@FXML
	private Label LbAlmacenIzq3;
	@FXML
	private Label LbAlmacenIzqRes;
	@FXML
	private Label LbAlmacenDer1;
	@FXML
	private Label LbAlmacenDerRes;
	@FXML
	private Label LbBancoIzq122;
	@FXML
	private Label LbProveedores1;
	@FXML
	private Label LbProveedores3;
	@FXML
	private Label LbProveedores4;
	@FXML
	private Label LbProveedoresRes;
	@FXML
	private Label LbAcreedoresRes;
	@FXML
	private Label CapContable1;
	@FXML
	private Label CapContable3;
	@FXML
	private Label CapContableRes;
	@FXML
	private Label CapContable2;
	@FXML
	private Label CapContable4;
	@FXML
	private Label LbAcreedores;
	@FXML
	private Label LbProveedores2;
	@FXML
	private Label LbProveedoresResIzq;
	@FXML
	private Label LbAlmacenIzq2;
	@FXML
	private Label LbGastoVentaIzq1;
	@FXML
	private Label LbGastoVentaIzq2;
	@FXML
	private Label LbGastoVentaDer1;
	@FXML
	private Label LbGastoVentaDerRes;
	@FXML
	private Label LbGastoVentaIzqRes;
	@FXML
	private Label LbGastoVentaDer2;
	@FXML
	private Label LbCostoIzq1;
	@FXML
	private Label LbCostoIzq2;
	@FXML
	private Label LbCostoDer1;
	@FXML
	private Label LbCostoDerRes;
	@FXML
	private Label LbCostoIzqRes;
	@FXML
	private Label LbCostoDer2;
	@FXML
	private Label LbVentaIzq1;
	@FXML
	private Label LbVentaDer1;
	@FXML
	private Label LbVentaDerRes;
	@FXML
	private Label LbVentaIzq2;
	@FXML
	private Label LbVentaIzqRes;
	@FXML
	private Label LbVentaDer2;
	@FXML
	private Label LbGasIzq1;
	@FXML
	private Label LbGasDer1;
	@FXML
	private Label LbGasDerRes;
	@FXML
	private Label LbGasIzqRes;
	@FXML
	private Label LbGastoAdmonIzq1;
	@FXML
	private Label LbGastoAdmonDer1;
	@FXML
	private Label LbGastoAdmonDerRes;
	@FXML
	private Label LbGastoAdmonIzqRes;
	@FXML
	private Label LbGastoPTU1;
	@FXML
	private Label LbGastoPTUDer1;
	@FXML
	private Label LbGastoPTUDerRes;
	@FXML
	private Label LbGastoPTURes;
	@FXML
	private Label LbPTUPagarDer1;
	@FXML
	private Label LbPTUPagarDerRes;
	@FXML
	private Label LbPTUPagarIzqRes;
	@FXML
	private Label LbPerdidasGanaciasIzq1;
	@FXML
	private Label LbPerdidasGanaciasIzq4;
	@FXML
	private Label LbPerdidasGanaciasDer1;
	@FXML
	private Label LbPerdidasGanaciasDer3;
	@FXML
	private Label LbPerdidasGanaciasDerRes;
	@FXML
	private Label LbPerdidasGanaciasIzq2;
	@FXML
	private Label LbPerdidasGanaciasIzq3;
	@FXML
	private Label LbPerdidasGanaciasIzqRes;
	@FXML
	private Label LbPerdidasGanaciasDer2;
	@FXML
	private Label LbPerdidasGanaciasDer4;
	@FXML
	private Label LbGastosISRIzq1;
	@FXML
	private Label LbGastosISRDer1;
	@FXML
	private Label LbGastosISRDerRes;
	@FXML
	private Label LbGastosISRIzqRes;
	@FXML
	private Label LbImpISRDer1;
	@FXML
	private Label LbImpISRDerRes;
	@FXML
	private Label LbImpISRIzqRes;
	@FXML
	private Label LbPapeleriaIzq2;
	@FXML
	private Label LbPapeleriaDer2;
	@FXML
	private Label LbAlmacenDer2;
	
	public void regresarMenuExamen(ActionEvent event) {
		try {
            // Volver a cargar la ventana inicial
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/VentanaExamen.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Libro Mayor");
            stage.show();

            // Cerrar la ventana actual
            ((Stage) BtRegresar.getScene().getWindow()).close();

        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
