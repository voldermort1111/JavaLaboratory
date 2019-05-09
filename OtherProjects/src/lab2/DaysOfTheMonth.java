package lab2;
import java.util.Scanner;

public class DaysOfTheMonth {
	private static Scanner keyboard;
	public static int day(int a, int b) {
		
		int days = 0;

		switch (b) {
			case 1: days = 31; break;
			case 2: {if (a%4==0) days =29;
						else days=28;
					}		   break;
			case 3: days = 31; break;
			case 4: days = 30; break;
			case 5: days = 31; break;
			case 6: days = 30; break;
			case 7: days = 31; break;
			case 8: days = 31; break;
			case 9: days = 30; break;
			case 10: days = 31; break;
			case 11: days = 30; break;
			case 12: days = 31; break;
		}
		return days;
	}
	public static void main(String args[]) {
		keyboard = new Scanner(System.in);
		System.out.println("Nhap vao Nam: ");
		int Year = keyboard.nextInt();
		System.out.println("How vao Thang (1-12): ");
		int Month = keyboard.nextInt();
		System.out.println("Thang "+Month+" cua nam "+Year+" co "+day(Year, Month)+" ngay!");
		
	}

}
