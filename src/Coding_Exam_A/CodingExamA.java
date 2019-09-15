package Coding_Exam_A;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CodingExamA implements draw2 {
	int howMany;
	static Color color;
	static int sides;
	public static void main(String[] args) {
		String howManyString = JOptionPane.showInputDialog("how many robots?"); int howMany = Integer.parseInt(howManyString);
		String colorString = JOptionPane.showInputDialog("what color?");  color = Color.getColor(colorString);
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
		System.out.println(howMany);
		for (int i = 1; i < howMany+1; i++) {
			int hi = 100*i;
			Thread ra = new Thread(()->{
				
				Robot r = new Robot();
				r.moveTo(50, 50);
				r.moveTo(hi+100, 100);
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
		r.penDown();
		r.setPenColor(color);
		for (int j = 0; j < sides; j++) {
			r.move(100);r.turn(360/sides);
			
		}
		
	}
			 
		

			
		
			
		}	


	


