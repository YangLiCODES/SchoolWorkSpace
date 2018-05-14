import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//Student Yang Li    program moveable
public class MoveablePoint implements Moveable {
	private int x,y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public MoveablePoint(int x , int y){
		this.x=x;
		this.y=y;
	}
	
	public String toString(){
		return "Point at ("+x+","+""+y+")";
	}

	@Override
	public void moveUp() {
		y++;
		
	}

	@Override
	public void moveDown() {
		y--;
		
	}

	@Override
	public void moveRight() {
		x++;
		
	}

	@Override
	public void moveLeft() {
		x--;
		
	}
	
	public boolean equals (Object o){
		if( o instanceof MoveablePoint){
			MoveablePoint o1 = (MoveablePoint) o;
			if(this.getX()==o1.getX()&&this.getY()==o1.getY()){
				return true;
			}
		
		}
		return false;
		
	}
}