package Lesson9.Facade;

import java.sql.ResultSet;


public class DataAccessFacade {
	private IDatabase database;
	
	public DataAccessFacade(){
		database = DatabaseSingleton.getDatabase();
	} 
	
	public void openConnection(){
		database.openConnection();
	}
	public ResultSet executeQuery(String querySql, String queryValue){
		return database.executeQuery(querySql, queryValue);
	}
	public void runProcedure(String sql, int value){
		database.runStoreProcedure(sql, value);
	}
	public void closeConnection(){
		database.closeConnection();
	}
}
