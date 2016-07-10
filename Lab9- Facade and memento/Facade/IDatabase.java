package Lesson9.Facade;

import java.sql.Connection;
import java.sql.ResultSet;


public interface IDatabase {
	public void openConnection();
	public ResultSet executeQuery(String sql, String value);
	public void runStoreProcedure(String sql, int value);
	public void closeConnection();
	
}
