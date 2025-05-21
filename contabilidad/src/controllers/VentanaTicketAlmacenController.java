package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.scene.control.TableColumn;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
public class VentanaTicketAlmacenController implements Initializable{
	@FXML
	private Label LbMetodo;
	@FXML
	private Button BtRegresar;
	@FXML
	private TableView<application.TicketAlmacen> TabTicketAlmacen;
	@FXML
	private TableColumn<application.TicketAlmacen, String> ColEntradas;
	@FXML
	private TableColumn<application.TicketAlmacen, String> ColSalidas;
	@FXML
	private TableColumn<application.TicketAlmacen, String> ColExistencia;
	@FXML
	private TableColumn<application.TicketAlmacen, String> ColAdquision;
	@FXML
	private TableColumn<application.TicketAlmacen, Integer> ColPromedio;
	@FXML
	private TableColumn<application.TicketAlmacen, String> ColDebe;
	@FXML
	private TableColumn<application.TicketAlmacen, String> ColHaber;
	@FXML
	private TableColumn<application.TicketAlmacen, String> ColSaldo;
	
	private ObservableList<application.TicketAlmacen> ticketAlmacen = FXCollections.observableArrayList();
	
	public void Regresar(ActionEvent event) {
		try {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/VentanaExamen.fxml"));
	        Parent root = loader.load();
	        Stage stage = new Stage();
	        stage.setScene(new Scene(root));
	        stage.setTitle("Menu Examen");
	        stage.show();
	
	        // Cerrar la ventana actual
	        ((Stage) BtRegresar.getScene().getWindow()).close();

    	}
    	catch (IOException e) {
    		e.printStackTrace();
    	}
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		ColEntradas.setCellValueFactory(new PropertyValueFactory<>("entrada"));
		ColEntradas.setStyle("-fx-alignment: CENTER-LEFT");
		
		ColSalidas.setCellValueFactory(new PropertyValueFactory<>("salida"));
		ColSalidas.setStyle("-fx-alignment: CENTER-LEFT");
		
		ColExistencia.setCellValueFactory(new PropertyValueFactory<>("existencia"));
		ColExistencia.setStyle("-fx-alignment: CENTER-LEFT");
		
		ColAdquision.setCellValueFactory(new PropertyValueFactory<>("adquisicion"));
		ColAdquision.setStyle("-fx-alignment: CENTER-LEFT;");
		
		ColPromedio.setCellValueFactory(new PropertyValueFactory<>("promedio"));
		ColPromedio.setStyle("-fx-alignment: CENTER-LEFT;");
		
		ColDebe.setCellValueFactory(new PropertyValueFactory<>("debe"));
		ColDebe.setStyle("-fx-alignment: CENTER-LEFT");
		
		ColHaber.setCellValueFactory(new PropertyValueFactory<>("haber"));
		ColHaber.setStyle("-fx-alignment: CENTER-LEFT");
		
		ColSaldo.setCellValueFactory(new PropertyValueFactory<>("saldo"));
		ColSaldo.setStyle("-fx-alignment: CENTER-LEFT");
	}
}
