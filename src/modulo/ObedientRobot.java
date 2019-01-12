package modulo;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot 
{
	static Robot rob= new Robot();
	
	public static void main(String[] args) {
	String shape =JOptionPane.showInputDialog("what shape do you want");
	if(shape.equals("square")) {
	drawSquare();
	}	
if(shape.equals("triangle")) {
	drawTriangle();
}
if(shape.equals("circle")) {
	drawCircle();
}
	
	
	}
 static void drawSquare(){
	 rob.setSpeed(25);
	 rob.penDown();
	for(int i=0;i<5;i++) {
		
		rob.move(100);
		rob.turn(90);
	}

}
 static void drawTriangle() {
	rob.setSpeed(25);
	rob.penDown();
	for(int i = 0; i<4;i++) {
	rob.turn(90);
	rob.move(90);
		
	}
	}
static void drawCircle() {
	rob.setSpeed(100);
	rob.penDown();
	for(int i =0; i<10000; i++) {
	rob.turn(1);
	rob.move(1);
	}
}



}


