package lab8.media;

import java.util.ArrayList;

public abstract class Media {
	private String id;
	private String title;
	private String category;
	private float cost;
//	
  public Media() {

  }
  public Media(String title) {
    this();
    this.title = title;
  }
  public Media(String title, String category) {
    this(title);
    this.category = category;
  }
  public Media(String title, String category, float cost) {
    this(title, category);
    this.cost = cost;
  }
//
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

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

}
