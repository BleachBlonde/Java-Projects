package assignment_4;

import javax.swing.JFrame;

public class Part_4_Driver {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Move Car");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Part_4_Animation());
		frame.pack();
		frame.setVisible(true);

	}

}
