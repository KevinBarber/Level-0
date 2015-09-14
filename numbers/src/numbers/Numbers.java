//Kevin Barber 2015
package numbers;

import javax.swing.JOptionPane;

public class Numbers {
	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("Give me a number.");
		String num1 = JOptionPane.showInputDialog("Give me another number.");
		int numthing = Integer.parseInt(num);
		int numthing2 = Integer.parseInt(num1);
		for (int i = 0; i <= numthing; i += numthing2) {
			System.out.println(i);
		}
	}
}
