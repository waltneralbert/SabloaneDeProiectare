package Carte;

public class AbstractElement implements Element{

	@Override
	public void add(Element e) throws Exception {
		throw(new Exception("Not Supported"));
		
	}

	@Override
	public void remove(Element e) throws Exception {
		throw(new Exception("Not Supported"));
		
	}

	@Override
	public Element getElement(int index) throws Exception {
		throw(new Exception("Not Supported"));
	}

	@Override
	public String print() {
		return "";
		
	}
	
	public Element clone() {
		
		return this;
	}

	@Override
	public void accept(Visitor v) {
		
	}

}
