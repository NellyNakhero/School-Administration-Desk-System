/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administartion_desk;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author nelly
 */
public class Curriculum_detailsController implements Initializable {

    @FXML
    private Button secondaryButton11;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backToDasboard(MouseEvent event) throws IOException {
        App.setRoot("student_dashboard");
    }

    @FXML
    private void switchToPrimary(ActionEvent event) {
    }

    @FXML
    private void gamesAndSports(MouseEvent event) throws IOException {
        App.setRoot("sports_games");
    }

    @FXML
    private void clubsWindow(MouseEvent event) throws IOException {
        App.setRoot("clubs");
    }

    @FXML
    private void recitalsWindow(MouseEvent event) throws IOException {
        App.setRoot("recitals");
    }

    @FXML
    private void societiesWindow(MouseEvent event) throws IOException {
        App.setRoot("societies");
    }
    
}
