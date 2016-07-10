package Lesson9.Memento.controller;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	private List<Memento> mementoList = new ArrayList<Memento>();  
	
	public void add(Memento state) {   
		mementoList.add(state);
	}  
	public boolean hasPreviousState(){
		if(mementoList.size() > 1) return true;
		return false;
	}
	public Memento getPreviousState() {  
		if(hasPreviousState()){
			return mementoList.remove(mementoList.size() - 1);  
		}
		return null;
	}
	
	public void removeAll(){
		mementoList.clear();
	}
}
