package Carte;

import java.util.ArrayList;

public abstract class ObservableElement implements Subject, Element{
	
	private ArrayList<Observer> observers = new ArrayList<Observer>();

	@Override
	public void add(Element e) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Element e) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Element getElement(int index) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Element clone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void attach(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void deattach(Observer o) {
		observers.remove(o);
		
	}

	@Override
	public void myNotify() {
		for (Observer o : this.observers) {
			o.update();
		}
		
	}

}
