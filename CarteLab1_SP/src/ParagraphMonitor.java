package Carte;

public class ParagraphMonitor implements Observer{

	@Override
	public void update() {
		System.out.println("Obiectul " + this + " modificat");
		
	}
	
	public void printChanges() {
		
	}

}
