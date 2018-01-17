package Carte;

public class AlignCenter implements AlignStrategy{

	@Override
	public String printAligned(Paragraf p) {
		return "***"+p.getText()+"***";
	}

}
