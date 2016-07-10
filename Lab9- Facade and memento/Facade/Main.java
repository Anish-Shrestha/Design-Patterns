package Lesson9.Facade;

import java.sql.ResultSet;
import java.sql.SQLException;


public class Main {
	public static void main(String[] args){
		DataAccessFacade facade = new DataAccessFacade();
		facade.openConnection();
		String querySql = "select * from user where id = ?";
		String value = "1";
		ResultSet result = facade.executeQuery(querySql, value);
		try{
		if(result.next()){
			System.out.println(result.getString("username"));
		}
		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			facade.closeConnection();
		}
	}
}
