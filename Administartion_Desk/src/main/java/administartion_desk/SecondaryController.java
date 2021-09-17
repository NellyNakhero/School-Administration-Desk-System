package administartion_desk;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class SecondaryController {

    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private void schoolInformation(MouseEvent event) throws IOException {
        App.setRoot("school_information");
    }

    @FXML
    private void studentManagement(MouseEvent event) throws IOException {
        App.setRoot("student_dashboard");
    }
}
