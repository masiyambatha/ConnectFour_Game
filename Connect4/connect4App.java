package Connect4;

import java.awt.Component;

import javax.swing.JFrame;

public class connect4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame s=new JFrame("Vezokuhle-Connect 4 Game");
		s.setSize(622,642);
		s.setVisible(true);
		s.add(new Board4());
	}
}
