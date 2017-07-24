package chapter_05;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class StyleOptionsPanel extends JPanel
{
	private JLabel	saying, fontText;
	private JCheckBox	bold, italic;
	private JTextField fontSize;

	public StyleOptionsPanel()
	{
		saying = new JLabel("Say it with style!");
		saying.setFont(new Font("Helvetica", Font.PLAIN, 60));

		bold = new JCheckBox("Bold");
		bold.setBackground(Color.cyan);
		bold.setPreferredSize(new Dimension(200,200));
		bold.setFont(new Font("Times New Roman", Font.PLAIN, 50));
		
		italic = new JCheckBox("Italic");
		italic.setBackground(Color.cyan);
		italic.setPreferredSize(new Dimension(200, 200));
		italic.setFont(new Font("Times New Roman", Font.PLAIN, 50));

		fontText = new JLabel("Font Size: ");
		fontText.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		fontText.setPreferredSize(new Dimension(225, 50));
		
		fontSize = new JTextField("");
		fontSize.setPreferredSize(new Dimension(175, 50));
		fontSize.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		StyleListener listener = new StyleListener();
		bold.addItemListener(listener);
		italic.addItemListener(listener);
		fontSize.addActionListener(new FontListener());
		

		add(saying);
		add(bold);
		add(italic);
		add(fontText);
		add(fontSize);

		setBackground(Color.cyan);
		setPreferredSize(new Dimension(500, 400));
	}

private class StyleListener implements ItemListener { //Solely for changing the fonts
		public void itemStateChanged(ItemEvent event) {
			int style = Font.PLAIN;
			
			if (bold.isSelected()) {
				style += Font.BOLD;
			}
			if (italic.isSelected()) {
				style += Font.ITALIC;
			}
			saying.setFont(new Font("Times New Roman", style, 55));
		}
	}
private class FontListener implements ActionListener { //This is so you can press enter to go ahead and change size
	@Override
	public void actionPerformed(ActionEvent event) {
		int fontSizer;
		String size = fontSize.getText();
		fontSizer = Integer.parseInt(size);
		if (fontSizer < 50 || fontSizer > 150) {
			saying.setFont(new Font("Times New Roman", Font.PLAIN, 55));
		}
		else {
			saying.setFont(new Font("Times New Roman", Font.PLAIN, fontSizer));
		}
	}
}
}