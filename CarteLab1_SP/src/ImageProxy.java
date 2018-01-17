package Carte;

public class ImageProxy extends AbstractElement {
	private String fileName;
	private Imagine realImage = null;
	
	public ImageProxy(String fileName) {
		this.fileName = fileName;
	}
	
	public String print() {
		if(realImage == null) {
			realImage = new Imagine(fileName);
		}
		return realImage.print();
	}
	
	public void accept(Visitor v) {
		v.visitImageProxy(this);
	}
}
