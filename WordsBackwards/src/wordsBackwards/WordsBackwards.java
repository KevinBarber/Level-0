//Kevin Barber 2015
package wordsBackwards;

import javax.swing.JOptionPane;

public class WordsBackwards {
	public static void main(String[] args) {
		String wordForwards = JOptionPane
				.showInputDialog("Tell me a word and I will spell it backwards");

		for (int i = wordForwards.length() - 1; i >= 0; i--) {
			System.out.print(wordForwards.charAt(i));
		}

	}
}
