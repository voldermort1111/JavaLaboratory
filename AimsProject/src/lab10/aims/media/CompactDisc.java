package lab10.aims.media;

import java.util.ArrayList;
import java.util.Iterator;

import lab10.aims.PlayerException;

public class CompactDisc extends Disc implements Playable, Comparable{
  private String artist;
  private ArrayList<Track> tracks = new ArrayList<Track>();

  public CompactDisc(String title) {
    super(title);
  }

  public CompactDisc(String title, String category) {
    super(title, category);
  }

  public CompactDisc(String title, String category, String artist) {
    super(title, category);
    this.setArtist(artist);
  }

  public CompactDisc(String title, String category, String director, int length) {
    super(title, category, director, length);
  } 

  public CompactDisc(String title, String category, String director, float cost) {
    this(title, category, director);
    super.setCost(cost);
  } 

  public CompactDisc(String title, String category, String director, int length, float cost) {
    super(title, category, director);
    super.setCost(cost);
  }

  

  public CompactDisc() {
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

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public void addTrack(Track newTrack) {
    tracks.add(newTrack);
  }

  public void addTrack(String title, int length) {
    tracks.add(new Track(title, length));
  }

  public void removeTrack(String title) {
    tracks.forEach(track -> {
      if (title.equalsIgnoreCase(track.getTitle())) {
        tracks.remove(track);
      }
    });
  }
  
  public void removeTrack(Track track) {
    tracks.remove(track);
  }

  @Override
  public int getLength() {
    int [] sumLength = {0};
    tracks.forEach(track -> {
      sumLength[0] = sumLength[0] + track.getLength();
    });
    return sumLength[0];
  }

  /**
   * @return the tracks
   */
  public ArrayList<Track> getTracks() {
    return tracks;
  }

  @Override
  public void play() throws PlayerException {
    if (this.getLength() <= 0) {
        System.err.println("ERROR: CD length is 0");
        throw (new PlayerException());
    }

    System.out.println("Playing CD: " + this.getTitle());
    System.out.println("CD length: " + this.getLength());

      Iterator iter = tracks.iterator();
      Track nextTrack;

      while (iter.hasNext()) {
          nextTrack = (Track) iter.next();
          try {
              nextTrack.play();
          } catch (PlayerException e) {
              e.printStackTrace();
          }
      }
  }

  @Override
  public int compareTo(Object o) {
    if (this.tracks.size() < ((CompactDisc)o).getTracks().size()) return -1;
    if (this.tracks.size() > ((CompactDisc)o).getTracks().size()) return 1;
    if (this.getLength() < ((CompactDisc)o).getLength()) return -1;
    if (this.getLength() > ((CompactDisc)o).getLength()) return -1;
    return 0;
  }

}
