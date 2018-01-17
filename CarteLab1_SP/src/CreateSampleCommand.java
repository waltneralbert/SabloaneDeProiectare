package Carte;

public class CreateSampleCommand implements Command{

	@Override
	public void execute() {
		Element myBook = new Sectiune("Cartea mea");
		try {
			myBook.add(new Paragraf("asdasd"));
			myBook.add(new Tabel());
			myBook.add(new Paragraf("Bla Bla Bla"));
			myBook.add(new Imagine("poza"));
			myBook.add(new ImageProxy("Poza2"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DocumentManager.getInstance().setBook(myBook);
		
	}

}
