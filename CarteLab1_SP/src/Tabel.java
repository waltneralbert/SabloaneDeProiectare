package Carte;

public class Tabel extends AbstractElement{
	private String numeTabel;
	
	public Tabel() {
		
	}

	public String print() {
		return this.numeTabel;
		
	}
	
	public void accept(Visitor v) {
		v.visitTabel(this);
	}
	
	public Element clone() {
		return this;
	}

}