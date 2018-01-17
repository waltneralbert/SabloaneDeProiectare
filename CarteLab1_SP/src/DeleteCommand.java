package Carte;

public class DeleteCommand implements Command {
	Memento state = new Memento();
	@Override
	public void execute() {
		state.setState(DocumentManager.getInstance().getBook().clone());
		Element newBook = new Sectiune("0");
		DocumentManager.getInstance().setBook(newBook);
		
		
	}
	
	public void unexecute() {
		Element oldBook = state.getState();
		DocumentManager.getInstance().setBook(oldBook);
	}
	
	
}
