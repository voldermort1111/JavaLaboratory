package lab3;

import lab3.DigitalVideoDisc;

public class Aims {
	public static void main(String[] args) {

		Order anOrder = new Order();
		// Create a new dvd object and set the fields
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory ("Animation");
		dvd1.setCost (19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		// add the dvd to the order
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Harry Potter");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost (35.65f);
		dvd2.setDirector("J. K.Rowling");
		dvd2.setLength(500);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Angel And Demon");
		dvd3.setCategory("Science Fiction");
		dvd3.setCost (27.43f);
		dvd3.setDirector("Dan Brown");
		dvd3.setLength(340);
		anOrder.addDigitalVideoDisc(dvd3);	
		
		//
		
		System.out.print ("Total Cost is: ");
		System.out.println (anOrder.totalCost());
	}
}
