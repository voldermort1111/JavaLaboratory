package lab6.order;

import java.util.ArrayList;

import lab6.media.Book;
import lab6.media.DigitalVideoDisc;
import lab6.media.Media;

public class Order {
	
	public static final int MAX_NUMBERS_ORDERED = 10;
	public static final int MAX_NUMBERS_ORDERS = 5;
	private String dateOrdered; 
	private static int nbOrders = 0;
	private int count=0;
	private ArrayList<Media> itemOrdered = new ArrayList<Media>();
	//
	public void addMedia(Media media) {
		if (itemOrdered.size()==MAX_NUMBERS_ORDERED) {
			System.out.println(count+". The order is full!");
		}else {
			itemOrdered.add(media);
			System.out.println(count+". "+media+" has been added!");
		}count++;
	}
	public void removeMedia(Media media) {
		itemOrdered.remove(media);
		System.out.println(count+". "+media+" has been deleted");
		System.out.println("Current number: "+ itemOrdered.size());
		count++;
	}
	
 	public float totalCost() {
        float sum = 0;
        for (int i = 0; i < itemOrdered.size(); i++) {
            sum += itemOrdered.get(i).getCost();
        }
        return sum;
    }
	
	public Order(String dateOrdered) {
			this.dateOrdered = dateOrdered;
			if(nbOrders <= MAX_NUMBERS_ORDERS ) {
				nbOrders++;
			}
			else {
				System.out.println("Number of orders is full => You can't order");
			}
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

	
}
