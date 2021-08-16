/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzeegame;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Brendan
 */
public class YahtzeeGame extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        // change the name of your fxml file to match
        Parent root = FXMLLoader.load(getClass().getResource("yahtzee.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Yahtzee Game");
        stage.setScene(scene);
        stage.show();
    }
    
}
