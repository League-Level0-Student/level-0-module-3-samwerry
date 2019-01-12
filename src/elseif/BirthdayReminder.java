
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "October 9th";
		String dadsBirthday = "May 12th";
		String myBirthday = "July 5th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String choice = JOptionPane.showInputDialog("Would you like to choose my birthday, my moms"
		+ " birthday, or my dads birthday?");
			
		// 3. Print out what the user typed
		System.out.println(choice);
		// 4. if user asked for "mom"
			//print mom's birthday
		if(choice.equals("moms")) {
			System.out.println(momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		if(choice.equals("dads")) {
			System.out.println(dadsBirthday);
		}
		// 6. if user asked for your name
			// print myBirthday
		if(choice.equals("yours")) {
			System.out.println(myBirthday);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			System.out.println("Sorry, I dont remember that person's birthday!");
		}
	} 
}
