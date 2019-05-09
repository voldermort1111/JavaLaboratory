package lab6.media;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}

	DigitalVideoDisc(String title, String category) {
		super();
		this.title = title;
		this.category =category;
	}
	
	DigitalVideoDisc(String title, String category, String director) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		
	}
	
	DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}	
	
	public boolean search(String title) {
		String[] word2 = this.title.split(" ");
		String[] word1 = title.split(" ");
		int check = 0;
		for (int i=0; i<word1.length; i++) {
			for (int j=0; j<word2.length; j++) {
				if (word1[i].equalsIgnoreCase(word2[j]) == true) {
					word2[j] = null;
					check++;
				}
			}
		}
		System.out.println(check);
		if (check == word1.length) 
			return true;
		else 
			return false;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
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
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}

}
