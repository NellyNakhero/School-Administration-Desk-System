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

/**
 * FXML Controller class
 *
 * @author nelly
 */
public class ExaminationsDetailsController implements Initializable {

    @FXML
    private Button secondaryButton11;
    @FXML
    private Button secondaryButton111;
    @FXML
    private Button secondaryButton1111;
    @FXML
    private Button secondaryButton11111;
    @FXML
    private Button secondaryButton111111;
    @FXML
    private Button secondaryButton1111111;
    @FXML
    private Button secondaryButton11111111;
    @FXML
    private Button exitToDashboard;
    @FXML
    private Button registerButton;
    @FXML
    private Button updateCurriculumButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void switchToPrimary(ActionEvent event) {
    }

    @FXML
    private void switchToStudentDashboard(ActionEvent event) throws IOException {
        App.setRoot("student_dashboard");
    }

    @FXML
    private void switchToExamRegistration(ActionEvent event) throws IOException {
        App.setRoot("exam_registration");
    }

    @FXML
    private void switchToUpdateCurriculum(ActionEvent event) throws IOException {
        App.setRoot("upadte_curriculum");
    }
    
}
