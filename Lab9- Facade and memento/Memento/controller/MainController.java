package Lesson9.Memento.controller;

import Lesson9.Memento.dataaccess.DataAccessFacade;
import Lesson9.Memento.entity.Person;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class MainController {
	private DataAccessFacade dataAccess = new DataAccessFacade();
	private CareTaker careTaker = new CareTaker();
	private Person person = new Person();
	
	@FXML
	private TextField txtFirstName;
	
	@FXML
	private TextField txtAddress;
	
	@FXML
	private TextField txtPhoneNum;
	
	@FXML
	private Button btnLoad;
	
	@FXML 
	private Button btnSave;
	
	@FXML
	private Button btnUndo;
	
	@FXML
	void btnLoadClick(ActionEvent event) throws Exception {
		person = dataAccess.getPerson();
		if(person != null){
			String name = person.getName();
			String address = person.getAddress();
			String phoneNumber = person.getPhoneNumber();
			txtFirstName.setText(name);
			txtAddress.setText(address);
			txtPhoneNum.setText(phoneNumber);
			careTaker.add(new Memento(name, address, phoneNumber));
		}
	}
	
	@FXML
	void btnSaveClick(ActionEvent event) throws Exception {
		String firstName = txtFirstName.getText();
		String address = txtAddress.getText();
		String phoneNum = txtPhoneNum.getText();
		Person udPerson = new Person(person.getId(), firstName, address, phoneNum);
		dataAccess.updatePerson(udPerson);
		careTaker.removeAll();
	}
	
	@FXML
	void btnUndoClick(ActionEvent event) throws Exception {
		if(careTaker.hasPreviousState()){
			Memento state = careTaker.getPreviousState();
			txtFirstName.setText(state.getName());
			txtAddress.setText(state.getAddress());
			txtPhoneNum.setText(state.getPhoneNumber());
		}
	}
	
	@FXML
	void txtTextChanged(KeyEvent event) throws Exception {
		String name = txtFirstName.getText();
		String address = txtAddress.getText();
		String phoneNumber = txtPhoneNum.getText();
		careTaker.add(new Memento(name, address, phoneNumber));
	}
	
}
