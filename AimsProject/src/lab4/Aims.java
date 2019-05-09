package lab4;

import lab4.DigitalVideoDisc;
import lab4.Order;

public class Aims {
	public static void main(String[] args) {

		Order anOrder = new Order("5-5-2019");
		// Create a new dvd object and set the fields
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory ("Animation");
		dvd1.setCost (19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		// add the dvd to the order
		anOrder.addDigitalVideoDisc(dvd1);
		//
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Harry Potter");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost (35.65f);
		dvd2.setDirector("J. K.Rowling");
		dvd2.setLength(500);
		anOrder.addDigitalVideoDisc(dvd2);
		//
		DigitalVideoDisc [] dvd = new DigitalVideoDisc[3];
		//
	    dvd[0] = new DigitalVideoDisc("Bac Si La");
	    dvd[0].setCategory("Scieence Fiction");
	    dvd[0].setCost(24.15f);
	    dvd[0].setDirector("Doctor Strange");
	    dvd[0].setLength(164);

	    dvd[1] = new DigitalVideoDisc("Nguoi Ban La");
	    dvd[1].setCategory("Animation");
	    dvd[1].setCost(18.99f);
	    dvd[1].setDirector("Iron Man");
	    dvd[1].setLength(90);
	    
	    dvd[2] = new DigitalVideoDisc("Cua So Den");
	    dvd[2].setCategory("Animation");
	    dvd[2].setCost(15.29f);
	    dvd[2].setDirector("Black Window");
	    dvd[2].setLength(34);
	    //
	    anOrder.addDigitalVideoDisc(dvd);
		//
		
		anOrder.getDetail();
	}
}