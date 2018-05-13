import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawingPanel extends JPanel {
	
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			this.setBackground(Color.CYAN);;
			
			//first figure
			g.setColor(Color.GREEN);
			g.fillRect(0, 0, 100, 100);
			g.setColor(Color.YELLOW);
			g.fillOval(0, 0, 100, 100);
			g.setColor(Color.BLACK);
			g.drawLine(0, 0, 100, 100);
			g.drawLine(0, 100, 100, 100);
			g.drawLine(100, 0, 100, 100);
			g.drawLine(100, 0, 50, 50);
			g.drawLine(0, 100, 50, 50);
			g.drawLine(0, 50, 100, 50);			
			g.drawLine(50, 0, 50, 100);
			g.drawString("", 0, 0);			
			
			//circles
			g.setColor(Color.BLACK);
			g.drawOval(0, 0, 100, 100);	
			g.drawOval(10, 10, 80, 80);	
			g.drawOval(20, 20, 60, 60);
			g.drawOval(30, 30, 40, 40);
			g.drawOval(40, 40, 20, 20);		
		
			//second figure
			g.setColor(Color.GREEN);
			g.fillRect(150, 20, 125, 120);
			//fill circle
			
			for(int j=0;j<120;j+=24){
				for(int i=0;i<125;i+=25){
				g.setColor(Color.YELLOW);
				g.fillOval((150+i), 20+j, 24, 24);
				}
			}
			//black circles
			for(int j=0;j<120;j+=24){
				for(int i=0;i<125;i+=25){
				g.setColor(Color.BLACK);
				g.drawOval((150+i), (20+j), 24, 24);
				}
			}
			
		
		
			//small circle
			for(int j=0;j<10;j+=2){
				for(int k = 0;k<10;k+=2){
					g.setColor(Color.BLACK);
					g.drawOval(150+k, 20+j, 24, 24);
				}
			}
			
			
		
		}
		
		
}