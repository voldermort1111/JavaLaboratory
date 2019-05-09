package lab5;

import lab5.aims.disc.DigitalVideoDisc;
import lab5.aims.order.Order;

public class DiskTest {
	public static void main(String[] args) {
		Order anOrder = new Order("3/3/2019");
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
	
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
	
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Naruto");
		dvd4.setCategory("Animation");
		dvd4.setCost(21.99f);
		dvd4.setDirector("jack Musker");
		dvd4.setLength(60);
		
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Harry Potter");
		dvd5.setCategory("Action");
		dvd5.setCost(25.99f);
		dvd5.setDirector("Mical jaker");
		dvd5.setLength(120);
		
		System.out.println(dvd1.search("The Lion King"));
		System.out.println(dvd1.search("King king"));
		System.out.println(dvd1.search("Lion The King"));
		
		DigitalVideoDisc []dvdList = {dvd1, dvd2, dvd3};
		
		anOrder.addDigitalVideoDisc(dvdList);
		anOrder.getALuckyItem();
		anOrder.printOrder();
		
	}
}