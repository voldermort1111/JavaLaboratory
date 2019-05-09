package lab10.aims.media;

import lab10.aims.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable, Comparable {

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
    super(title, category, director, length);
    super.setCost(cost);
  }

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

  @Override
  public void play() throws PlayerException {
      if (this.getLength() <= 0) {
          System.err.println("ERROR: DVD length is 0");
          throw (new PlayerException());
      }
      System.out.println("Playing DVD: " + this.getTitle());
      System.out.println("DVD length: " + this.getLength());
  }

  @Override
  public int compareTo(Object o) {
    if (this.getCost() < ((DigitalVideoDisc)o).getCost()) return -1;
    if (this.getCost() > ((DigitalVideoDisc)o).getCost()) return 1;
    return 0;
  }

  
}
