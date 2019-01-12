package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {

		
		String sign = JOptionPane.showInputDialog("what's your zodiac sign?");
		
		if (sign.contentEquals("ares")){
			JOptionPane.showMessageDialog(null, "You're courageous"
					+ " energetic, willful, commanding,leading."
					+ "Often leads when follwing would be best course of action" );
		}
		else if( sign.equals("taurus")) {
			JOptionPane.showMessageDialog(null, "You're pleasure seeking, loves controll"
					+ "dependable, grounded, provokes slowly, and highly sensual in nature");
		}
		else if(sign.equals("gemini")) {
			JOptionPane.showMessageDialog(null, "You're Cerebral, chatty, loves learning and education,"
					+ " charming, and adventurous.");
		}
		else if(sign.equals("cancer")) {
			JOptionPane.showMessageDialog(null, "You're Emotional, group oriented, seeks security, family.");
					
		}
		else if(sign.equals("leo")) {
			JOptionPane.showMessageDialog(null, "You're Generous, organized, protective, beautiful.");
		}
		else if (sign.equals("virgo")) {
			JOptionPane.showMessageDialog(null, "You're Particular, logical, practical, sense of duty, critical.");
		}
		else if(sign.equals("libra")) {
			JOptionPane.showMessageDialog(null, " You're Balanced, seeks beauty, sense of justice.");
		}
		else if(sign.equals("scorpio")) {
			JOptionPane.showMessageDialog(null, "You're Passionate, exacting, loves extremes, combative, reflective.");
		}
		else if(sign.equals("sagittarius")) {
			JOptionPane.showMessageDialog(null, "You're Happy, absent minded, creative, adventurous.");
		}
		else if(sign.equals("capricorn")) {
			JOptionPane.showMessageDialog(null, "You're Timeless, driven, calculating, ambitious.");
		}
		else if(sign.equals("aquarius")) {
			JOptionPane.showMessageDialog(null, "You're Forward thinking, communicative, people oriented,"
					+ "stubborn, generous, and dedicated.");
		}
		else if(sign.equals("pisces")) {
			JOptionPane.showMessageDialog(null, "You're Likeable, energetic, passionate, sensitive.");
		}
		else {
			JOptionPane.showMessageDialog(null, "that's not a zodiac sign!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
