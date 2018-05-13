/*Student Name: Yang Li		Progra: Lab 15
Descrition:write a program allows uswer to add name and draw the added names in the center part of the frame.
*/
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import java.util.*;



import java.util.*;

public class Lab15_Panel extends JPanel{
	private JButton AddName;
	private JLabel c;
	JTextField text1;
	ArrayList<String> input = new ArrayList<String>();
	public Lab15_Panel() {

		text1 = new JTextField("      ");
		
		
		AddName = new JButton("Add Name");
		c = new JLabel();
		

		AddName.addActionListener(new ButtonListener());

		add(text1);

		add(AddName);
		add(c);
		
		text1.setLocation(27, 20);
		c.setLocation(500, 500);
		AddName.setLocation(200, 200);
		setPreferredSize(new Dimension(300, 300));
		c.getVerticalAlignment();
		
		c.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		AddName.setLayout(null);
		AddName.setLocation(100, 1000);
		
		//AddName.setLayout(new GridLayout (1,3,200,0));
		
		
		//this.setLayout(new BorderLayout());
		//AddName.setLayout(new FlowLayout(FlowLayout.RIGHT));
		//JButton clickmeButton = new JButton("Add Name");
		//AddName.add(clickmeButton);
		//this.add(AddName, BorderLayout.SOUTH);
	}
	
		private class ButtonListener implements ActionListener {

			public void actionPerformed(ActionEvent event) {
				
				Scanner console= new Scanner(System.in);
				
				
					
				input.add(text1.getText());
					
				
				c.setForeground(Color.RED);
				
				c.setText("\n"+Arrays.toString(input.toArray())+"\n");
				c.validate();
				c.repaint();
			}
		}
}
