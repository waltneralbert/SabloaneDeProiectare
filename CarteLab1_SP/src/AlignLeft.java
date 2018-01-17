package Carte;

public class AlignLeft implements AlignStrategy{

	@Override
	public String printAligned(Paragraf p) {
		return "***"+p.getText();
	}

}
