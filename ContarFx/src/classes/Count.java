package classes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage; 

public class Count extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("layoutCount.fxml")); // Importação do arquivo criado no "scene builder"

        Parent root = fxmlLoader.load();
        Scene tela = new Scene(root);

        primaryStage.setScene(tela); // Escolha de qual tela irá aparecer
        primaryStage.setResizable(false); // Impede do usuário redimensionar a tela
        primaryStage.show(); // Mostrar a tela
    }
}
