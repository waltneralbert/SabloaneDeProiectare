package Carte;

public class StatisticsCommand implements Command {

	@Override
	public void execute() {
		Element book = DocumentManager.getInstance().getBook();
		DocumentStatVisitor visitor = new DocumentStatVisitor();
		
		for(Element e: ((Sectiune)book).getContinut()) {
			e.accept(visitor);
		}
		
		visitor.printStatistics();
	}

}
