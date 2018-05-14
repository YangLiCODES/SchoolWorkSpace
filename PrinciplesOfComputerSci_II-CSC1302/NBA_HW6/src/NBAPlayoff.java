import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;


public class NBAPlayoff extends JFrame {
public static void main (String[] args) {
		
		NBAPlayoff frame = new NBAPlayoff();
		  
	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     frame.setLocationRelativeTo(null);
	     frame.setSize(800, 400);	       
	     frame.setVisible(true);
	}
	ArrayList<String> list= new ArrayList<String>();
	private JTextField txtName;
	private JTextField txtAge;
	private  NBATeam spurs;
	private NBAcourtPanel court;
	private JLabel lMax, lMin, lAvg, lNum;
		
	public NBAPlayoff(){
	     spurs=new NBATeam("Spurs");
	     court=new NBAcourtPanel(spurs);
	     add(court, BorderLayout.CENTER);
	     
	     JLabel lMax0=new JLabel("Max Age:");
	     lMax=new JLabel("");
	     JLabel lMin0=new JLabel("Min Age:");
	     lMin=new JLabel("");
	     JLabel lAvg0=new JLabel("Average Age:");
	     lAvg=new JLabel("");
	     JLabel lNum0=new JLabel("Number of Players:");
	     lNum =new JLabel("");
	     JPanel rp=new JPanel(new GridLayout(8, 1)); //right panel
	     rp.add(lNum0);rp.add(lNum);rp.add(lMax0);rp.add(lMax);
	     rp.add(lMin0);rp.add(lMin);rp.add(lAvg0);rp.add(lAvg);
	     add(rp, BorderLayout.EAST);
	     		
	     JLabel l1=new JLabel("Player Name:");
	     txtName= new JTextField(); 
	     txtName.setPreferredSize(new Dimension(120,24));
	     JLabel l2=new JLabel("Player Age:");
	     txtAge= new JTextField(); 
	     txtAge.setPreferredSize(new Dimension(120,24));
	     
	     JButton jbtAdd=new JButton("Add A Player");
	     jbtAdd.addActionListener(new ActionListener() {
	    	  public void actionPerformed(ActionEvent e) {
	    		  int age=Integer.parseInt(txtAge.getText());
	    		  spurs.addAPlayer(txtName.getText(), age);
	    		  lMax.setText(spurs.getMaxAge()+"");
	    		  lMin.setText(spurs.getMaxAge()+"");
	    		  lAvg.setText(spurs.getMaxAge()+"");
	    		  lNum.setText(spurs.getNumOfPlayer()+"");
	    		  
	    		  court.repaint();
	    	  }}); 
	     
	     JButton jbtClear= new JButton("Clear");
	     jbtClear.addActionListener(new ActionListener() {
	    	  public void actionPerformed(ActionEvent e) {
	    		  txtName.setText("");
	    		  txtAge.setText("");
	    	  }}); 
	     
	     JPanel pBot=new JPanel();
	     pBot.add(l1); pBot.add(txtName); pBot.add(l2);pBot.add(txtAge); pBot.add(jbtAdd);pBot.add(jbtClear);
	     add(pBot, BorderLayout.SOUTH);


	}
    class NBAcourtPanel extends JPanel{
        public NBAcourtPanel(NBATeam spurs) {
			// TODO Auto-generated constructor stub
		}

		public void paintComponent( Graphics  court){
            super.paintComponent(court);
            court.setColor(Color.ORANGE);
            court.fillRect(50,20,640,340);
            court.setColor(Color.RED);
            court.fillOval(250,60,200,200);
            court.setColor(Color.WHITE);
            court.drawLine(350,10,350,340);
            court.drawOval(520,35,270,250);
            court.drawOval(-100,35,270,250);
             
            court.setColor(Color.BLACK);
            for (int i = 0; i < list.size(); i++)
            	court.drawString(list.get(i), 40, 20+i*20); 
           
         }
    }
    private class MyListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            list.add(txtName.getText());
           
            court.repaint();
        }

	



}
}
