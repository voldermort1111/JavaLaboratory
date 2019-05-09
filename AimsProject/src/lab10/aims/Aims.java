package lab10.aims;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import lab10.aims.media.Book;
import lab10.aims.media.CompactDisc;
import lab10.aims.media.DigitalVideoDisc;
import lab10.aims.media.Media;
import lab10.aims.media.Track;

/**
 * Hello world!
 */
public final class Aims {
  private static ArrayList<Order> orders = new ArrayList<Order>();

  private Aims() {
  }

  /**
   * Says hello to the world.
   * 
   * @param args The arguments of the program.
   */
  public static void main(String[] args) {

      /** Exception executed*/

    // Playing dvd
    DigitalVideoDisc dvd = new DigitalVideoDisc("Diem xua", "Trinh Cong Son", "Trinh Cong Son", 12, 12f);

    try {
        dvd.play();
    } catch (PlayerException e) {
        e.printStackTrace();
        e.toString();
        e.getMessage();
    }

    // Compact Disc
    CompactDisc cd = new CompactDisc("Diem xua", "Trinh Cong Son", "Trinh Cong Son", 12f);

    cd.addTrack("Diem Xua 1", -3);
    cd.addTrack("Tuoi nao cho em", 9);

    try {
        cd.play();
    } catch (PlayerException e) {
        e.printStackTrace();
    }

      // Compare
      System.out.println(dvd.compareTo(null));

    // Equals
      System.out.println("Is DVD("+dvd.getTitle()+") equals DVD("+dvd.getTitle()+")? " + dvd.equals(dvd));

      System.out.println(dvd.equals(cd));

  }

  public static void menu() {
    Scanner input = new Scanner(System.in);

    int state = -1;
    while (state != 0) {
      showMenu(state);
      state = input.nextInt();

      switch (state) {
      case 0:
        state = 0;
        break;
      case 1:
        showCreateMenu();
        break;
      case 2:
        showAddItemMenu();
        break;
      case 3:
        showDeleteMenu();
        break;
      case 4:
        showItemListMenu();
        break;
      default:
        break;
      }
    }
    input.close();
  }

  public static void showMenu(int state) {
    if (state > 4) {
      System.out.println("Please choose a number: 0-1-2-3-4");
    }
    System.out.println("\nOrder Management Application: ");
    System.out.println("--------------------------------");
    System.out.println("1. Create new order");
    System.out.println("2. Add item to the order");
    System.out.println("3. Delete item by id");
    System.out.println("4. Display the items list of order");
    System.out.println("0. Exit");
    System.out.println("--------------------------------");
    System.out.println("Please choose a number: 0-1-2-3-4");
  }

  public static void showCreateMenu() {
    showOrderList(orders);
    Scanner input = new Scanner(System.in);
    int state;
    System.out.println("Do you want to create new order: ");
    System.out.println("--------------------------------");
    System.out.println("1. Yes");
    System.out.println("0. No");
    System.out.println("Please choose a number: 0-1");
    while (true) {
      state = input.nextInt();
      if (state == 0)
        break;
      if (state == 1) {
        inputNewOrder(orders);
        break;
      }
    }
  }

  private static void inputNewOrder(ArrayList<Order> orders) {
    Scanner input = new Scanner(System.in);
    System.out.print("Date of Order: ");
    String orderName = input.next();
    Order order = new Order(orderName);
    orders.add(order);

    System.out.println("--------------------------------");
    System.out.println("Created Order: " + " ID:" + order.getID() + " - " + order.getDate());
  }

  public static void showAddItemMenu() {
    Scanner input = new Scanner(System.in);

    System.out.println("Input Order ID:");
    String orderID = input.nextLine();

    int state = -1;

    Order curOrder = availableID(orderID);

    if (curOrder == null) {
      System.out.println("unavailable ID");
      return;
    }

    System.out.println("DVD(1) - CD(2) - Book(3)");
    state = input.nextInt();

    switch (state) {
      case 1:
        input = new Scanner(System.in);
        System.out.print("DVD Title: ");
        String dvdTitle = input.nextLine();
        System.out.print("DVD Category: ");
        String dvdCategory = input.nextLine();
        System.out.print("DVD Director: ");
        String dvdDirector = input.nextLine();
        System.out.print("DVD Length: ");
        int dvdLength = input.nextInt();
        System.out.print("DVD Cost: ");
        float dvdCost = input.nextFloat();
        try {
          curOrder.addMedia(new DigitalVideoDisc(dvdTitle, dvdCategory, dvdDirector, dvdLength, dvdCost));
        } catch (Exception e) {
          System.out.print(e);
        }
        break;
      case 2:
        input = new Scanner(System.in);
        System.out.print("CD Title: ");
        String cdTitle = input.nextLine();
        System.out.print("CD Category: ");
        String cdCategory = input.nextLine();
        System.out.print("CD Artist: ");
        String cdDirector = input.nextLine();
        System.out.print("CD Cost: ");
        float cdCost = input.nextFloat();

        CompactDisc cd = new CompactDisc(cdTitle, cdCategory, cdDirector, cdCost);
        try {
          curOrder.addMedia(cd);
        } catch (Exception e) {
          System.out.print(e);
        }

        System.out.print("CD Tracks number: ");
        float cdTracksnb = input.nextInt();

        for (int i = 0; i < cdTracksnb; i++) {
          input = new Scanner(System.in);
          System.out.print("Track " + (i + 1) + " Title: ");
          String title = input.nextLine();
          System.out.print("Track " + (i + 1) + " Length: ");
          int length = input.nextInt();
          cd.addTrack(title, length);
        }

        break;
      case 3:
        input = new Scanner(System.in);
        System.out.print("Book Title: ");
        String bookTitle = input.nextLine();
        System.out.print("Book Category: ");
        String bookCategory = input.nextLine();
        System.out.print("Book Authors: ");
        String bookAuthor = input.nextLine();
        List<String> authors = Arrays.asList(bookAuthor.split(","));
        System.out.print("Book Cost: ");
        float bookCost = input.nextFloat();
        try {
          curOrder.addMedia(new Book(bookTitle, bookCategory, authors, bookCost));
        } catch (Exception e) {
          System.out.print(e);
        }
        break;
      default:
        break;
    }
  }

  private static Order availableID(String ID) {
    for (Order order: orders) {
      if (order.getID().equals(ID)) return order;
    }
    return null;
  }

  public static void showDeleteMenu() {
    Scanner input = new Scanner(System.in);

    System.out.println("Input Order ID:");
    String orderID = input.nextLine();
    System.out.println("Input media ID to Delete:");
    String mediaID = input.nextLine();

    Order curOrder = availableID(orderID);

    if (curOrder == null) {
      System.out.println("unavailable ID");
      return;
    }

    curOrder.removeMedia(mediaID);
  }

  public static void showItemListMenu() {
    Scanner input = new Scanner(System.in);

    System.out.print("Input Order ID:");
    String orderID = input.nextLine();

    Order curOrder = availableID(orderID);

    if (curOrder == null) {
      System.out.println("unavailable ID");
      return;
    }

    curOrder.getDetail();
  }

  public static void showOrderList(ArrayList<Order> orders) {
    System.out.println("Created Order List");
    System.out.println("--------------------------------");
    orders.forEach(order -> {
      System.out.println("| "+ orders.indexOf(order) + " - ID:" + order.getID()+ " - " + order.getDate() );
    });
  }
}
