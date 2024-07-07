package classes;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;

public class ContarController implements Initializable{

    
    @FXML
    private VBox box;

    @FXML
    private Button btn;

    @FXML
    private Label lblMoniEnd;

    @FXML
    private Label lblMoniStart;

    @FXML
    private Label lblMoniStep;

    @FXML
    private Label lblR;

    @FXML
    private Slider sliderEnd;

    @FXML
    private Slider sliderStart;

    @FXML
    private Slider sliderStep;

    @FXML
    private ListView<String> listNum;
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
        //Adicionar a estilização do CSS
        // ListView
        URL cssURL = getClass().getResource("../css/style.css");
        listNum.getStylesheets().add(cssURL.toExternalForm()); // Importanto o estilo

        // VBox
        box.getStylesheets().add(cssURL.toExternalForm()); // Importando o estilo
        box.getStyleClass().add("v-box"); // Adicionando uma classe para que ele pegue o estilo CSS

        // Button
        btn.getStylesheets().add(cssURL.toExternalForm()); // Importanto o estilo
        btn.getStyleClass().add("btn"); // Adicionando uma classe para que ele pegue o estilo CSS
        //btn.setStyle("-fx-background-color: lightgray; -fx-text-fill: red;");


        //Monitoramento do primeiro Slider, o de "início"
        sliderStart.valueProperty().addListener(new ChangeListener<Number>(){

            @Override
            public void changed(ObservableValue <? extends Number> arg0, Number arg1, Number arg2){

                //Pega o valor do slider "start" e o converte para inteiro, e guarda no lbl de exibição desse valor
                lblMoniStart.setText(Integer.toString((int)sliderStart.getValue()));
            }
        
        });

        //Monitoramento do segundo Slider, o de "fim"
        sliderEnd.valueProperty().addListener(new ChangeListener<Number>(){
            
            @Override
            public void changed(ObservableValue <? extends Number> arg0, Number arg1, Number arg2){

                //Pega o valor do slider "end" e o converte para inteiro, e guarda no lbl de exibição desse valor
                lblMoniEnd.setText(Integer.toString((int)sliderEnd.getValue()));
            }
        });

        //Monitoramento do terceiro Slide, o de "pulo"
        sliderStep.valueProperty().addListener(new ChangeListener<Number>(){

            @Override
            public void changed(ObservableValue <? extends Number> arg0, Number agr1, Number agr2){

                //Pega o valor do slider "step" e o converte para inteiro, e guarda no lbl de exibição desse valor
                lblMoniStep.setText(Integer.toString((int)sliderStep.getValue()));
            }
        });

    
    }

    @FXML
    void contar(ActionEvent event) {

        int inicio, fim, pulo;
        inicio = (int)sliderStart.getValue(); // Pega o valor do sliderStart e o converte para inteiro
        fim = (int)sliderEnd.getValue(); // Pega o valor do sliderStart e o converte para inteiro
        pulo = (int)sliderStep.getValue(); // Pega o valor do sliderStart e o converte para inteiro

        listNum.getItems().clear();

        //Se inicio for menor que fim então execute
        if(inicio < fim){
            while(inicio <= fim){

                listNum.getItems().add(Integer.toString(inicio) + "\n");
                inicio += pulo;
            }
        //Senão - Ele considerará o "início" maior e contará do "início" para o "fim"
        } else {

            while(fim < inicio){

                listNum.getItems().add(Integer.toString(inicio) + "\n");
                inicio -= pulo;
            }

        }

    }


}
