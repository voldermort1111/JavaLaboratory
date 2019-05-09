package lab2;
import javax.swing.JOptionPane;
public class SecondDegreeOneVariable {
	public static void main(String[] args) {
		String strNum1, strNum2, strNum3;
		Double delta;
		
		JOptionPane.showMessageDialog(null, "Phuong trinh co dang: a*x^2 + b*x = c ");
		
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
		double b = Double.parseDouble(strNum2);
		double c = Double.parseDouble(strNum3);
		delta = b*b-4*a*c;
		double can = Math.sqrt(delta);
		JOptionPane.showMessageDialog(null, "Phuong trinh: "+a+"*x^2 + "+b+"*x = "+ c  );
		
		if (delta < 0){
			JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem","Gia tri cua x", JOptionPane.INFORMATION_MESSAGE);
		}
		if (delta == 0){
			JOptionPane.showMessageDialog(null, "Phuong trinh co 1 nghiem: x= "+(-b/2/a), "Gia tri cua x", JOptionPane.INFORMATION_MESSAGE);
		}
		if (delta>0) {

		JOptionPane.showMessageDialog(null,"Phuong trinh co 2 nghiem: x=" + (-b-can)/(2*a)+"/n x="+ (-b+can)/(2*a),
				"Gia tri cua x la: ", JOptionPane.INFORMATION_MESSAGE);
		}
		System.exit(0);
	}
}
