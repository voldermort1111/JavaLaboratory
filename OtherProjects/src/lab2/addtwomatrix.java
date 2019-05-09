package lab2;
import java.util.Scanner;

public class addtwomatrix {

	private static Scanner in;

	public static void main(String args[])
	   {
	      int m, n, c, d;
	      in = new Scanner(System.in);
	     
	      System.out.println("Nhap vao so hang va so cot cua 2 ma tran");
	      m = in.nextInt();
	      n  = in.nextInt();
	     
	      int first[][] = new int[m][n];
	      int second[][] = new int[m][n];
	      int sum[][] = new int[m][n];
	     
	      System.out.println("Nhap vao cac phan tu cua ma tran 1");
	     
	      for (c = 0; c < m; c++)
	         for (d = 0; d < n; d++)
	            first[c][d] = in.nextInt();
	           
	      System.out.println("Nhap vao cac phan tu cua ma tran 2");
	     
	      for (c = 0 ; c < m ; c++)
	         for (d = 0 ; d < n ; d++)
	            second[c][d] = in.nextInt();
	           
	      for (c = 0; c < m; c++)
	         for (d = 0; d < n; d++)
	             sum[c][d] = first[c][d] + second[c][d];  
	      System.out.println("Ma tran 1: \n");
	      for (c = 0; c < m; c++)
	      {
	         for (d = 0; d < n; d++)
	            System.out.print(first[c][d]+"\t");
	         
	         System.out.println();
	      }
	      System.out.println("Ma tran 2: \n");
	      for (c = 0; c < m; c++)
	      {
	         for (d = 0; d < n; d++)
	            System.out.print(second[c][d]+"\t");
	         
	         System.out.println();
	      }
	 
	   }
}
