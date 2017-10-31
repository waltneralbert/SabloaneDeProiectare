import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Element {
	private String titlu;
	private List<Element> continutSectiune = new ArrayList<Element>();
	
	@Override
	public void add(Element e) throws Exception {
		continutSectiune.add(e);
		
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
	public void print() {
		System.out.println(this.titlu);
		
		for(Element e : continutSectiune) {
			System.out.println(e);
		}
		
		
	}

}
