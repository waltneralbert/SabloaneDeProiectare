package Carte;

public class DocumentStatVisitor implements Visitor {
	
	private static int imageContor;
	private int paragrafContor;
	private int tabelContor;
	private int sectiuneContor;
	
	public void printStatistics() {
		System.out.println("------- Statistica -------");
		System.out.println("Paragrafe: "+this.paragrafContor);
		System.out.println("Imagini: "+ imageContor);
		System.out.println("Tabele: "+this.tabelContor);
		System.out.println("Sectiuni: "+this.sectiuneContor);
	}

	@Override
	public void visitImageProxy(ImageProxy i) {
		imageContor++;
		
	}

	@Override
	public void visitImage(Imagine i) {
		imageContor++;
		
	}

	@Override
	public void visitParagraf(Paragraf p) {
		this.paragrafContor++;
		
	}

	@Override
	public void visitTabel(Tabel t) {
		this.tabelContor++;
		
	}

	@Override
	public void visitSectiune(Sectiune s) {
		this.sectiuneContor++;
		
	}
}
