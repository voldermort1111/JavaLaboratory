package lab7.media;

import java.util.ArrayList;

import lab7.media.Media;
import lab7.media.Track;

public class CompactDisc extends Disc implements Playable{
	
	private int length;
	private String director;
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
//
	public CompactDisc(String title) {
		super(title);
	}

	public CompactDisc(String title, String category) {
	    super(title, category);
	}

	public CompactDisc(String title, String category, String director) {
	    super(title, category, director);
	}

	public CompactDisc(String title, String category, String director, int length) {
	    super(title, category, director, length);
	} 

	public CompactDisc(String title, String category, String director, int length, float cost) {
	    super(title, category, director);
	    super.setCost(cost);
	}	

	public CompactDisc() {
	}
//
	public void addTrack(Track newtrack) {
		tracks.add(newtrack);

	}
	public void addTrack(String title, int length) {
	    tracks.add(new Track(title, length));
	}
	public void removeTrack(String title) {
		tracks.forEach(track -> {
			if(title.equalsIgnoreCase(track.getTitle())) {
				tracks.remove(track);
				System.out.println("Track "+title+" has been deleted!");
			}
		});
	}
	public void removeTrack(Track track) {
	    tracks.remove(track);
	}

//
	public int getLength(){
		int [] sum = {0};
		tracks.forEach(track -> {
			sum[0] += track.getLength();
		});
		return length;
		
	}
//

	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
//
	
	public void play() {
		tracks.forEach(track -> {
			track.play();
		});
		}
}
