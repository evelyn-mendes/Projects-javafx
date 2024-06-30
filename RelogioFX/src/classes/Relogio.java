/*
 * Main class
 * Description: Relógio feito com javafx para ver data e hora
 * Language: Java
 * Author: Evelyn Mendes
*/

package classes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Relogio extends Application{
    
    public static void main(String[] args) throws Exception{
        //Inicia o aplicativo javafx
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        //Importando o arquivo fxml - janela gráfica
        FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("layoutrelogio.fxml"));
        Parent root = fxmlloader.load();
        Scene tela = new Scene(root);

        //Definir a "Scene" que será exbida
        primaryStage.setScene(tela);
        
        //Bloquear o redimensionamento da janela
        primaryStage.setResizable(false);

        //Para mostrar a janela
        primaryStage.show();

    }
}
