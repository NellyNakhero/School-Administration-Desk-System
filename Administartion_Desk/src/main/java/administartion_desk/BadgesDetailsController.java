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
public class BadgesDetailsController implements Initializable {

    @FXML
    private Button addBadgeButton;
    @FXML
    private Button registerButton1111;
    @FXML
    private Button deleteBadgebutton;
    @FXML
    private Button awardBadgeButton;
    @FXML
    private Button viewBadgesButton;

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
    private void switchToAddBadge(ActionEvent event) throws IOException {
        App.setRoot("add_badge");
    }

    @FXML
    private void switchToExamRegistration(ActionEvent event) {
    }

    @FXML
    private void switchToDeleteBadge(ActionEvent event) throws IOException {
        App.setRoot("delete_badge");
    }

    @FXML
    private void switchToAwardBadge(ActionEvent event) throws IOException {
        App.setRoot("award_badge");
    }

    @FXML
    private void switchToViewBadges(ActionEvent event) throws IOException {
        App.setRoot("view_badges");
    }
    
}
