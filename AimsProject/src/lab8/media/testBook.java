package lab8.media;
import lab8.media.Book;
public class testBook {
	public static void main(String[] args) {
		Book anBook = new Book();
		anBook.addAuthor("KaKa");
		anBook.addAuthor("JK. Rowling");
		anBook.addAuthor("Dan Brown");
		anBook.addAuthor("Tony Stark");
		anBook.addAuthor("Harry Potter");
		anBook.addAuthor("KaKa");
		System.out.println("	List of authors: "+anBook.getAuthors());
		anBook.removeAuthor("Minh Hieu");
		anBook.removeAuthor("Tony Stark");
		System.out.println("	List of authors(updated): "+anBook.getAuthors());
	}

	public testBook() {
		// TODO Auto-generated constructor stub
	}

}
