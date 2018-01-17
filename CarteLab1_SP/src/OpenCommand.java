package Carte;

public class OpenCommand implements Command{

	Builder builder;
	
	public OpenCommand(String fileName) {
		builder = new JSONBuilder(fileName);
	}
	
	@Override
	public void execute() {
		
		builder.build();
		Element carte = builder.getResult();
		
		DocumentManager.getInstance().setBook(carte);
	}

}
