package Lesson9.Facade;

import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database implements IDatabase{
	
	private Connection connection = null;
	private PreparedStatement prep = null;
	private CallableStatement call = null;
	
	
	@Override
	public void openConnection(){

		try{
			 Class.forName("org.sqlite.JDBC").newInstance();
			 connection = DriverManager.getConnection("jdbc:sqlite:test.db");
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
	
	@Override
	public ResultSet executeQuery(String sql, String value){
		ResultSet rset = null;
		try{
			prep = connection.prepareStatement(sql);
			prep.setString(1, value);
			rset = prep.executeQuery();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return rset;
	}
	
	@Override
	public void runStoreProcedure(String sql, int value){
		CallableStatement call = null;
		try{
		call = connection.prepareCall(sql);
		call.setInt(1, value);
		call.registerOutParameter(2, java.sql.Types.INTEGER);
		call.execute();
		System.out.println(call.getInt(2));
		} catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(call != null){
				try{
					call.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
		
	}
	
	@Override
	public void closeConnection() {

		if(prep != null){
			 try {
		            prep.close();
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		}
		if(connection != null){
	        try {
	            connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		}
		
	}
}
