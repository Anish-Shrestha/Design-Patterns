package Lesson9.Memento.dataaccess;

import java.util.ArrayList;

import Lesson9.Memento.entity.Person;


public class DataAccessFacade {
	private PersonDAO personDAO;
	
	public DataAccessFacade(){
		personDAO = DatabaseSingleton.getPersonDAO();
	} 
	
	public void insertPerson(Person person){
		personDAO.insert(person);
	}
	
	public void updatePerson(Person person){
		personDAO.update(person);
	}
	
	public Person getPerson(){
		ArrayList<Person> persons = personDAO.selectAll();
		if(persons.size() == 0) return null;
		return persons.get(0);
	}
	
	public void closeConnection(){
		personDAO.closeConnection();
	}
}
