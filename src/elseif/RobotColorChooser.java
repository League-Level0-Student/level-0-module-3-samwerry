//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot Sam = new Robot();

		// 3. Ask the user what color they would like the robot to draw
		for(int i =0; i<10; i++) {
		String color = JOptionPane.showInputDialog("What color should the robot draw?");
System.out.println(color);
		// 5. Use an if/else statement to set the pen color that the user requested

	try {	
		if (color.equals("blue")) {
			Sam.setPenColor(0, 0, 200);
		}
		else if (color.equals("green")) {
				Sam.setPenColor(0, 200, 0);

			}
		

		// 6. If the user doesn’t enter anything, choose a random color
		else 	if (color.equals("")) {
			Sam.setRandomPenColor();
		}
	} catch(Exception e) {
		Sam.setPenColor(Color.PINK);
	}
		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them
		
			// 4. Set the pen width to 10
			Sam.setPenWidth(10);
			// 2. Make the robot draw a shape (this will take more than one line of code)
			Sam.penDown();
			Sam.setSpeed(20);
			Sam.move(100);
			Sam.turn(90);
			Sam.move(100);
			Sam.turn(90);
			Sam.move(100);
			Sam.turn(90);
			Sam.move(100);
			Sam.turn(90);
		
		}
	}

}




