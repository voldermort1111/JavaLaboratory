package lab10.aims.media;


import com.sun.xml.internal.ws.org.objectweb.asm.ClassAdapter;

public abstract class Media implements Comparable {
  private String id;
  private String title;
  private String category;
  private float cost;

  private static long idCounter = 0;


  public Media() {
    this.id = createID();
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

  public static String createID() {
    return String.valueOf(idCounter++);
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

  public float getCost() {
    return cost;
  }

  public void setCost(float cost) {
    this.cost = cost;
  }

  public void setID(String id) {
    this.id = id;
  }

  public String getID() {
    return id;
  }

    @Override
    public boolean equals(Object obj) {
      if (obj == null) {
          throw new NullPointerException("ERROR: Null");
      }
      if (
          (this instanceof Book && !(obj instanceof Book)) ||
          (this instanceof CompactDisc && !(obj instanceof CompactDisc)) ||
          (this instanceof DigitalVideoDisc && !(obj instanceof DigitalVideoDisc))
      ) {
          throw new ClassCastException("ERROR: Class Cast");
      }

      return this.getTitle().equals(((Media)obj).getTitle()) && (this.getCost() == ((Media)obj).getCost());
    }

    @Override
    public int compareTo(Object obj) {
        if (obj == null) {
            throw new NullPointerException("ERROR: Null");
        }
        if (
            (this instanceof Book && !(obj instanceof Book)) ||
            (this instanceof CompactDisc && !(obj instanceof CompactDisc)) ||
            (this instanceof DigitalVideoDisc && !(obj instanceof DigitalVideoDisc))
        ) {
            throw new ClassCastException("ERROR: Class Cast");
        }

        int r = this.getTitle().compareTo(((Media)obj).getTitle()) != 0 ?
                    this.getTitle().compareTo(((Media)obj).getTitle()) :
                    (int)(this.getCost() - ((Media)obj).getCost());
        return r;

    }
}
