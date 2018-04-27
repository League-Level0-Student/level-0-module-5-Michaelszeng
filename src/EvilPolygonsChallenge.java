import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		//1. Create a robot
Robot rob = new Robot();
rob.penDown();
		//2. Set the speed to 100
rob.setSpeed(10);
		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Blue", "Green"}, 0);
		if (colorChoice==0) {
			rob.setPenColor(255,0,0);
		}
		if (colorChoice==1) {
			rob.setPenColor(0,255,0);
		}
		if (colorChoice==2) {
			rob.setPenColor(0,0,255);
		}
		//3. Set the pen color of the robot according to the value of the colorChoise variable

		//4. Ask the use how many polygons they want to be drawn.
String plygons = JOptionPane.showInputDialog("How many polygons u want");
int polygons = Integer.parseInt(plygons);
		//5. Use the robot to draw the number of polygons the user requested.
		for (int i=0; i<polygons; i++) {
			for (int j=0; j<4; j++) {
				rob.turn(90);
				rob.move(50);
			}
			rob.turn(10);
			rob.move(25);
		}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

