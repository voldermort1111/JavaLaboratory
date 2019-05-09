package lab2;
import java.util.Scanner;

public class Triagle {
    private static Scanner keyboard;

	public static void TriaglePrint(int n) 
    { 
        for (int i=0; i<2*n-1; i=i+2) 
        { 
   
            for (int j=0; j<=(n-i/2-2); j++) 
            { 
                // printing spaces 
                System.out.print("."); 
            } 
   
            for (int k=0; k<=i; k++ ) 
            { 
                System.out.print("*"); 
            } 

            System.out.println(); 
        } 
    } 
      
    // Driver Function 
    public static void main(String args[]) 
    { 	
    	keyboard = new Scanner(System.in);
		System.out.println("Nhap vao n: ");
		int n = keyboard.nextInt();

        TriaglePrint(n); 
    } 

}
