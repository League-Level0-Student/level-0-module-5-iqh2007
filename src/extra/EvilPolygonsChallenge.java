package extra;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {

	public static void main(String[] args) {

		// 1. Create a new Robot
		Robot robot = new Robot();
		

		// 2. Set the speed to 100
		robot.setSpeed(1000);
		int colorChoice = JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE,
				JOptionPane.DEFAULT_OPTION, null, new String[] { "cyan", "red", "green" }, 0);
		
		if (colorChoice==0){
			robot.setPenColor(Color.CYAN);
		}
		if (colorChoice==1) {
			robot.setPenColor(Color.RED);
		}
		
		if (colorChoice==2) {
			robot.setPenColor(Color.green);
		}
		
		
		//robot.setPenColor(Color.CYAN);
		
		// 3. Use if statements to check the the value of colorChoice and set the pen
		// color accordingly

		// 4. Ask the user how many polygons they want to be drawn.
		String number = JOptionPane.showInputDialog("How many polygons do you want to be drawn?");
		int num = Integer.parseInt(number);

		// 5. Use the robot to draw the number of polygons the user requested.
		for (int i=0; i<num; i++) {
		robot.move(100);
		robot.turn(90);
		robot.move(100);
		robot.turn(90);
		robot.move(100);
		robot.turn(90);
		robot.move(100);
		robot.penUp();
		robot.move(20);
		robot.turn(25);
		robot.penDown();
		
		robot.setPenColor(Color.BLACK);
		robot.move(100);
		robot.turn(-90);
		robot.move(100);
		robot.turn(-90);
		robot.move(100);
		robot.turn(-90);
		robot.move(100);
		robot.penUp();
		robot.move(20);
		robot.turn(25);
		robot.penDown();
		
		
		
		}
		
	}

	// 6. Make it so your shapes do not overlap

	// 7. Challenge: add more colors to the Option Dialog.
}

