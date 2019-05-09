package lab7.media;

public class Track implements Playable{
//	
	private String title;
	private int length;
//	
	public Track() {
		
	}
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
//	
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
//	
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		}
}
