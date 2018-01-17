package Carte;

import java.util.ArrayList;
import java.util.List;

public class Carte {
	private String titlu;
	private List<Autor> autori = new ArrayList<Autor>();
	private Cuprins cuprins;
	private List<Element> continut = new ArrayList<Element>();
	
	public Carte() {
		
	}
	
	public List<Element> getContinut() {
		return this.continut;
	}
	
	public void addContinut(Element e) {
		this.continut.add(e);
	}
}
