package modulo;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot 
{
	static Robot rob= new Robot();
	
	public static void main(String[] args) {
	
	String color =	JOptionPane.showInputDialog("what color do you want. Red, blue or green");
	
		if(color.equals("red")) {
			rob.setPenColor(225,0,0);
		}
		else if(color.equals("blue")) {
			rob.setPenColor(0,0,225);
		}
		else if(color.equals("green")) {
			rob.setPenColor(0,225,0);
		}
		
		
		String shape =JOptionPane.showInputDialog("what shape do you want");
	if(shape.equals("square")) {
	drawSquare();
	}	
	else if(shape.equals("triangle")) {
	drawTriangle();
}
	else if(shape.equals("circle")) {
	drawCircle();
}
	
	
	}
 static void drawSquare(){
	 rob.setSpeed(25);
	 rob.penDown();
	for(int i=0;i<4;i++) {
		
		rob.move(100);
		rob.turn(90);
	}

}
 static void drawTriangle() {
	rob.setSpeed(25);
	rob.penDown();
	for(int i = 0; i<3;i++) {
	rob.turn(120);
	rob.move(90);
		
	}
	}
static void drawCircle() {
	rob.setSpeed(500);
	rob.penDown();
	for(int i =0; i<36; i++) {
	rob.turn(10);
	rob.move(10);
	}
}



}


