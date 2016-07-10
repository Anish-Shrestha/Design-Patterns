package Lesson9.Memento.dataaccess;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Lesson9.Memento.entity.*;

public class PersonDAO extends Database{
	
	public PersonDAO(){
		super();
	}
    public void insert(Person person) {
        try {
            statement = connection.prepareStatement("insert into persons(name,address,phone_number)VALUES(?,?,?)") ;
            statement.setString(1,person.getName());
            statement.setString(2,person.getAddress());
            statement.setString(3, person.getPhoneNumber());
            statement.execute() ;
            closeStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void update(Person person){
    	try {
            statement = connection.prepareStatement("update persons set name = ?, address = ?, phone_number = ? where id = ?");
            statement.setString(1,person.getName());
            statement.setString(2,person.getAddress());
            statement.setString(3, person.getPhoneNumber());
            statement.setLong(4, person.getId());
            statement.execute() ;
            closeStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Person select(long id) {
    	Person person = new Person() ;
        try {
            statement = connection.prepareStatement("select * from persons WHERE id=?") ;
            statement.setLong(1,id);
            ResultSet resultSet = statement.executeQuery() ;
            resultSet.next() ;
            person.setName(resultSet.getString("name"));
            person.setAddress(resultSet.getString("address"));
            person.setPhoneNumber(resultSet.getString("phone_number"));
            closeStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return person ;
    }

    public ArrayList<Person> selectAll() {
        ArrayList<Person> list = new ArrayList<Person>() ;
        try {
            statement = connection.prepareStatement("select * from persons") ;
            ResultSet resultSet = statement.executeQuery() ;
            while (resultSet.next()) {
            	Person person = new Person() ;
                person.setId(resultSet.getLong("id"));
                person.setName(resultSet.getString("name"));
                person.setAddress(resultSet.getString("address"));
                person.setPhoneNumber(resultSet.getString("phone_number"));
                list.add(person) ;
            }
            closeStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list ;
    }

}
