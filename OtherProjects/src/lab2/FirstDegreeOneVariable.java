package lab2;
import javax.swing.JOptionPane;
public class FirstDegreeOneVariable{
	public static void main(String[] args) {
		String strNum1, strNum2, strNum3;
		Double x;
		
		JOptionPane.showMessageDialog(null, "Phuong trinh co dang: ax + b = c ");
		
		strNum1 = JOptionPane.showInputDialog(null,
				"Nhap vao a: ", "Nhap vao a",
				JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null,
				"Nhap vao b: ", "Nhap vao b",
				JOptionPane.INFORMATION_MESSAGE);
		strNum3 = JOptionPane.showInputDialog(null,
				"Nhap vao c: ", "Nhap vao c",
				JOptionPane.INFORMATION_MESSAGE);
		
		double a = Double.parseDouble(strNum1);
		double b = Double.parseDouble(strNum3);
		double c = Double.parseDouble(strNum2);
		
		JOptionPane.showMessageDialog(null, "Phuong trinh: "+a+"x + "+b+" = "+ c  );
		

		x = (c-b)/a;

		JOptionPane.showMessageDialog(null,"x = " + x,
				"Gia tri cua x la: ", JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);
	}
}
