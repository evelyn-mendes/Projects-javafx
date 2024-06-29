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

    @FXML
    void showDateAndH(ActionEvent event) {
        // Date hors = new Date();
            LocalDate date = LocalDate.now();
            LocalTime hours = LocalTime.now();

            lblAlterar.setText("Hora: " + hours + " " + "\nData: " + date);
        
    }

}
