/* Student Name Yang Li			Date:07/10/2017			Program Name:Drawing Panel
Purpose:
The DrawingPanel's size is 400 x 400 pixels and its background color is cyan.
It contains four figures of concentric yellow circles with black outlines, all surrounded by a green
rectangle with a black outline. 
*/
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.lang.*;


public class DrawPanel extends JFrame {
	int p1;
	int p2;
	
	public DrawPanel(int x,int y){
		this.p1=x;
		this.p2=y;
	}
	
	public void Display(){
		this.setBackground(Color.CYAN);
		setTitle("Figure3.33");
		setSize(400,400);
	    setVisible(true);
		
	
	}
	//circle figure properties
	public void paint(Graphics graphic){
		Graphics2D G2D=(Graphics2D)graphic; 
		 DrawSqu(graphic,"top left",0,0,100,5,1,1);
		 DrawSqu(graphic,"bottom left",10,60,24,4,6,6);
		 DrawSqu(graphic,"top right",20,10,40,5,5,5);
		 DrawSqu(graphic,"bottom right",100,10,30,3,4,4);
		
		
	}
	//frame
	public void DrawSqu(Graphics graphic,String S,int v1,int v2, int size,int num, int row,int column){
		int a;
		int b;
		int c;
		
		switch(S){
		case "bottom left":
		v2=getHeight()-(v2+(size*row))-p2;
		break;
		case "top right":
		v1=getWidth()-(v1+(size*column))-p1;
		break;
		case "bottom right":
		v1=getWidth()-(v1+(size*column))-p1;
		v2=getHeight()-(v2+(size*row))-p2;
		break;
		case "top left": 
		default:
			break;
	}
		v1=v1+p1;
		v2=v2+p2;
		
		for(a=0;a<row;a++){
		for(b=0;b<column;b++){
		
			
		int i;
		int k;
	    i=v1+(b*size);
	    k=v2+(a*size);
	    
	    graphic.setColor(Color.GREEN);
		graphic.fillRect(i,k,size,size);
		
		int count=0;
		for(c=num;c>0;c--){
		int sizec=(size/num)*c;
		int sizecc=((size/2)/num)*count;
		
		graphic.setColor(Color.YELLOW);
		graphic.fillOval(i+sizecc,k+sizecc,sizec,sizec);
		
		graphic.setColor(Color.BLACK);
		graphic.drawOval(i+sizecc,k+sizecc,sizec,sizec);
		
		count+=1;
	}
		
		graphic.setColor(Color.BLACK);
		graphic.drawRect(i,k,size,size);
		graphic.setColor(Color.BLACK);
		graphic.drawLine(i,k,i+size,k+size);
		graphic.setColor(Color.BLACK);
		graphic.drawLine(i+size,k,i,k+size);
		}
	}
}
		//print image
		public static void main(String[] args) {
			DrawPanel print = new DrawPanel(10,50);
			
			print.Display();
	
	}
}
