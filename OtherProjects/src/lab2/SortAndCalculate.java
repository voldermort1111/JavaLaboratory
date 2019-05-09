package lab2;
import java.util.Scanner;
public class SortAndCalculate {
	private static Scanner keyboard;

	public static void swap(int a, int b) {
		int temp;
		temp =a;
		a=b;
		b=temp;
	}

	public static void main(String args[]) {
		int i, pos;
		double temp, sum = 0;
		keyboard = new Scanner(System.in);
		System.out.println("So phan tu cua mang: ");
		int length = keyboard.nextInt();		
		double[] numeric = new double[length];
		//input
		for(i=0;i<length;i++)
		{
			System.out.println("Nhap phan tu thu " + (i+1)+":");
			numeric[i]= keyboard.nextInt();
		}
		//sort
		for (i=1;i<length;i++) {
			temp = numeric[i];
			pos = i;
			while ((pos>0)&&(numeric[pos-1]>temp)) {
				numeric[pos] = numeric[pos-1];
				pos = pos -1;
			}
			numeric[pos]=temp;		
		}
		//print
		for(i=0;i<length;i++) {
			System.out.println("Phan tu thu "+(i+1)+": "+numeric[i]);
			sum=sum+numeric[i];
		}
		System.out.print("|  ");
		for(i=0;i<length;i++) {

			System.out.print(numeric[i]+"  |  ");
		}
		System.out.println("\nTong cua mang: "+sum);
		System.out.print("Trung binh mang: "+sum/length);
	}
}
