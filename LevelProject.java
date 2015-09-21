package levelProject;

import javax.swing.JOptionPane;

public class LevelProject {
	public static void main(String[] args) {
		String options = JOptionPane
				.showInputDialog(" Press 1 to add two numbers. Press 2 to Calculate change. Press 3 to print a message. Press 4 to exit.");
		int stuff = Integer.parseInt(options);
		if (stuff == 1) {
			String num1 = JOptionPane.showInputDialog("Type in a number");
			String num2 = JOptionPane.showInputDialog("tell ye another numba");
			int number = Integer.parseInt(num1);
			int number2 = Integer.parseInt(num2);
			int addition = number + number2;
			JOptionPane.showMessageDialog(null, "This adds up to: " + addition);
		}
		else if (stuff == 2) {
			String price = JOptionPane.showInputDialog("Type in the price");
			String paid = JOptionPane
					.showInputDialog("Type in the amount paid");
			float price1 = Float.parseFloat(price);
			float paid1 = Float.parseFloat(paid);
			float calculation = (float) (paid1 % price1);
			if (price1 > paid1) {
				JOptionPane.showInputDialog("ERROR 404");
			} else {
				JOptionPane.showMessageDialog(null,"Your change: " + calculation);
			}

		}
		else if (stuff == 3) {
			String message =JOptionPane.showInputDialog("Tell me a message and I will repeat it.");
			
			JOptionPane.showMessageDialog(null,message);
			
		}
		else if(stuff>=5){
			JOptionPane.showMessageDialog(null,"ERROR 404");
		}
		else if(stuff<=0){
			JOptionPane.showMessageDialog(null,"ERROR 404");
		}
	}
}
