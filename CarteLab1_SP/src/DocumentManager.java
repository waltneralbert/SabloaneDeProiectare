package Carte;

public class DocumentManager {

	private static DocumentManager instance = null;
	private Element book;
	
	private DocumentManager() {
		
	}
	
	public static DocumentManager getInstance() {
		if(instance == null) {
			instance = new DocumentManager();
		}
		return instance;
	}
	
	public Element getBook() {
		return this.book;
	}
	
	public void setBook(Element book) {
		this.book = book;
	}
}
