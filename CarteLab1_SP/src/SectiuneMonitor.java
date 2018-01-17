package Carte;

public class SectiuneMonitor implements Observer{

	@Override
	public void update() {
		System.out.println("Obiectul " + this + " modificat");
		
	}

}
