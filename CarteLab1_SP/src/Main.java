package Carte;

public class Main {

	public static void main(String[] args) throws Exception {
	/*	Carte c = new Carte();
		Sectiune s = new Sectiune("Introducere");
		Paragraf p = new Paragraf("asdasd");
		s.add(p);
		
		Tabel t = new Tabel();
		Paragraf p2 = new Paragraf("Bla Bla Bla");
		s.add(t);
		s.add(p2);
		
		Imagine i = new Imagine("poza");
		ImageProxy i2 = new ImageProxy("Poza2");
		
		s.add(i);
		s.add(i2);
		c.addContinut(s);
		
		DocumentStatVisitor v = new DocumentStatVisitor();
		for(Element sectiune : c.getContinut()) {
			sectiune.accept(v);
			for(Element e : ((Sectiune) sectiune).getContinut()) {
				e.accept(v);
			}
		}
		v.printStatistics();
		
		
		XmlVisitor xml = new XmlVisitor();
		for(Element sectiune : c.getContinut()) {
			sectiune.accept(xml);
		}
		xml.writeXML();
		*/
		
		Command sample = new CreateSampleCommand();
		sample.execute();
		
		Element book = DocumentManager.getInstance().getBook();
		System.out.println("Inainte de delete: \n" + book.print());
		
		Command delCommand = new DeleteCommand();
		delCommand.execute();
		
		book = DocumentManager.getInstance().getBook();
		System.out.print("Dupa delete: \n " + book.print()+"\n");
		
		
		//Command statCommand = new StatisticsCommand();
		//statCommand.execute();
		
		ParagraphMonitor pm = new ParagraphMonitor();
		Paragraf p1 = new Paragraf("Ceva pe-aici");
		p1.attach(pm);
		
		p1.changeText("Altceva!");
		pm.printChanges();
		SectiuneMonitor sm = new SectiuneMonitor();
		Sectiune s1 = new Sectiune("Titlul Sectiunii");
		s1.attach(sm);
		s1.add(p1);
	}

}
