package lab4;

import lab4.DigitalVideoDisc;


public class Order {
	
	public static final int MAX_NUMBERS_ODERED = 10;
	public static final int MAX_LIMITTED_ORDERS = 5;
	public static int nbOrder = 0;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ODERED];
	
	private int qtyOrdered=0;
	private String dateOrdered;
	
	Order(String date) {
	    dateOrdered = date;
		nbOrder ++;
		if (nbOrder > MAX_LIMITTED_ORDERS) {
		    System.out.println("\nSo luong gio hang qua gioi han!");
		}
	}

	public void getDetail() {
		System.out.println("**********************Order******************");
			System.out.println("Date: "+this.dateOrdered);
			System.out.println("Ordered Items:");
			for (int i=0; i<qtyOrdered; i++) {
				System.out.println((i+1) + ". DVD - "+ itemsOrdered[i].getTitle()+ " - " + itemsOrdered[i].getCategory()+ " - "+ 
					itemsOrdered[i].getDirector()+ " - "+ itemsOrdered[i].getLength()+ " : "+ itemsOrdered[i].getCost()+ "$");
			}
			System.out.println("Total cost: "+ this.totalCost());
			System.out.println("*****************************************");

	  }
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered >= MAX_NUMBERS_ODERED) {
			System.out.println("The order is fulled");
		}
		else {
			itemsOrdered[qtyOrdered]=disc;
			qtyOrdered++;
			System.out.println("Add "+disc.getTitle()+" successful");
		}
		
	}
	//
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		 this.addDigitalVideoDisc(dvd1);
		 this.addDigitalVideoDisc(dvd2);
	}
	
	//
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
	    if (qtyOrdered >= MAX_NUMBERS_ODERED) {
	      System.out.println("The order is fulled");
	    } else if (qtyOrdered + dvdList.length >= MAX_NUMBERS_ODERED) {
	      System.out.println("The new list is too much");
	      for (int i = 0; i<dvdList.length; i++) {
	        System.out.println((i+1) + ": " + itemsOrdered[i].getTitle());
	      }
	    } else {
	      System.arraycopy(dvdList, 0, itemsOrdered, qtyOrdered, dvdList.length);
	      qtyOrdered = qtyOrdered + dvdList.length;
	  
	      for (int a=0; a<dvdList.length;a++) {
	    		  System.out.println("Add "+dvdList[a].getTitle()+" succesfull");
	      }
	      for (int i = 0; i<qtyOrdered; i++) {
	        System.out.println((i+1) + ": " + itemsOrdered[i].getTitle());
	      }
	      System.out.println("\nNumber: " + qtyOrdered);
	    }
	  }
	//
	public String getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(String dateOrdered) {
		this.dateOrdered = dateOrdered;
	}

	//
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered == 0) {
			System.out.println("Don't have any order");
		}
		else {
			for(int i=0; i<qtyOrdered;i++ ) {
				if(itemsOrdered[i] == disc)
					itemsOrdered[i] = null;
			}
			System.out.println("The disc "+ disc.getTitle()+ " is deleted");
		}
	}
	//
	public float totalCost() {
        float sum = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }	
	//
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
}
