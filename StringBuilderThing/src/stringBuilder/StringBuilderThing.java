//Kevin Barber 2015

package stringBuilder;

import javax.swing.JOptionPane;

public class StringBuilderThing {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to the character test.");
		String word = JOptionPane.showInputDialog("Type a word");
		String placement = JOptionPane
				.showInputDialog("Tell me what character number you want to change.");
		String char1 = JOptionPane
				.showInputDialog("Type what single character you want to change the original character to.");
		int placement1 = Integer.parseInt(placement);
		StringBuilder sb = new StringBuilder(word);
		sb.setCharAt(placement1, char1.charAt(0));
		System.out.println(sb.toString());

	}

}
