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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author nelly
 */
public class Health_detailsController implements Initializable {

    @FXML
    private Button secondaryButton1;
    @FXML
    private Button secondaryButton11;
    @FXML
    private Button addMedicalConditionButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Alert alert = new Alert(Alert.AlertType.NONE);
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
    private void switchToAddMedicalCondition(ActionEvent event) throws IOException {
        App.setRoot("health_add");
    }
    
}
