package lab3;
import lab3.DigitalVideoDisc;

public class Order {
	
	public static final int MAX_NUMBERS_ODERED = 10;
	
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ODERED];
	
	private int qtyOrdered=0;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered >= MAX_NUMBERS_ODERED) {
			System.out.println("The order is fulled");
		}
		else {
			itemsOrdered[qtyOrdered]=disc;
			qtyOrdered++;
			System.out.println("Add "+disc.getTitle()+" succesfull");
		}
		
	//
	}
	
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
