package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ViewController implements Initializable{

    @FXML
    private TableView<Szemely> tabla;
    
    @FXML
    private TableColumn<Szemely, String> tablaid;

    @FXML
    private TableColumn<Szemely, String> tablavezeteknev;

    @FXML
    private TableColumn<Szemely, String> tablakeresztnev;

    @FXML
    private TableColumn<Szemely, String> tablaSzuletesiDatum;


    @FXML
    private TextField idMezo;

    @FXML
    private TextField vezeteknevMezo;

    @FXML
    private TextField keresztnevMezo;

    @FXML
    private TextField szuletesidatumMezo;
    private ObservableList<Szemely> tablaAdatok=FXCollections.observableArrayList();

    		
    @FXML
    void hozzaadGomb(ActionEvent event) {
    	/*System.out.println(idMezo.getText());
    	System.out.println(vezeteknevMezo.getText());
    	System.out.println(keresztnevMezo.getText());
    	System.out.println(szuletesidatumMezo.getText());*/
    	
    	Szemely szemelyAdd= new Szemely(idMezo.getText(), vezeteknevMezo.getText(), keresztnevMezo.getText(), szuletesidatumMezo.getText());
    	tablaAdatok.add(szemelyAdd);
    }

    @FXML
    void menuItemKilepes(ActionEvent event) {

    }

    @FXML
    void menuItemNevjegy(ActionEvent event) {

    }
    
    @FXML
    void menuItemTorol(ActionEvent event) {
    	Szemely szemelyTorol=tabla.getSelectionModel().getSelectedItem();
    	tablaAdatok.remove(szemelyTorol);
    }
    
    @FXML
    void menuItemSzerkeszt(ActionEvent event) {
    	Szemely szemelySzerkeszt=tabla.getSelectionModel().getSelectedItem();
    	tablaAdatok.remove(szemelySzerkeszt);
    	idMezo.setText(szemelySzerkeszt.getId());
    	vezeteknevMezo.setText(szemelySzerkeszt.getVezetknev());
    	keresztnevMezo.setText(szemelySzerkeszt.getKeresztnev());
    	szuletesidatumMezo.setText(szemelySzerkeszt.getSzuletesidatum());
    	tablaAdatok.get
    }
    
    private void kezdoadatok() {
    	Szemely szemely1=new Szemely("1", "Pusztai", "Bence", "1990-02-13");
    	Szemely szemely2=new Szemely("2", "Juhasz", "Bence", "1994-03-27");
    	Szemely szemely3=new Szemely("3", "Kiss", "Balazs", "1982-02-13");
    	tablaAdatok.add(szemely1);
    	tablaAdatok.add(szemely2);
    	tablaAdatok.add(szemely3);
    	
    }
    
    private void tablaadatokBeallitasa() {

	tablaid.setCellValueFactory(cellData -> cellData.getValue().idProperty());
	tablavezeteknev.setCellValueFactory(cellData->cellData.getValue().vezetknevProperty());
	tablakeresztnev.setCellValueFactory(cellData->cellData.getValue().keresztnevProperty());
	tablaSzuletesiDatum.setCellValueFactory(cellData->cellData.getValue().szuletesidatumProperty());
	tabla.setItems(tablaAdatok);
    }


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		kezdoadatok();
		tablaadatokBeallitasa();
	}

}
