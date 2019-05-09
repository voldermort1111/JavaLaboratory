package lab7.media;

public class DigitalVideoDisc extends Disc implements Playable{
//
  public DigitalVideoDisc() {

  }

  public DigitalVideoDisc(String title) {
    super(title);
  }

  public DigitalVideoDisc(String title, String category) {
    super(title, category);
  }

  public DigitalVideoDisc(String title, String category, String director) {
    super(title, category, director);
  }

  public DigitalVideoDisc(String title, String category, String director, int length) {
    super(title, category, director, length);
  } 

  public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
    super(title, category, director);
    super.setCost(cost);
  }
//
  public boolean search(String title) {
	    String [] tokenTitle = this.getTitle().split(" ");
	    String [] token = title.split(" ");
	    for (int i = 0; i < token.length; i++) {
	      Boolean contain = false;
	      for (int j = 0; j < tokenTitle.length; j++) {
	        if (token[i].equalsIgnoreCase(tokenTitle[j])) {
	          contain = true;
	        }
	      }
	      if (contain == false ) {
	        System.out.println("FALSE");
	        return false;
	      }
	    }
	    System.out.println("TRUE");
	    return true;
	  }
//
  public void play() {
	  System.out.println("Playing DVD: " + this.getTitle());
	  System.out.println("DVD length: " + this.getLength());
	  }
}
