package Coding_Exam_A;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CodingExamA implements draw2 {
	int howMany;
	static Color customColor;
	static int sides;
	public static void main(String[] args) {
		String howManyString = JOptionPane.showInputDialog("how many robots?"); int howMany = Integer.parseInt(howManyString);
		
		String color = JOptionPane.showInputDialog("enter a r value: "); int colorInt = Integer.parseInt(color);
		String color1 = JOptionPane.showInputDialog("enter a r value: ");int colorInt1 = Integer.parseInt(color1);
		String color2 = JOptionPane.showInputDialog("enter a r value: ");int colorInt2 = Integer.parseInt(color2);
		customColor = new Color(colorInt, colorInt1, colorInt2);
		String sidesString = JOptionPane.showInputDialog("how many sides?");  sides = Integer.parseInt(sidesString);
		/*
		 * Write a program that asks the user for three pieces of information.
		 * 1. How many robots
		 * 2. The color of the shapes
		 * 3. How many sides each shape will have
		 * 
		 * Once the information has been collected, the program will then make the requested number of robots
		 * each draw the requested shape in the requested color. The robots should execute at the same time so 
		 * Threads will need to be used. Arrange the robots so that the shapes do not overlap.
		 * For full credit, define the Thread functions using lambdas.
		 * 
		 * See the Coding_Exam_A_Demo.jar for an example of what the finished product should look like.
		 */
		CodingExamA a = new CodingExamA();
		ArrayList<Thread>threads = new ArrayList<Thread>();
		

		for (int i = 0; i < howMany; i++) {
			int hi = 100*i;
			System.out.println(i);
			
			Thread ra = new Thread(()->{
				Robot r = new Robot();
				r.penDown();
				r.moveTo(50, 50);
				
				r.moveTo(hi+100, 100);
				
				r.penDown();
				a.draw(r);
			});
			threads.add(ra);
		}
		for (Thread thread : threads) {
			thread.start();
		}
	
		
			
		
		

	
				}

	@Override
	public void draw(Robot r) {
		r.setSpeed(100);
		System.out.println(customColor);
		r.setPenColor(customColor);
		for (int j = 0; j < sides; j++) {
			r.move(100);r.turn(360/sides);
			
		}
		
	}
			 
		

			
		
			
		}	


	


