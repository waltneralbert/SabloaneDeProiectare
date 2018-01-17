package Carte;

public class Memento {
	Element state;
	
	public void setState(Element e) {
		state = e.clone();
	}
	
	public Element getState() {
		return state;
	}
}
