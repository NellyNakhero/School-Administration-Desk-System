/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administartion_desk;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author nelly
 */
public class Student_dashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void studentRegistration(MouseEvent event) throws IOException {
        App.setRoot("student_registration");
        System.out.println("student registration");
    }

    @FXML
    private void studentDetails(MouseEvent event) throws IOException {
        App.setRoot("student_details");
    }

    @FXML
    private void guardianDetails(MouseEvent event) throws IOException {
        App.setRoot("guardian_details");
    }
    
    void alertMessage(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Health and Fitness Confirmation Message");
        alert.setContentText("Does the student have any pre-existing medical condition?");
        ButtonType no = new ButtonType("No", ButtonData.NO);
        ButtonType yes = new ButtonType("Yes", ButtonData.YES);
         alert.getDialogPane().getButtonTypes().add(no);
         alert.getDialogPane().getButtonTypes().add(yes);
         alert.showAndWait();
    }

    @FXML
    private void healthDetails(MouseEvent event) throws IOException {
//        alertMessage();
        App.setRoot("health_details");
    }

    @FXML
    private void curriculum_details(MouseEvent event) throws IOException {
        App.setRoot("curriculum_details");
    }

    @FXML
    private void examDetails(MouseEvent event) throws IOException {
        App.setRoot("examinations_details");
    }
}
