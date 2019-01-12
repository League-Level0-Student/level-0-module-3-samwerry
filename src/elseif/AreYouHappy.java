package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {

		String happy = JOptionPane.showInputDialog("Are you happy");

		if (happy.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you're doing");
		} else {
			String not = JOptionPane.showInputDialog("Do you want to be happy?");

			if (not.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			} else {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
			}
		}

	}

}
