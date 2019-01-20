package extra;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {

	public static void main(String[] args) {

		
		
		// 1. Create a new Robot
		Robot robot = new Robot();
		

		// 2. Set the speed to 100
		robot.setSpeed(50);
		int colorChoice = JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE,
				JOptionPane.DEFAULT_OPTION, null, new String[] { "Black", "Cyan", "Magenta" }, 0);
		
		if (colorChoice==0){
			robot.setPenColor(Color.BLACK);
		}
		if (colorChoice==1) {
			robot.setPenColor(Color.CYAN);
		}
		
		if (colorChoice==2) {
			robot.setPenColor(Color.MAGENTA);
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
		
		robot.move(47);
		robot.turn(67);
		robot.move(92);
		robot.turn(125);
		robot.move(60);
		robot.turn(62);
		robot.move(225);
		robot.penUp();
		robot.move(127);
		robot.turn(-25);
		robot.penDown();
		
		
	}
		
		}
		
	}

	// 6. Make it so your shapes do not overlap

	// 7. Challenge: add more colors to the Option Dialog.


