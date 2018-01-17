package Carte;

public interface Visitor {

	public void visitImageProxy(ImageProxy i);
	public void visitImage(Imagine i);
	public void visitParagraf(Paragraf p);
	public void visitTabel(Tabel t);
	public void visitSectiune(Sectiune s);
	
}
