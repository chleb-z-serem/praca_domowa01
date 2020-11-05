package application;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.ProgressBar;
import javafx.scene.input.KeyEvent;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Label;

public class SampleController {

	@FXML TextArea poleTekstowe;
	@FXML ProgressBar pasek;
	@FXML Button przycisk1;
	float ileZnak = 0;
	float maxZnak = 50;
	@FXML TextField size;
	@FXML Slider suwakSize;
	@FXML MenuItem Arial;
	@FXML MenuItem TNR;
	@FXML Label licznik;
	
	@FXML public void klawiszNaPolu(KeyEvent event) {
		ileZnak+=1;
		pasek.setProgress(ileZnak/maxZnak);
	}
	
	@FXML public void czyœæ() {
		ileZnak = 0;
		poleTekstowe.clear();
		pasek.setProgress(0);
	}

	
	@FXML public void ustawienieSize(MouseEvent event) {
		poleTekstowe.setFont(new Font (poleTekstowe.getFont().getName(), suwakSize.getValue()));
	}

	@FXML public void wybArial() {
		poleTekstowe.setFont(new Font ("Arial", poleTekstowe.getFont().getSize()));
	}

	@FXML public void wybTNR() {
		poleTekstowe.setFont(new Font ("Times New Roman", poleTekstowe.getFont().getSize()));
	}

	@FXML public void klik() {
		licznik.setText("Wpisano "+ileZnak+" z "+maxZnak+ " znaków");
	}
	
}
