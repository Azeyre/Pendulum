package mvc;

import java.util.ArrayList;
import java.util.List;

public class Modele implements Observable {
	
	private List<Observer> observers;
	private double g;
	
	public Modele() {
		observers = new ArrayList<>();
		g = 9.81;
	}

	@Override
	public void addObserver(Observer obs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeObserver(Observer obs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
	}

}
