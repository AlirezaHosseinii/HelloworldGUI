package GUI;

import javax.swing.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable(){

			@Override
			public void run() {
				
				MainWindow main = new MainWindow();
				main.show();
				
			}
			
		});
	}

}
