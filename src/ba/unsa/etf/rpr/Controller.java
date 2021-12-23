package ba.unsa.etf.rpr;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller {
    

    @FXML
    private Button dugmeDodaj;

    @FXML
    private Button dugmeKraj;

    @FXML
    private TextField imeF;
    @FXML
    private TextField prezimeF;
    @FXML
    private TextField emailF;
    @FXML
    private TextField korisnickoImeF;
    @FXML
    private TextField sifraF;

    
    public void prekiniProgram(ActionEvent actionEvent) {
        Button BtnKraj= (Button) actionEvent.getSource();
        Stage scena =(Stage) BtnKraj.getScene().getWindow();
        scena.close();
    }


    public void dodajKorisnika(ActionEvent actionEvent) {
    }
}

