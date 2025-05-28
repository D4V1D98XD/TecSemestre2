package controllers;

import application.DatosExamen;
import application.TicketAlmacen;
import application.DatosCompartidos;
import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/VentanaInicial.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Ventana Inicial");
            stage.show();

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
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/VentanaLibroMayor.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Libro Mayor");
            stage.show();

            ((Stage) BtMenuInicial.getScene().getWindow()).close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void VentanaTicketAlmacen(ActionEvent event) {
    	try {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/VentanaTicketAlmacen.fxml"));
	        Parent root = loader.load();
	        Stage stage = new Stage();
	        stage.setScene(new Scene(root));
	        stage.setTitle("Ticket de Almacen");
	        stage.show();
	
	        ((Stage) BtMenuInicial.getScene().getWindow()).close();

    	}
    	catch (IOException e) {
    		e.printStackTrace();
    	}
    }
    
    public void libroDiario(ActionEvent event) {
    	try {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/VentanaLibroDiario.fxml"));
	        Parent root = loader.load();
	        Stage stage = new Stage();
	        stage.setScene(new Scene(root));
	        stage.setTitle("Ticket de Almacen");
	        stage.show();
	
	        ((Stage) BtMenuInicial.getScene().getWindow()).close();

    	}
    	catch (IOException e) {
    		e.printStackTrace();
    	}
    }
    
    public void iniciarExamen(ActionEvent event) {
        try {
        	
        	FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/VentanaMetodoVenta.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Metodo de venta");
            stage.show();
            VentanaMetodoVentaController metodoVenta = new VentanaMetodoVentaController();
            int[] entradas = {
                Integer.parseInt(TbArt1Cant.getText()),
                Integer.parseInt(TbArt2Cant.getText()),
                Integer.parseInt(TbArt3Cant.getText()),
                Integer.parseInt(TbArt1Cant1.getText()),
                Integer.parseInt(TbArt2Cant1.getText())
            };

            int salida = Integer.parseInt(TbArt1CantVenta.getText());
            int[] existencias = DatosExamen.calcularExistencias(entradas, salida);

            int[] adquisiciones = {
            		Integer.parseInt(TbArt1Compra.getText()),
                    Integer.parseInt(TbArt2Compra.getText()),
                    Integer.parseInt(TbArt3Compra.getText()),
                    Integer.parseInt(TbArt1Compra1.getText()),
                    Integer.parseInt(TbArt2Compra1.getText())
            };
            
            // Limpia y guarda los datos en la lista compartida
            DatosCompartidos.listaTickets.clear();

            for (int i = 0; i < entradas.length; i++) {
                int entrada = entradas[i];

                // Última fila = la venta
                if (i == entradas.length - 1) {
                    int existenciaFinal = existencias[i] - salida;

                    TicketAlmacen ticket = new TicketAlmacen(
                        "",                                      // Entrada vacía
                        String.valueOf(salida),                 // Salida real
                        String.valueOf(existenciaFinal),        // Existencia final real
                        "-", "-", "-", "-", 0
                    );
                    DatosCompartidos.listaTickets.add(ticket);
                } else {
                    double adquisicion = adquisiciones[i];
                    double debe = entrada * adquisicion;

                    TicketAlmacen ticket = new TicketAlmacen(
                        String.valueOf(entrada),
                        "0",                                     // No hay salida
                        String.valueOf(existencias[i]),
                        String.format("%.2f", adquisicion),
                        String.format("%.2f", debe),
                        "-", "-", 0
                    );
                    DatosCompartidos.listaTickets.add(ticket);
                    double peps = MetodosInventario.calcularPEPS(DatosCompartidos.listaTickets, salida);
                    double ueps = MetodosInventario.calcularUEPS(DatosCompartidos.listaTickets, salida);
                    double promedio = MetodosInventario.calcularPromedioPonderado(DatosCompartidos.listaTickets, salida);

                }
            }
        
            
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
