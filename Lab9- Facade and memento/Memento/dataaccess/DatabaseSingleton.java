package Lesson9.Memento.dataaccess;

public class DatabaseSingleton {
	private static PersonDAO personDAO = null;
	
	public static PersonDAO getPersonDAO(){
		if(personDAO == null){
			personDAO = new PersonDAO();
		}
		
		return personDAO;
	}
}
