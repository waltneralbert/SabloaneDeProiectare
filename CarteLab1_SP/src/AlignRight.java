package Carte;

public class AlignRight implements AlignStrategy {

	@Override
	public String printAligned(Paragraf p) {
		return p.getText()+"***";
	}

}
