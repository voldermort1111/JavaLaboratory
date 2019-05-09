package lab4.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateUtils {
	public static void Compare(MyDate date1, MyDate date2) {
		 if(date1.getYear() > date2.getYear()) {
			 System.out.println("date1 > date2");
			 } else if(date1.getYear() < date2.getYear()){
				 System.out.println("date1 < date2");
			 } else if(date1.getMonth() > date2.getMonth()) {
				 System.out.println("date1 > date2"); 
			 } else if(date1.getMonth() < date2.getMonth()) {
				 System.out.println("date1 < date2");
			 } else if(date1.getDay() > date2.getDay()) {
				 System.out.println("date1 > date2");
			 } else if(date1.getDay() < date2.getDay()) {
				 System.out.println("date1 < date2");
			 } else {
				 System.out.println("date1 = date2");
			 }
	}

	public static void Sort(MyDate[] dateList) throws ParseException {
		MyDate temp=null;
		for(int i=0;i< dateList.length-1;i++) {
			for(int j=i+1;j<dateList.length;j++) {
				Date date1= new SimpleDateFormat("dd/MM/yyyy").parse(dateList[i].getDate());
				Date date2= new SimpleDateFormat("dd/MM/yyyy").parse(dateList[j].getDate());
				if(date1.compareTo(date2) < 0) {
					temp = dateList[i];
					dateList[i]=dateList[j];
					dateList[j]=temp;
				}
			}
		}
		
		for( MyDate date:dateList) {
			System.out.println(date.getDate());
		}
		
	}
	
}