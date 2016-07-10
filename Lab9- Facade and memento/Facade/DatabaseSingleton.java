package Lesson9.Facade;

public class DatabaseSingleton {
	private static Database database = null;
	
	public static Database getDatabase(){
		if(database == null){
			database = new Database();
		}
		
		return database;
	}
}
