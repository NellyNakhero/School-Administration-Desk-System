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
        System.out.println("Something");
    }

    @FXML
    private void studentDetails(MouseEvent event) throws IOException {
        App.setRoot("student_details");
    }
    
}
