package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
System.out.println("Hello World!");
Robot eva = new Robot ();
eva.penDown();
eva.setPenColor(111,13, 23);
eva.setSpeed(1000);
eva.move(200);
eva.turn(90);
eva.move(200);
eva.turn(90);
eva.move(200);
eva.turn(90);
eva.move(200);
eva.turn(90);
eva.move(200);
eva.turn(90);
eva.penUp();

}
}