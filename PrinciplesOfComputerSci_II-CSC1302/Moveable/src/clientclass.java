import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
// Student Yang Li    program moveable
public class clientclass {

	public static void main(String[] args) {

		Moveable m1= new MoveablePoint(5,5);
		
		System.out.println(m1);
		
		m1.moveDown();
		System.out.println(m1);
		Moveable m3= new MoveablePoint(5,4);
		System.out.println(m3.equals(m1));
		
		
		Moveable m2= new MoveableCircle(5,5, 3);
		
		m2.moveDown();
		System.out.println(m2);
		System.out.println(m2.equals(m1));
		
		
	}

}
