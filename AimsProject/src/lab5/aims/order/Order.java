package lab5.aims.order;

import java.util.Random;

import lab5.aims.disc.DigitalVideoDisc;

public class Order {
	
	public static final int MAX_NUMBERS_ORDERED = 10;
	public static final int MAX_NUMBERS_ORDERS = 5;
	
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered=0 ;
	private String dateOrdered; 
	private static int nbOrders = 0;
	
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < MAX_NUMBERS_ORDERED && nbOrders <= MAX_NUMBERS_ORDERS) {
			itemOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.printf("%d disc have been added: %s\n", qtyOrdered, disc.getTitle());
		}
		else
			System.out.println("The order is fulled");
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		int count = dvdList.length;
		if(count < MAX_NUMBERS_ORDERED && nbOrders <= MAX_NUMBERS_ORDERS) {
			for(int i=0; i<count ;i++) {
				itemOrdered[qtyOrdered] = dvdList[i];
				System.out.printf("%d disc have been added: %s\n", qtyOrdered, dvdList[i].getTitle());
				qtyOrdered++;
			}
		}
		else {
			System.out.println("The order is fulled");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if(qtyOrdered <= (MAX_NUMBERS_ORDERED -2) && nbOrders <= MAX_NUMBERS_ORDERS) {
			itemOrdered[qtyOrdered] = dvd1;
			System.out.printf("%d disc have been added: %s\n", qtyOrdered, dvd1.getTitle());
			qtyOrdered++;
			itemOrdered[qtyOrdered] = dvd2;
			System.out.printf("%d disc have been added: %s\n", qtyOrdered, dvd2.getTitle());
			qtyOrdered ++;
		}
		else if(qtyOrdered == (MAX_NUMBERS_ORDERED -1) && nbOrders <= MAX_NUMBERS_ORDERS) {
			itemOrdered[qtyOrdered] = dvd1;
			System.out.printf("%d disc have been added: %s\n", qtyOrdered, dvd1.getTitle());
			qtyOrdered++;
			System.out.println("The order is almost full -> Just add 1 disc ");
		}
		else {
			System.out.println("The order is fulled");
		}
	}
	
	
	public DigitalVideoDisc getALuckyItem() {
    	int count = 0;
    	for (int i = 0; i < this.itemOrdered.length; i++) {
			count++;
		}
    	int num = new Random().nextInt(count);
    	System.out.println("The free dvd: " + this.itemOrdered[num].getTitle() + " the Cost: " + this.itemOrdered[num].getCost());
    	this.itemOrdered[num].setCost(0);
    	return this.itemOrdered[num];
    }

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered == 0) {
			System.out.println("Don't have any order");
		}
		else {
			for(int i=0; i<qtyOrdered; i++)
				if(itemOrdered[i] == disc)
					itemOrdered[i] = null;
			System.out.println("The disc "+ disc.getTitle()+ " is deleted");
		}
	}
	
	public float totalCost() {
        float sum = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            sum += itemOrdered[i].getCost();
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
	
	public void printOrder() {
		System.out.println("**************Order*****************");
		System.out.println("Date: " + this.dateOrdered);
		System.out.println("Ordered Items:");
		for(int i=0; i<qtyOrdered; i++)
			System.out.printf("%d. DVD-[%s]-[%s]-[%s]-[%d]: %f$ \n", 
					i+1, itemOrdered[i].getTitle(), itemOrdered[i].getCategory(), itemOrdered[i].getDirector(), 
					itemOrdered[i].getLength(), itemOrdered[i].getCost());
		System.out.printf("Total cost: %f\n\n", this.totalCost());
	}
	

	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}

	public String getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(String dateOrdered) {
		this.dateOrdered = dateOrdered;
	}

	
}
