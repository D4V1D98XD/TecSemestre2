package controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class VentanaExamenController {

	private Stage ventanaInicialStage;
    @FXML
    private Button BtMenuInicial;
	
    @FXML
    private Button BtBalanceFinal;

    @FXML
    private Button BtComprobacion;

    @FXML
    private Button BtEstadoResultados;

    @FXML
    private Button BtIniciar;

    @FXML
    private Button BtLibroDiario;

    @FXML
    private Button BtLibroMayor;

    @FXML
    private Button BtTicketAlmacen;

    @FXML
    private TextField TbAmortizacion;

    @FXML
    private TextField TbArt1Cant;

    @FXML
    private TextField TbArt1Cant1;

    @FXML
    private TextField TbArt1CantVenta;

    @FXML
    private TextField TbArt1Compra;

    @FXML
    private TextField TbArt1Compra1;

    @FXML
    private TextField TbArt1Venta;

    @FXML
    private TextField TbArt2Cant;

    @FXML
    private TextField TbArt2Cant1;

    @FXML
    private TextField TbArt2Compra;

    @FXML
    private TextField TbArt2Compra1;

    @FXML
    private TextField TbArt3Cant;

    @FXML
    private TextField TbArt3Compra;

    @FXML
    private TextField TbInteres;
    
    @FXML
    void regresarMenuInicial(ActionEvent event) {
    	try {
            // Volver a cargar la ventana inicial
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/VentanaInicial.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Ventana Inicial");
            stage.show();

            // Cerrar la ventana actual
            ((Stage) BtMenuInicial.getScene().getWindow()).close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void setVentanaInicialStage(Stage stage) {
        this.ventanaInicialStage = stage;
    }
    
    public void ventanaLibroMayor(ActionEvent event) {
    	try {
            // Volver a cargar la ventana inicial
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/VentanaLibroMayor.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Libro Mayor");
            stage.show();

            // Cerrar la ventana actual
            ((Stage) BtMenuInicial.getScene().getWindow()).close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void VentanaTicketAlmacen(ActionEvent event) {
    	// Volver a cargar la ventana inicial
    	try {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/VentanaTicketAlmacen.fxml"));
	        Parent root = loader.load();
	        Stage stage = new Stage();
	        stage.setScene(new Scene(root));
	        stage.setTitle("Ticket de Almacen");
	        stage.show();
	
	        // Cerrar la ventana actual
	        ((Stage) BtMenuInicial.getScene().getWindow()).close();

    	}
    	catch (IOException e) {
    		e.printStackTrace();
    	}
    }
    
}
