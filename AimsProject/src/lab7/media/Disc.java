package lab7.media;

public class Disc extends Media {
	
	private String director;
	private int length;
	  public Disc() {
		    super();
		  }

		  public Disc(String title) {
		    super(title);
		  }
		  public Disc(String title, String category) {
		    super(title, category);
		  }
		  public Disc(String title, String category, String director) {
		    super(title, category);
		    this.director = director;
		  }
		  public Disc(String title, String category, String director, int length) {
		    super(title, category);
		    this.director = director;
		    this.length = length;
		  }
//
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}

}
