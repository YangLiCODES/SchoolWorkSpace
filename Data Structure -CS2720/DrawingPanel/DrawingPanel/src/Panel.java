import javax.swing.JFrame;

public class Panel {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("Titile");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DrawingPanel p = new DrawingPanel();
		f.add(p);
		f.setSize(400, 400);
		f.setVisible(true);
	}

}
