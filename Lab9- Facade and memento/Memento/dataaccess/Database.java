package Lesson9.Memento.dataaccess;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Database{
	
	protected Connection connection = null;
	protected PreparedStatement statement = null;
	
	
	public Database(){
		try{
			 Class.forName("org.sqlite.JDBC").newInstance();
			 connection = DriverManager.getConnection("jdbc:sqlite:memento.db");
			 statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS persons(id INTEGER PRIMARY key AUTOINCREMENT,name VARCHAR ,address VARCHAR ,phone_number VARCHAR)");
			 statement.executeUpdate() ;
		}catch(SQLException e){
			e.printStackTrace();
		}catch(IllegalAccessException e){
			e.printStackTrace();
		}catch(InstantiationException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	public void closeStatement(){
		if(statement != null){
			 try {
				 statement.close();
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		}
	}
	public void closeConnection() {
		closeStatement();
		if(connection != null){
	        try {
	            connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		}
		
	}
}
