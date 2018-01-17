package Carte;

import java.util.ArrayList;
import java.util.List;

public class Sectiune extends ObservableElement{
	private String titlu;
	private List<Element> continutSectiune = new ArrayList<Element>();
	
	public Sectiune(String titlu) {
		this.titlu = titlu;
	}
	
	@Override
	public void add(Element e) throws Exception {
		continutSectiune.add(e);
		this.myNotify();
	}
	@Override
	public void remove(Element e) throws Exception {
		continutSectiune.remove(e);
	}
	@Override
	public Element getElement(int index) throws Exception {
		return continutSectiune.get(index);
	}
	@Override
	public String print() {
		return this.titlu;
	}
	@Override
	public void accept(Visitor v) {
		v.visitSectiune(this);
	}
	
	public List<Element> getContinut() {
		return this.continutSectiune;
	}
	
	public Element clone() {
		return this;
	}
	
}
