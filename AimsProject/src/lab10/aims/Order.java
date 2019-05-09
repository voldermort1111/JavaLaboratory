package lab10.aims;

import java.util.ArrayList;
import java.util.Arrays;

import lab10.aims.media.*;

public class Order {

  private String id;
  public static final int MAX_NUMBERS_ORDERED = 10;
  public static final int MAX_LIMITTED_ORDERS = 5;
  public static int nbOrder;
  private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
  private String dateOrdered;

  private static long idCounter = 0;

  Order(String date) {
    dateOrdered = date;
    nbOrder ++;
    id = createID();

    if (nbOrder > MAX_LIMITTED_ORDERS) {
      System.out.println("\nSố lượng gi�? hàng quá giới hạn");
    }
  }

  public static String createID() {
    return String.valueOf(idCounter++);
  }

  public String getDate() {
    return dateOrdered;
  }

  public void getDetail() {
    System.out.println("**********************Order******************");
		System.out.println("Date: " + this.dateOrdered);
		System.out.println("Ordered Items:");
		for (int i=0; i<itemsOrdered.size(); i++) {
      if (itemsOrdered.get(i) instanceof DigitalVideoDisc) {
        DigitalVideoDisc tmp = (DigitalVideoDisc)itemsOrdered.get(i);

        System.out.println((i+1) + ". DVD "+ tmp.getTitle()+ " - " + tmp.getCategory()+ " - "+ 
					tmp.getDirector()+ " - "+ tmp.getLength()+ " : "+ tmp.getCost()+ "$");
      } else if (itemsOrdered.get(i) instanceof Book) {
        Book tmp = (Book)itemsOrdered.get(i);

        System.out.println((i+1) + ". Book "+ tmp.getTitle()+ " - " + tmp.getCategory()+ " - "+ 
					tmp.getAuthors()+ " + "+ tmp.getCost()+ "$");
      } else if (itemsOrdered.get(i) instanceof CompactDisc) {
        CompactDisc tmp = (CompactDisc) itemsOrdered.get(i);

        System.out.println((i+1) + ". CD "+ tmp.getTitle()+ " - " + tmp.getCategory()+ " - "+ 
					tmp.getArtist()+ " + "+ tmp.getCost()+ "$");
      }

			
		}
		System.out.println("Total cost: "+ this.totalCost());
		System.out.println("*****************************************");
  }

  public void addMedia(Media media) {
    if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
      System.out.println("Gi�? hàng đã đầy!");
    } else {
      itemsOrdered.add(media);
    }
  }

  public void addMedia(Media [] medias) {
    if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
      System.out.println("Gi�? hàng đã đầy!");
    } else if (itemsOrdered.size() + medias.length >= MAX_NUMBERS_ORDERED) {
      System.out.println("Danh sách mới QU�? L�?N:");
      for (int i = 0; i<medias.length; i++) {
        System.out.println((i+1) + ": " + itemsOrdered.get(i).getTitle());
      }
    } else {
      ArrayList<Media> tmps = new ArrayList<Media>(Arrays.asList(medias));
      itemsOrdered.addAll(tmps);

      System.out.println("Thêm thành công: ");
      for (int i = 0; i<tmps.size(); i++) {
        System.out.println((i+1) + ": " + tmps.get(i).getTitle());
      }
      System.out.println("\nSố lượng hiện tại: " + itemsOrdered.size());
    }
  }

  public void removeMedia(Media media) {
    itemsOrdered.remove(media);
    System.out.println("Số lượng hiện tại: "+itemsOrdered.size());
  }

  public void removeMedia(String id) {
    for (Media media: itemsOrdered) {
      if (media.getID().equals(id)) itemsOrdered.remove(media);
    }
  }

  public float totalCost() {
    float sum = 0;
    for (int i = 0; i < itemsOrdered.size(); i++) {
      sum += itemsOrdered.get(i).getCost();
    }
    return sum;
  }

  public int getQtyOrdered() {
    return itemsOrdered.size();
  }

  public Media getALuckyItem() {
    int lucky = (int) ((itemsOrdered.size()) * Math.random());
    
    itemsOrdered.get(lucky).setCost(0);

    return itemsOrdered.get(lucky);
  }

  public void setId(String id) {
    this.id = id;
  }

  public ArrayList<Media> getItemsOrdered() {
    return itemsOrdered;
  }

  public String getID() {
    return id;
  }


}