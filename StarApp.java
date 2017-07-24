package assignment_2;
import javax.swing.JFrame;

public class StarApp
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("NightSky");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new StarPanel());

		frame.pack();
		frame.setVisible(true);
	}
}