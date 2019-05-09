package lab8.media;

import java.util.ArrayList;
import java.util.List;

import lab8.media.Media;;

public class Book extends Media implements Comparable {

  private List<String> authors = new ArrayList<String>();
  private int count;

  public Book() {

  }

  Book(String title) {
    super(title);
  }

  Book(String title, String category){
    super(title, category);
  }

  Book(String title, String category, List<String>authors){
    super(title, category);
    this.authors = authors;
  }
//
  public void addAuthor(String authorName) {
	int check=0;
	int i=0;
	count++; // dem so lenh
	if(authors.size()<1) {
		authors.add(authorName);
		System.out.println(count+". New author has been added: "+authorName);
	//	System.out.println("hello "+authors.get(authors.size()-1).toString());
	}else {
		for(i=0;i<authors.size();i++) {
			if(authors.get(i).toString() == authorName) {
				check =1; // check da ton tai
			}
		}
		if (check==1) {
			System.out.println(count+ " .Can't add "+authorName+"! Author "+authorName+" has been existed");
		}else {	
			authors.add(authorName);
			System.out.println(count+". New author has been added: "+authorName);
		//	System.out.println("hello "+authors.get(authors.size()-1).toString());
		}
		}
		System.out.println();
  	}

  public void removeAuthor(String authorName) {
		count++;
		if(authors.contains(authorName)==false) {
			System.out.println(count+ ". Can't delete "+authorName+"! Author "+ authorName+ " doesn't exist!");
		}else {
			authors.remove(authorName);
			System.out.println(count+ ". Author "+authorName+" has been deleted");
		}
		System.out.println();
	}
//
  /**
   * @return the authors
   */
  public List<String> getAuthors() {
    return authors;
  }
  /**
   * @param authors the authors to set
   */
  public void setAuthors(List<String> authors) {
    this.authors = authors;
  }

@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}

}
