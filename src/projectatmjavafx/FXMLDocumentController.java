/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectatmjavafx;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Hillal
 */
public class FXMLDocumentController implements Initializable {

    String pin = "";
    String PIN = "1234";
    int kesempatan = 3;
    int tmp;

    @FXML
    private Label label;

    @FXML
    private JFXPasswordField editPin;

    @FXML
    private JFXButton no1;

    @FXML
    private JFXButton no2;

    @FXML
    private JFXButton no3;

    @FXML
    private JFXButton no4;

    @FXML
    private JFXButton no5;

    @FXML
    private JFXButton no6;

    @FXML
    private JFXButton no7;

    @FXML
    private JFXButton no8;

    @FXML
    private JFXButton no9;

    @FXML
    private JFXButton delete;

    @FXML
    private JFXButton no0;

    @FXML
    private JFXButton ok;
    
     @FXML
    void handleButtonAction0(ActionEvent event) {
        pin +="0";
        editPin.setText(pin);
    }

    @FXML
    void handleButtonAction1(ActionEvent event) {
        pin +="1";
        editPin.setText(pin);
    }

    @FXML
    void handleButtonAction2(ActionEvent event) {
        pin +="2";
        editPin.setText(pin);
    }

    @FXML
    void handleButtonAction3(ActionEvent event) {
        pin +="3";
        editPin.setText(pin);
    }

    @FXML
    void handleButtonAction4(ActionEvent event) {
        pin +="4";
        editPin.setText(pin);
    }

    @FXML
    void handleButtonAction5(ActionEvent event) {
        pin +="5";
        editPin.setText(pin);
    }

    @FXML
    void handleButtonAction6(ActionEvent event) {
        pin +="6";
        editPin.setText(pin);
    }

    @FXML
    void handleButtonAction7(ActionEvent event) {
        pin +="7";
        editPin.setText(pin);
    }

    @FXML
    void handleButtonAction8(ActionEvent event) {
        pin +="8";
        editPin.setText(pin);
    }

    @FXML
    void handleButtonAction9(ActionEvent event) {
        pin +="9";
        editPin.setText(pin);
    }

    @FXML
    void handleButtonDelete(ActionEvent event) {
        pin +="";
        editPin.setText(pin);
    }

    @FXML
    void handleButtonOk(ActionEvent event) {
       if(pin.equals(PIN)){
           try {
           ((Node) (event.getSource())).getScene().getWindow().hide();
           FXMLLoader fxmlLoader = new FXMLLoader();
           fxmlLoader.setLocation(getClass().getResource("FXMLMenuAwal.fxml"));
           Scene scene = new Scene(fxmlLoader.load(), 830, 450);
           Stage stage = new Stage();
           stage.setScene(scene);
           stage.setTitle("MenuAwal");
           stage.show();
           } catch (IOException e) {
               System.out.println("Failed to create new window." + e);
           }
           
       } else {
           kesempatan -= 1;
            JOptionPane.showMessageDialog(null, "PIN Salah \nTersisa "+kesempatan
           + "kesempatan lagi!");
           editPin.setText("");
           pin = "";
           if (kesempatan == 0) {
               System.exit(0);
           }
       }
    }
    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
   
    
}
