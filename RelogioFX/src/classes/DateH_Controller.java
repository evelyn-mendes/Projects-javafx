package classes;

import java.time.LocalDate;
import java.time.LocalTime;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class DateH_Controller {

    @FXML
    private Button btnMudar;

    @FXML
    private Label lblAlterar;

    //Evento de clique no botão
    @FXML
    void showDateAndH(ActionEvent event) {

        LocalDate date = LocalDate.now();
        LocalTime hours = LocalTime.now();

        //Configurar o que irá ser imprimido em "lblAlterar"
        lblAlterar.setText("Hora: " + hours + " " + "\nData: " + date);
        
    }

}
