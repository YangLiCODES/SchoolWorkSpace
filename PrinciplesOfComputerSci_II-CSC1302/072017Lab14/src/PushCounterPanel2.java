//Student Name: Yang Li	&Zijun Chai		Program PushCounter
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import java.util.*;

public class PushCounterPanel2 extends JPanel{


	private JButton push;
	private JLabel label;
	JTextField no1;
	JTextField no2;
	JTextField no3;

	// -----------------------------------------------------------------
	// Constructor: Sets up the GUI.
	// -----------------------------------------------------------------
	public PushCounterPanel2() {

		 no1 = new JTextField("      ");

		 no2 = new JTextField("      ");

		 no3 = new JTextField("      ");

		push = new JButton("Sort");
		label = new JLabel();
		push.addActionListener(new ButtonListener());
		add(no1);
		add(no2);
		add(no3);
		
		add(push);
		add(label);

		setBackground(Color.cyan);
		setPreferredSize(new Dimension(300, 100));

	}

	// *****************************************************************
	// Represents a listener for button push (action) events.
	// *****************************************************************
	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			String s = no1.getText();
			String s11 = s.trim();
			String s2 = no2.getText();
			String s22 = s2.trim();
			String s3 = no3.getText();
			String s33 = s3.trim();
			int a = Integer.parseInt(s11);
			int b = Integer.parseInt(s22);
			int c = Integer.parseInt(s33);
			
			int []arr={a,b,c};			
			
			Arrays.sort(arr);	
			
			
			
			label.setText("Sort: " + Arrays.toString(arr));
		
		}
	}
}
