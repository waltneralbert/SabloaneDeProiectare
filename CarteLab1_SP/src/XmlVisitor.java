package Carte;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class XmlVisitor implements Visitor {
	
	private String xml = "";

	@Override
	public void visitImageProxy(ImageProxy i) {
		this.xml = this.xml + "<ImageProxy>" + i.print() + "</ImageProxy> \n";
	}

	@Override
	public void visitImage(Imagine i) {
		this.xml = this.xml + "<Image>" + i.print() + "</Image> \n";
		
	}

	@Override
	public void visitParagraf(Paragraf p) {
		this.xml = this.xml + "<Paragraf>" + p.print() + "</Paragraf> \n";
	}

	@Override
	public void visitTabel(Tabel t) {
		this.xml = this.xml + "<Tabel>" + t.print() + "</Tabel> \n";
		
	}

	@Override
	public void visitSectiune(Sectiune s) {
		this.xml = this.xml + "<Sectiune>\n" + s.print() + " \n";
		
		for(Element e : s.getContinut()) {
			e.accept(this);
		}
		this.xml = this.xml + "</Sectiune>";
	}
	
	public void writeXML() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Visitor.xml")));
		bw.write(xml);
		bw.close();
	}

}
