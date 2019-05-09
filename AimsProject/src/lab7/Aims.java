package lab7;

import javax.swing.JOptionPane;

import lab7.media.Book;
import lab7.media.CompactDisc;
import lab7.media.DigitalVideoDisc;
import lab7.media.Media;
import lab7.media.Track;
import lab7.order.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.*;

public class Aims {
	private static Scanner input;
	private String idItem;


	public static void showMenu() {
		ArrayList<Order> listOrder = new ArrayList<Order>();
		input = new Scanner(System.in);
		int a=5;
		do {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
		a = input.nextInt();
		if(a<0 || a>4 ) {
			System.out.println("Nhập sai xin m�?i nhập lại");
			a = input.nextInt();
		}
		
		//System.out.println(a);
		switch (a) {
		case 0:
			System.out.println("Good bye !");
			break;
		case 1:
			create(listOrder);
			break;
		case 2:
			add(listOrder);
			break;
		case 3:
			del(listOrder);
			break;
		case 4:
			showOder(listOrder);
			break;
		default:
			break;
		}
		}while(a!=0);
		
	}
	public static void create(ArrayList<Order> listOrder) {
		Order ord = new Order();
		System.out.println("Create ID Order");
		String id=input.next();
		if(checkIdOrder(listOrder, id)==false) {
		ord.setId(id);
		listOrder.add(ord);
		}else
			System.out.println("ID already exists");
		
		
	}
	
	public static boolean search(Order order, String id) {
		int a=0;
		for (int i = 0; i < order.getItemOrdered().size(); i++) {
			if(order.getItemOrdered().get(i).getId().equals(id)) {
				a++;
			}
			
		}
		if(a>0) {
			System.out.println("ID is:  ");
			return false;
		}
		else {
		System.out.println("ID found! ");
		return true;
		}
		
	}
	
