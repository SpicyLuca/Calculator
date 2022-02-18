import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel panel;
	private JLabel cLabel;
	private JButton[] buttons;
	
	public Frame() {
		panel = new JPanel();
		cLabel = new JLabel();
		buttons = new JButton[16];
		
		setVisible(true);
		setBounds(200, 200, 450, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel.setBounds(getBounds());
		cLabel.setText("Insert Number");
		cLabel.setBounds(0, 0, 200, 200);
		panel.add(cLabel);
		add(panel);
		setFocusable(true);
	}
	
	public void paint(Graphics g) {
		g.setColor(new Color(12, 12, 255));
		g.drawRect(200, 200, 450, 500);
	}
}
