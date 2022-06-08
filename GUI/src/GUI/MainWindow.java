package GUI;

import javax.swing.*;

public class MainWindow {
	
	private JFrame window;
	private JLabel label;
	
	public MainWindow() {
		window = new JFrame();
		window.setTitle("Hello world");
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setSize(600,800);
		window.setLocationRelativeTo(null); //center
		label = new JLabel("Hello world", SwingConstants.CENTER);
		}
	
	public void show() {
		window.getContentPane().add(label);
		window.setVisible(true);
	}
	
}
