package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class VentanaInicialController {
	@FXML
	private Label lbTituloInicio;
	@FXML
	private Button btIniciar;
	@FXML
	private Button creditos;
	@FXML
	private Button salir;

	@FXML
	public void ponerNegrita(MouseEvent event) {
		lbTituloInicio.setStyle("-fx-font-weight: bold;");
	}
	public void quitarNegrita(MouseEvent event) {
		lbTituloInicio.setStyle("-fx-font-weight: normal;");
	}
	@FXML
	public void inicioExamen(ActionEvent event) {
		 try {
		    	//Crea un objeto FMXLLoader que lo obtiene de ventana creditos
		    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/VentanaExamen.fxml"));
		    	Parent root = loader.load(); //guarda el contenido del fxml y lo hace nodo raiz de la escena
		        Scene scene = new Scene(root); //crea una escena con el nodo raiz
		        Stage stage = new Stage(); // crea una nueva ventana
		        stage.setScene(scene); // asocia la escena a la nueva ventana creada
		        stage.setTitle("Examen"); // le pone titulo
		        stage.show(); // muestra la nueva ventana
		        ((Stage) ((Button) event.getSource()).getScene().getWindow()).close();
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
	}
	@FXML
	public void ventanaCreditos(ActionEvent event) {
	    try {
	    	//Crea un objeto FMXLLoader que lo obtiene de ventana creditos
	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/VentanaCreditos.fxml"));
	    	Parent root = loader.load(); //guarda el contenido del fxml y lo hace nodo raiz de la escena
	        Scene scene = new Scene(root); //crea una escena con el nodo raiz
	        Stage stage = new Stage(); // crea una nueva ventana
	        stage.setScene(scene); // asocia la escena a la nueva ventana creada
	        stage.setTitle("Créditos"); // le pone titulo
	        stage.show(); // muestra la nueva ventana

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

	public void cerrarPrograma(ActionEvent event) {
		/*Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/gui/VentanaInicial.fxml"));
			Scene scene = new Scene(root);
			Stage primaryStage = new Stage();
			primaryStage.setScene(scene);
			primaryStage.setTitle("Examen de Contabilidad version 0.01");
			primaryStage.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}

}
