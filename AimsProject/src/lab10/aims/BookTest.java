package lab10.aims;

import lab10.aims.media.Book;

/**
 * BookTest
 */
public class BookTest {

  public static void main(String[] args) {
    Book book1 = new Book("Ong lao va cau Vang", "Truyen cuoi", 123);
    book1.setContent("A ab c ad bca ad sc as.agsdsd a D A 1231 asaaaaa aa aa a a a a");

    book1.processContent();
    System.out.println(book1.toString());
  }
}