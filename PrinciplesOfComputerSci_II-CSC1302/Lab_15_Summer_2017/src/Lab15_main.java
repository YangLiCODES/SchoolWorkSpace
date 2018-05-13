import javax.swing.JFrame;

public class Lab15_main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Lab 15 of Summer 17");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setVisible(true);
	      
	      Lab15_Panel panel = new Lab15_Panel();
	      frame.getContentPane().add(panel);
	      
	      frame.pack();
	     
	      
	      frame.add(panel);
	      frame.validate();
	      frame.repaint();
		
		
	}

}
