package lab2;
import javax.swing.JOptionPane;
public class ChoosingOptionProgram {
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
		
		JOptionPane.showMessageDialog(null, "You 've choosen: "+ (option==JOptionPane.YES_OPTION?"Yes": "No"));
		System.exit(0);
	}
}
