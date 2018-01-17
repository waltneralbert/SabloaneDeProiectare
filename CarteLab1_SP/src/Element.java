package Carte;

public interface Element extends Cloneable {
	
	public void add(Element e) throws Exception;
	public void remove(Element e) throws Exception;
	public Element getElement(int index) throws Exception;
	public void accept(Visitor v);
	public String print();
	public Element clone();
}
