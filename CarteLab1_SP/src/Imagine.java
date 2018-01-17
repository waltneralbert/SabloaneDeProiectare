package Carte;

import java.awt.Image;

public class Imagine extends AbstractElement{
	private String pathImagine;
	private Image data;
	
	public Imagine(String fileName) {
		pathImagine = fileName;
	}

	public String print() {
		return this.pathImagine;
		
	}
	
	public void accept(Visitor v) {
		v.visitImage(this);
	}

}
