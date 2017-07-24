package assignment_4;

import javax.swing.JFrame;

public class Part_2_Driver {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Draw Car");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Part_2_Car());
		frame.pack();
		frame.setVisible(true);
	}
}
