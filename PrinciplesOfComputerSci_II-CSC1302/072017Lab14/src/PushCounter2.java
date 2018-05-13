//Student Name: Yang Li	&Zijun Chai		Program PushCounter
import javax.swing.JFrame;

public class PushCounter2 {


	   //-----------------------------------------------------------------
	   //  Creates and displays the main program frame.
	   //-----------------------------------------------------------------
	   public static void main(String[] args)
	   {
	      JFrame frame = new JFrame("Push Counter");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	      PushCounterPanel2 panel = new PushCounterPanel2();
	      frame.getContentPane().add(panel);
	 
	      frame.pack();
	      frame.setVisible(true);
	   }
	}
	 
