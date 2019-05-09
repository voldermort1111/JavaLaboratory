package lab1;
import javax.swing.JOptionPane;
public class CalculateTwoNumbers{
	public static void main(String[] args) {
		String strNum1, strNum2;
		String strSum = "Sum of two doubles is: ";
		String strDiff = "Different of two doubles is: ";
		String strProd = "Product of two doubles is: ";
		String strQuo = "Quotient of two doubles is: ";
		strNum1 = JOptionPane.showInputDialog(null,
				"Please input the first number: ", "Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);
		strNum2 = JOptionPane.showInputDialog(null,
				"Please input the second number: ", "Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		double num2 = Double.parseDouble(strNum2);
		strSum += num1 + num2;
		strDiff += num1-num2;
		strProd += num1*num2;
		strQuo += num1/num2;
		JOptionPane.showMessageDialog(null, strSum,
				"Sum of two doubles", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, strDiff,
				"Different of two doubles", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, strProd,
				"Product of two numbers", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, strQuo,
				"Quotient of two numbers", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}