	public static void addDVD(Order order) {
		DigitalVideoDisc dvd = new DigitalVideoDisc();
		System.out.println("DVD");
		System.out.println("ID of DVD: ");
		String id = input.next();
		while(search(order,id)==false) {
			 id= input.next();
		}
		dvd.setId(id);
		System.out.println("Title of DVD: ");
		input.nextLine();                                 			
		dvd.setTitle(String.valueOf(input.nextLine()));
		System.out.println("Category of DVD: ");
		dvd.setCategory(input.nextLine());
		System.out.println("Cost of DVD: ");
		dvd.setCost(input.nextFloat());
		System.out.println("Director of DVD: ");
		input.nextLine();                                 					// nhận kí tự Enter trước đó do khi nhập vào là số thì còn thừa kí tự Enter
		dvd.setDirector(input.nextLine());
		System.out.println("Length of DVD: ");
		dvd.setLength(input.nextInt());
		input.nextLine();                                 					// nhận kí tự Enter trước đó do khi nhập vào là số thì còn thừa kí tự Enter
		order.addMedia(dvd);
		
		System.out.println("This DVD has been added to the Order!");
		System.out.println("Do you want to play this DVD ?");
		int luachon=JOptionPane.showOptionDialog(null, "Do you want to play this DVD ?", "Play DVD", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
		if (luachon==JOptionPane.OK_OPTION) {
			System.out.println("Playing DVD...");
			dvd.play();
			
		}
		
		
		
		
	}
	
	
	public static void addCD(Order order) {
		int numTrack=0;
		
		CompactDisc cd = new CompactDisc();
		System.out.println("Order CD");
		System.out.println("ID of CD:");
		String id = input.next();
		while(search(order,id)==false) {
			 id= input.next();
		}
		cd.setId(id);
		System.out.println("Director of CD: ");
		input.nextLine();                                 					// nhận kí tự Enter trước đó do khi nhập vào là số thì còn thừa kí tự Enter
		cd.setArtist(String.valueOf(input.nextLine()));
		System.out.println("Number of track: ");
		numTrack=input.nextInt();
		for (int i = 0; i < numTrack; i++) {
			Track newTrack = new Track();
			System.out.println("Track " +(i+1));
			System.out.println("Title: ");
			input.nextLine();                                 					// nhận kí tự Enter trước đó do khi nhập vào là số thì còn thừa kí tự Enter
			newTrack.setTitle(input.nextLine());
			System.out.println("Length: ");
			newTrack.setLength(input.nextInt());
			cd.addTrack(newTrack);
		}
		order.addMedia(cd);
		System.out.println("This CD has been added to the Order");
		System.out.println("Do you want to play CD ?");
		int luachon=JOptionPane.showOptionDialog(null, "Do you want to play CD ?", "Play CD", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
		if (luachon==JOptionPane.OK_OPTION) {
			System.out.println("Playing CD...");
			cd.play();
		}
	}
	
	
	
	public static void addBook(Order order) {
		Book book=new Book();
		System.out.println("Order Book");
		System.out.println("ID of Book: ");
		String id = input.next();
		while(search(order,id)==false) {
			 id= input.next();
		}
		book.setId(id);
		System.out.println("Title: ");
		input.nextLine();                                 					// nhận kí tự Enter trước đó do khi nhập vào là số thì còn thừa kí tự Enter
		book.setTitle(input.nextLine());
		System.out.println("Category: ");
		book.setCategory(input.nextLine());
		System.out.println("Cost: ");
		book.setCost(input.nextFloat());
		input.nextLine();
		System.out.println("Insert the authors separated by a - ");
		String[] word = input.nextLine().split("-");
		
		List<String> authors = new ArrayList<>();
		for (int i = 0; i < word.length; i++) {
			authors.add(word[i]) ;
		}
		book.setAuthors(authors);
		order.addMedia(book);
		
		
		
	}
	
	public static void add(ArrayList<Order> listOrder) {
		System.out.println("ID Order: ");
		String id=input.next();
		int a=0;
	
		
		for (int i = 0; i < listOrder.size(); i++) {
			if(listOrder.get(i).getId().equals(id)) {
				a++;
				System.out.println("Book or DVD or CD");
				
				
				
				//String luachon=input.next();
				int iLuachon;
				Object stringArray[] = {"Book","DVD","CD" };
				iLuachon = JOptionPane.showOptionDialog(null,
		                "Book or DVD or CD", "Tùy ch�?n",
		                JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,stringArray,
		                null
		                );
				switch(iLuachon) {
				case 0:
					addBook(listOrder.get(i));
					break;
				case 1 :
					addDVD(listOrder.get(i));
					break;
				case 2:
					addCD(listOrder.get(i));
					break;
				}
			}
			
		}
		if(a==0)
			System.out.println("ID Order cannot be found");
		
		
	}
	public static boolean checkIdOrder(ArrayList<Order> listOrder,String id) {
		int a=0;
		for (int i = 0; i < listOrder.size(); i++) {
			if(listOrder.get(i).getId().equals(id)) {
				a++;
				}
			
		}
		if(a==0)
			return false;		// không có Order trùng id
		else
			return true;		// có Order trùng id
	}
	public static void del(ArrayList<Order> listOrder) {
		System.out.println("ID Order: ");
		String id=input.next();
		int a=0;
		for (int i = 0; i < listOrder.size(); i++) {
			if(listOrder.get(i).getId().equals(id)) {
				a++;
				Order order = listOrder.get(i);
				System.out.println("ID Item: ");
				String idItem = input.next();
				int b=0;
				for (int j = 0; j < order.getItemOrdered().size() ; j++) {
					if	(order.getItemOrdered().get(j).equals(idItem)) {
						order.getItemOrdered().remove(j);
						b++;
					}
					
				}
				if(b==0)
					System.out.println("ID Item cannot be found");
				
				
				}
			
			}
		if(a==0)
			System.out.println("Order cannot be found!");
				
		
	}
	
	public static void showOder(ArrayList<Order> listOrder) {
		System.out.println("ID Order: ");
		String id=input.next();
		
		for (int i = 0; i < listOrder.size(); i++) {
			if(listOrder.get(i).getId().equals(id)) {
				Order order = listOrder.get(i);
				for (int j = 0; j < order.getItemOrdered().size(); j++) {
				  order.getDetail();
				}	
			}
		}
			
	}


	public static void main(String[] args) {
    
    Thread d = new Thread(new MemoryDaemon(), "Cuc xi lau ong be lap");
    d.setDaemon(true);
    d.start();
		showMenu();
		
	}

}
