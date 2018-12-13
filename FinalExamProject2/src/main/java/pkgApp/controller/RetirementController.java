package pkgApp.controller;

import java.awt.Label;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import pkgApp.RetirementApp;
import pkgCore.Retirement;

public class RetirementController extends Retirement implements Initializable {

		
	private RetirementApp mainApp = null;
	
	@FXML 
	private Label txtSaveEachMonth;
	
	@FXML
	private TextField txtYearsToWork;
	
	@FXML
	private TextField txtAnnualReturnWorking;
	
	@FXML
	private Label txtNeedToSave;
	
	@FXML
	private TextField txtYearsRetired;
	
	@FXML
	private TextField txtAnnualReturnRetired;
	
	@FXML
	private TextField txtRequiredIncome;
	
	@FXML
	private TextField txtMonthlySSI;

	public RetirementApp getMainApp() {
		return mainApp;
	}

	public void setMainApp(RetirementApp mainApp) {
		this.mainApp = mainApp;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {		
	}
	
	@FXML
	public void btnClear(ActionEvent event) {
		txtSaveEachMonth.setText("");
		txtYearsToWork.setText("");
		txtAnnualReturnWorking.setText("");
		txtNeedToSave.setText("");
		txtYearsRetired.setText("");
		txtAnnualReturnRetired.setText("");
		txtRequiredIncome.setText("");
		txtMonthlySSI.setText("");
	}
	
	@FXML
	public void btnCalculate(ActionEvent event) {
		
		Retirement rt = new Retirement();
		rt.setiYearsToWork(Integer.parseInt(txtYearsToWork.getText()));
		rt.setdAnnualReturnRetired(Double.parseDouble(txtAnnualReturnRetired.getText()));
		rt.setiYearsRetired(Integer.parseInt(txtYearsRetired.getText()));
		rt.setdAnnualReturnWorking(Double.parseDouble(txtAnnualReturnWorking.getText()));
		rt.setdMonthlySSI(Double.parseDouble(txtMonthlySSI.getText()));
		rt.setdRequiredIncome(Double.parseDouble(txtRequiredIncome.getText()));
		
		
		txtSaveEachMonth.setText(Double.toString(AmountToSave()));
		txtNeedToSave.setText(Double.toString(TotalAmountSaved()));


	}
	
}
