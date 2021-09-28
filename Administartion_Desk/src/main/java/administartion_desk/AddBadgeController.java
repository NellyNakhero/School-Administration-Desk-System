/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administartion_desk;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundSize;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author nelly
 */
public class AddBadgeController implements Initializable {

    @FXML
    private Button uploadImageButton;
    @FXML
    private Button secondaryButton2;
    @FXML
    private Button secondaryButton111;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backToDasboard(MouseEvent event) throws IOException {
        App.setRoot("badges_details");
    }

    @FXML
    private void UploadImageActionPerformed(ActionEvent event) {
         FileChooser fileChooser = new FileChooser();

        //Set extension filter
        FileChooser.ExtensionFilter extFilterJPG
                = new FileChooser.ExtensionFilter("JPG files (*.JPG)", "*.JPG");
        FileChooser.ExtensionFilter extFilterjpg
                = new FileChooser.ExtensionFilter("jpg files (*.jpg)", "*.jpg");
        FileChooser.ExtensionFilter extFilterPNG
                = new FileChooser.ExtensionFilter("PNG files (*.PNG)", "*.PNG");
        FileChooser.ExtensionFilter extFilterpng
                = new FileChooser.ExtensionFilter("png files (*.png)", "*.png");
        fileChooser.getExtensionFilters()
                .addAll(extFilterjpg, extFilterJPG, extFilterPNG, extFilterpng);
        //Show open file dialog
        File file = fileChooser.showOpenDialog(null);
        

//        try {
//            BufferedImage bufferedImage = ImageIO.read(file);
//            WritableImage image = SwingFXUtils.toFXImage(bufferedImage, null);
//            img.setImage(image);
//            img.setFitWidth(200);
//            img.setFitHeight(200);
//            img.scaleXProperty();
//            img.scaleYProperty();
//            img.setSmooth(true);
//            img.setCache(true);
//            FileInputStream fin = new FileInputStream(file);
//            ByteArrayOutputStream bos = new ByteArrayOutputStream();
//            byte[] buf = new byte[1024];
//
//            for (int readNum; (readNum = fin.read(buf)) != -1;) {
//                bos.write(buf, 0, readNum);
//            }
//            person_image = bos.toByteArray();
//
//        } catch (IOException ex) {
//            Logger.getLogger("ss");
//        }
    }

    @FXML
    private void switchToPrimary(ActionEvent event) {
    }
    
}
