package Carte;

public class Paragraf extends ObservableElement {
	private String text;
	
	public Paragraf(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}

	public String print() {
		return this.text;
		
	}
	
	public void accept(Visitor v) {
		v.visitParagraf(this);
	}
	
	public Element clone() {
		return this;
	}
	
	public void changeText(String s) {
		text = s;
		this.myNotify();
	}

}
