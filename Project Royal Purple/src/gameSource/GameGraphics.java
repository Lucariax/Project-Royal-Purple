package gameSource;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class GameGraphics{
	private static JFrame frame;
	private static Graphics g;
	private static KeyListener k;
	private static char keyPressed;
	private KeyEvent e;
	public GameGraphics() {
		frame = new JFrame();
		g = frame.getGraphics();
		frame.setTitle("Pokemon Royal Purple Version");
		frame.setVisible(true);
		frame.setSize(924, 580);
		frame.addKeyListener(k);
	}
	public void keyListen() {
		
	}
	public JFrame getFrame() {
		return frame;
	}
	public Graphics getGraphics() {
		return g;
	}
}
