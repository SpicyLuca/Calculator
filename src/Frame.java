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
	
	
	public Frame() {
		
		setVisible(true);
		setBounds(200, 200, 450, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setFocusable(true);
	}
	
	public void paint(Graphics g) {
		g.setColor(new Color(12, 12, 255));
		g.fillRect(0, 0, 450, 500);
		
		g.setColor(new Color(0, 0, 0));
		g.fillRect(15, 40, 422, 200);
		
		g.setColor(new Color(255, 255, 255));
		g.drawString("Insert Coin", 20, 15);
	}
}
