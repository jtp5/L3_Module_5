package data_structures;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ComedyCentral implements KeyListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	ArrayList jokes = new ArrayList<String>();
	ArrayList punchLines = new ArrayList<String>();
	Random r = new Random();
	
	public static void main(String[] args) {
		ComedyCentral c = new ComedyCentral();
		c.jokes.add("What do you call an aligator detective?");
		c.jokes.add("You can tune a piano...");
		c.jokes.add("What did the police officer say to his bellybutton?");
		c.punchLines.add("An investi-gator!");
		c.punchLines.add("But you can't tune a fish!");
		c.punchLines.add("You're under a vest!");
		c.createUI();
		
	}
	
	public void createUI() {
		
		frame.add(panel);
		panel.add(label);
		frame.addKeyListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			int num = r.nextInt(3);
			label.setText(jokes.get(num) + " " + punchLines.get(num));
			frame.pack();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
