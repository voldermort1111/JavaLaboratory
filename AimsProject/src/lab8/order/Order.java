package lab8.order;

import java.util.ArrayList;
import java.util.Arrays;

import lab7.media.Book;
import lab7.media.DigitalVideoDisc;
import lab7.media.Media;

public class Order {
	
	private String id;
	public static final int MAX_NUMBERS_ORDERED = 10;
	public static final int MAX_NUMBERS_ORDERS = 5;
	private String dateOrdered; 
	public static int nbOrder = 0;
	private ArrayList<Media> itemOrdered = new ArrayList<Media>();
	//
	public Order() {

	}

	Order(String date) {
	    dateOrdered = date;
	    nbOrder ++;

	    if (nbOrder > MAX_NUMBERS_ORDERS) {
	      System.out.println("\n The ordered is full");
	    }
	 }
  public void addMedia(Media media) {
    if (itemOrdered.size() >= MAX_NUMBERS_ORDERED) {
      System.out.println("The Order is full!");
    } else {
      itemOrdered.add(media);
    }
  }

  public void addMedia(Media [] medias) {
    if (itemOrdered.size() >= MAX_NUMBERS_ORDERED) {
      System.out.println("The Order is full!");
    } else if (itemOrdered.size() + medias.length >= MAX_NUMBERS_ORDERED) {
      System.out.println("The new list is too big:");
      for (int i = 0; i<medias.length; i++) {
        System.out.println((i+1) + ": " + itemOrdered.get(i).getTitle());
      }
    } else {
      ArrayList<Media> tmps = new ArrayList<Media>(Arrays.asList(medias));
      itemOrdered.addAll(tmps);

      System.out.println("Add successful: ");
      for (int i = 0; i<tmps.size(); i++) {
        System.out.println((i+1) + ": " + tmps.get(i).getTitle());
      }
      System.out.println("\nCurrent number: " + itemOrdered.size());
    }
  }

  public void removeMedia(Media media) {
    itemOrdered.remove(media);
    System.out.println("Current number: "+itemOrdered.size());
  }
	
 	public float totalCost() {
        float sum = 0;
        for (int i = 0; i < itemOrdered.size(); i++) {
            sum += itemOrdered.get(i).getCost();
        }
        return sum;
    }
	
//	
	public void printOrder() {
		System.out.println("**************Order*****************");
		System.out.println("Date: " + this.dateOrdered);
		System.out.println("Ordered Items:");
		for(int i=0; i<itemOrdered.size(); i++)
			System.out.printf("%d. DVD-[%s]-[%s]-[%s]-[%d]: %f$ \n", 
					i+1, itemOrdered.get(i).getTitle(), itemOrdered.get(i).getCategory(),  itemOrdered.get(i).getCost()); //
		System.out.printf("Total cost: %f\n\n", this.totalCost());//itemOrdered.get(i).getDirector(), itemOrdered.get(i).getLength(),
	}
	
//
	  public void getDetail() {
		    System.out.println("**********************Order******************");
				System.out.println("Date: "+this.dateOrdered);
				System.out.println("Ordered Items:");
				for (int i=0; i<itemOrdered.size(); i++) {
		      if (itemOrdered.get(i) instanceof DigitalVideoDisc) {
		        DigitalVideoDisc tmp = (DigitalVideoDisc)itemOrdered.get(i);

		        System.out.println((i+1) + ". DVD "+ tmp.getTitle()+ " - " + tmp.getCategory()+ " - "+ 
							tmp.getDirector()+ " - "+ tmp.getLength()+ " : "+ tmp.getCost()+ "$");
		      } else if (itemOrdered.get(i) instanceof Book) {
		        Book tmp = (Book)itemOrdered.get(i);

		        System.out.println((i+1) + ". Book "+ tmp.getTitle()+ " - " + tmp.getCategory()+ " - "+ 
							tmp.getAuthors()+ " + "+ tmp.getCost()+ "$");
		      }

					
				}
				System.out.println("Total cost: "+ this.totalCost());
				System.out.println("*****************************************");
		  }

	//
	
	public String getDateOrdered() {
		return dateOrdered;
	}
	public void setDateOrdered(String dateOrdered) {
		this.dateOrdered = dateOrdered;
	}
	public ArrayList<Media> getItemOrdered() {
		return itemOrdered;
	}
	public void setItemOrdered(ArrayList<Media> itemOrdered) {
		this.itemOrdered = itemOrdered;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
}
