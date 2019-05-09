package lab2;

import javax.swing.JOptionPane;

public class FirstDegreeTwoVariable {
	public static void main(String[] args) {
		String strNum1, strNum2, strNum3, strNum4, strNum5, strNum6;
		Double x,y;
		
		JOptionPane.showMessageDialog(null, "Phuong trinh 1 co dang: a*x + b*y = c\nPhuong trinh 2 co dang: d*x + e*y = f ");
		
		strNum1 = JOptionPane.showInputDialog(null,
				"Nhap vao a: ", "Nhap vao a",
				JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null,
				"Nhap vao b: ", "Nhap vao b",
				JOptionPane.INFORMATION_MESSAGE);
		strNum3 = JOptionPane.showInputDialog(null,
				"Nhap vao c: ", "Nhap vao c",
				JOptionPane.INFORMATION_MESSAGE);
		strNum4 = JOptionPane.showInputDialog(null,
				"Nhap vao d: ", "Nhap vao d",
				JOptionPane.INFORMATION_MESSAGE);
		strNum5 = JOptionPane.showInputDialog(null,
				"Nhap vao e: ", "Nhap vao e",
				JOptionPane.INFORMATION_MESSAGE);
		strNum6 = JOptionPane.showInputDialog(null,
				"Nhap vao f: ", "Nhap vao f",
				JOptionPane.INFORMATION_MESSAGE);
		
		double a = Double.parseDouble(strNum1);
		double b = Double.parseDouble(strNum2);
		double c = Double.parseDouble(strNum3);
		double d = Double.parseDouble(strNum4);
		double e = Double.parseDouble(strNum5);
		double f = Double.parseDouble(strNum6);
		
		JOptionPane.showMessageDialog(null, "Phuong trinh 1: "+a+"x + "+b+" = "+ c + "\nPhuong trinh 2: "+d+"x + "+e+" = "+ f  );
		

		x = (e*c-b*f)/(a*e-b*d);
		y = (c*d-a*f)/(d*b-a*e);

		JOptionPane.showMessageDialog(null,"x = " + x+"\ny = "+y,
				"Gia tri cua x va y ", JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);
	}
}
