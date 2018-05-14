import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//Student Yang Li    program moveable
public class MoveableCircle extends MoveablePoint {
	private int radius;
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}



	private int centerX;
	private int centerY;
	
	
	
	
	
	public int getCenterY() {
		return centerY;
	}
	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}
	public int getCenterX() {
		return centerX;
	}
	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}
	
	
	
	public MoveableCircle(int x, int y, int r) {
		super(x, y);
		this.centerX=x;
		this.centerY=y;
		this.radius=r;
		
		}
	public double Area(){
		return Math.PI*radius*radius;
		
	}
	public boolean equals (object o){
		if( o instanceof MoveableCircle){
			MoveableCircle o2 = (MoveableCircle) o;
			if(this.getCenterX()==o2.getCenterX()&&this.getCenterY()==o2.getCenterY()){
				return true;
	}
}
		return false;
	}
	public String toString(){
		return "The Center of the Circle is ("+centerX+","+centerY+") "+ "and radius is "+radius+". "+"The Area of the Circle is "+Area();
	}
	
	
	public void moveUp() {
		centerY++;
		
	}

	@Override
	public void moveDown() {
		centerY--;
		
	}

	@Override
	public void moveRight() {
		centerX++;
		
	}

	@Override
	public void moveLeft() {
		centerX--;
		
	}
}
