package Lesson9.Memento.entity;

import Lesson9.Memento.controller.*;

public class Person {
    private long id ;
    private String name ;
    private String address ;
    private String phoneNumber ;

    /*
     * Memento
     */

    public Memento saveStateToMemento() {   
    	return new Memento(name, address, phoneNumber);  
    }  
    
    public void getStateFromMemento(Memento memento) {
    	name = memento.getName();
    	address = memento.getAddress();
    	phoneNumber = memento.getPhoneNumber();
    }  
	
    public Person(){
    	
    }
    
    public Person(String name, String address, String phoneNumber){
    	this.name = name;
    	this.address = address;
    	this.phoneNumber = phoneNumber;
    }
    
    public Person(long id, String name, String address, String phoneNumber){
    	this.id = id;
    	this.name = name;
    	this.address = address;
    	this.phoneNumber = phoneNumber;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
