package lab10.aims.media;

import lab10.aims.PlayerException;

public class Track implements Playable, Comparable{
  private String title;
  private int length;

  public Track() {
    
  }

  public Track(String title, int length) {
    this.title = title;
    this.length = length;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public int getLength() {
    return length;
  }
  public void setLength(int length) {
    this.length = length;
  }

  @Override
  public void play() throws PlayerException {
      if (this.getLength() <= 0) {
          System.err.println("ERROR: Track length is 0");
          throw (new PlayerException());
      }
      System.out.println("Playing Track: " + this.getTitle());
      System.out.println("Track length: " + this.getLength());
  }

  @Override
  public int compareTo(Object o) {
    return this.getTitle().compareTo(((Track)o).getTitle());
  }
}
