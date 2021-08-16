/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzeegame;

import java.io.File;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author ghms2
 */
public class YahtzeeController implements Initializable {

    @FXML
    private ImageView die1;
    @FXML
    private ImageView die3;
    @FXML
    private ImageView die2;
    @FXML
    private ImageView die4;
    @FXML
    private ImageView die5;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void RollDice(ActionEvent event) {
        Random rand = new Random();
        int roll1 = rand.nextInt(6)+1;
        int roll2 = rand.nextInt(6)+1;
        int roll3 = rand.nextInt(6)+1;
        int roll4 = rand.nextInt(6)+1;
        int roll5 = rand.nextInt(6)+1;

        File file1 = new File("src//images//dice"+roll1+".png");
        File file2 = new File("src//images//dice"+roll2+".png");
        File file3 = new File("src//images//dice"+roll3+".png");
        File file4 = new File("src//images//dice"+roll4+".png");
        File file5 = new File("src//images//dice"+roll5+".png");

        die1.setImage(new Image(file1.toURI().toString()));
        die2.setImage(new Image(file2.toURI().toString()));
        die3.setImage(new Image(file3.toURI().toString()));
        die4.setImage(new Image(file4.toURI().toString()));
        die5.setImage(new Image(file5.toURI().toString()));
    }
    
}
