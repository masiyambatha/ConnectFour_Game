package Connect4;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class Board4 extends JPanel implements MouseListener {
	int turn=1;
	Squere squeres[][]=new Squere[10][10];
	Board4() {
		for(int i=0;i<squeres.length;i++) {
			for(int j=0;j<squeres.length;j++) {
				squeres[i][j]=new Squere(i,j,60);
			}
		}
		this.addMouseListener(this);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int i=0;i<squeres.length;i++) {
			for(int j=0;j<squeres.length;j++) {
				squeres[i][j].draw(g);
			}
		}
	}
	int isDraw() {
		int count=0;
		 for(int i=0;i<squeres.length;i++) {
				for(int j=0;j<squeres.length;j++) {
					if(squeres[i][j].getPlayer()==0)
						count++;
				}
		 }
		return count;
	}
	boolean isWinHorizontal(int i,int j,int number) {
		try {
		if(squeres[i][j].getPlayer()==number&&squeres[i][j+1].getPlayer()==number&&
				squeres[i][j+2].getPlayer()==number&&squeres[i][j+3].getPlayer()==number)
			return true;
		}catch(Exception ex){
			//JOptionPane.showMessageDialog(null, "wrong");
		}
		try {
		if(squeres[i][j].getPlayer()==number&&squeres[i][j-1].getPlayer()==number&&
				squeres[i][j+1].getPlayer()==number&&squeres[i][j+2].getPlayer()==number)
			return true;
		}catch(Exception ex){
		//JOptionPane.showMessageDialog(null, "wrong");
		}
		try {
		if(squeres[i][j].getPlayer()==number&&squeres[i][j+1].getPlayer()==number&&
				squeres[i][j-1].getPlayer()==number&&squeres[i][j-2].getPlayer()==number)
			return true;
		}catch(Exception ex){
			//JOptionPane.showMessageDialog(null, "wrong");
		}
		try {
		if(squeres[i][j].getPlayer()==number&&squeres[i][j-1].getPlayer()==number&&
				squeres[i][j-2].getPlayer()==number&&squeres[i][j-3].getPlayer()==number)
			return true;
		
		}catch(Exception ex){
			//JOptionPane.showMessageDialog(null, "wrong");
		}
		return false;
	}
	boolean isWinVertical(int i,int j,int number) {
		try {
		if(squeres[i][j].getPlayer()==number&&squeres[i+1][j].getPlayer()==number&&
				squeres[i+2][j].getPlayer()==number&&squeres[i+3][j].getPlayer()==number)
			return true;
		}catch(Exception ex){
		}
		try {
		  if(squeres[i][j].getPlayer()==number&&squeres[i-1][j].getPlayer()==number&&
					squeres[i+1][j].getPlayer()==number&&squeres[i+2][j].getPlayer()==number)
				return true;
		}catch(Exception ex){
		}
		try {
			if(squeres[i][j].getPlayer()==number&&squeres[i-1][j].getPlayer()==number&&
					squeres[i-2][j].getPlayer()==number&&squeres[i+1][j].getPlayer()==number)
				return true;
		}catch(Exception ex){
		}
		try {
			if(squeres[i][j].getPlayer()==number&&squeres[i-1][j].getPlayer()==number&&
					squeres[i-2][j].getPlayer()==number&&squeres[i-3][j].getPlayer()==number)
				return true;
		}catch(Exception ex){
		}
		return false;
	}
	boolean isWinDiagonalInc(int i,int j,int number) {
		try {
		if(squeres[i][j].getPlayer()==number&&squeres[i+1][j+1].getPlayer()==number&&
				squeres[i+2][j+2].getPlayer()==number&&squeres[i+3][j+3].getPlayer()==number)
			return true;
		}catch(Exception ex){
			//JOptionPane.showMessageDialog(null, "wrong");
		}
		try {
			if(squeres[i][j].getPlayer()==number&&squeres[i-1][j-1].getPlayer()==number&&
					squeres[i+2][j+2].getPlayer()==number&&squeres[i+1][j+1].getPlayer()==number)
				return true;
		}catch(Exception ex){
				//JOptionPane.showMessageDialog(null, "wrong");
		}
		try {
			if(squeres[i][j].getPlayer()==number&&squeres[i+1][j+1].getPlayer()==number&&
					squeres[i-1][j-1].getPlayer()==number&&squeres[i-2][j-2].getPlayer()==number)
				return true;
		}catch(Exception ex){
				//JOptionPane.showMessageDialog(null, "wrong");
		}
		try {
		if(squeres[i][j].getPlayer()==number&&squeres[i-1][j-1].getPlayer()==number&&
					squeres[i-2][j-2].getPlayer()==number&&squeres[i-3][j-3].getPlayer()==number)
				return true;
		}catch(Exception ex){
				//JOptionPane.showMessageDialog(null, "wrong");
		}
		return false;
	}
	boolean isWinDiagonalMix(int i,int j,int number) {
		try {
		if(squeres[i][j].getPlayer()==number&&squeres[i+1][j-1].getPlayer()==number&&
				squeres[i+2][j-2].getPlayer()==number&&squeres[i+3][j-3].getPlayer()==number)
			return true;
		}catch(Exception ex){
			//JOptionPane.showMessageDialog(null, "wrong");
		}
		try {
			if(squeres[i][j].getPlayer()==number&&squeres[i+1][j-1].getPlayer()==number&&
					squeres[i+2][j-2].getPlayer()==number&&squeres[i-1][j+1].getPlayer()==number)
				return true;
		}catch(Exception ex){
				//JOptionPane.showMessageDialog(null, "wrong");
		}
		try {
			if(squeres[i][j].getPlayer()==number&&squeres[i+1][j-1].getPlayer()==number&&
					squeres[i-2][j+2].getPlayer()==number&&squeres[i-1][j+1].getPlayer()==number)
				return true;
		}catch(Exception ex){
				//JOptionPane.showMessageDialog(null, "wrong");
		}
		try {
			if(squeres[i][j].getPlayer()==number&&squeres[i-1][j+1].getPlayer()==number&&
					squeres[i-2][j+2].getPlayer()==number&&squeres[i-3][j+3].getPlayer()==number)
				return true;
			}catch(Exception ex){
				//JOptionPane.showMessageDialog(null, "wrong");
			}
			return false;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int row=e.getY()/60;
		int col=e.getX()/60;
		int x=e.getX();
		int y=e.getY();
		int b=0;
		if(squeres[row][col].isSelected(x, y)==true&&row==0&&squeres[row][col].getPlayer()==0) {
				for(int k=9;k>=0;k--) {
					if(squeres[k][col].getPlayer()==0) {
						if(turn==1) {
							squeres[k][col].setPlayer(1);
							turn=2;
							 b=k;
						}else if(turn==2) {
							squeres[k][col].setPlayer(2);
							turn=1;
							b=k;

						}
						break;
					}
				}
		}
		repaint();
		 if(isWinHorizontal(b,col,squeres[b][col].getPlayer())==true) {
			 if(squeres[b][col].getPlayer()==1) {
				 JOptionPane.showMessageDialog(null,"Red player won the game");
				 JOptionPane.showMessageDialog(null,"Sorry player blue try again next time");
				 //System.exit(0);
				 for(int i=0;i<squeres.length;i++) {
						for(int j=0;j<squeres.length;j++) {
							squeres[i][j].setPlayer(0);
						}
				 }
				 repaint();
			 }
			 else if(squeres[b][col].getPlayer()==2) {
				 JOptionPane.showMessageDialog(null,"blue player won the game");
				 JOptionPane.showMessageDialog(null,"Sorry player red try again next time");
				 //System.exit(0);
				 for(int i=0;i<squeres.length;i++) {
						for(int j=0;j<squeres.length;j++) {
							squeres[i][j].setPlayer(0);
						}
				 }
				 repaint();
			 }
		 }
		else if(isWinVertical(b,col,squeres[b][col].getPlayer())==true) {
			 if(squeres[b][col].getPlayer()==1) {
				 JOptionPane.showMessageDialog(null,"Red player won the game");
				 JOptionPane.showMessageDialog(null,"Sorry player blue try again next time");
				 //System.exit(0);
				 for(int i=0;i<squeres.length;i++) {
						for(int j=0;j<squeres.length;j++) {
							squeres[i][j].setPlayer(0);
						}
				 }
				 repaint();
			 }
			 else if(squeres[b][col].getPlayer()==2) {
				 JOptionPane.showMessageDialog(null,"blue player won the game");
				 JOptionPane.showMessageDialog(null,"Sorry player red try again next time");
				 //System.exit(0);
				 for(int i=0;i<squeres.length;i++) {
						for(int j=0;j<squeres.length;j++) {
							squeres[i][j].setPlayer(0);
						}
				 }
				 repaint();
			 }
		 }
		else if(isWinDiagonalInc(b,col,squeres[b][col].getPlayer())==true) {
			 if(squeres[b][col].getPlayer()==1) {
				 JOptionPane.showMessageDialog(null,"Red player won the game");
				 JOptionPane.showMessageDialog(null,"Sorry player blue try again next time");
				// System.exit(0);
				 for(int i=0;i<squeres.length;i++) {
						for(int j=0;j<squeres.length;j++) {
							squeres[i][j].setPlayer(0);
						}
				 }
				 repaint();
			 }
			 else if(squeres[b][col].getPlayer()==2) {
				 JOptionPane.showMessageDialog(null,"blue player won the game");
				 JOptionPane.showMessageDialog(null,"Sorry player red try again next time");
				// System.exit(0);
				 for(int i=0;i<squeres.length;i++) {
						for(int j=0;j<squeres.length;j++) {
							squeres[i][j].setPlayer(0);
						}
				 }
				 repaint();
			 }
		 }
		else if(isWinDiagonalMix(b,col,squeres[b][col].getPlayer())==true) {
			 if(squeres[b][col].getPlayer()==1) {
				 JOptionPane.showMessageDialog(null,"Red player won the game");
				 JOptionPane.showMessageDialog(null,"Sorry player blue try again next time");
				// System.exit(0);
				 for(int i=0;i<squeres.length;i++) {
						for(int j=0;j<squeres.length;j++) {
							squeres[i][j].setPlayer(0);
						}
				 }
				 repaint(); 
			 }
			 else if(squeres[b][col].getPlayer()==2) {
				 JOptionPane.showMessageDialog(null,"blue player won the game");
				 JOptionPane.showMessageDialog(null,"Sorry player red try again next time");
				// System.exit(0);
				 for(int i=0;i<squeres.length;i++) {
						for(int j=0;j<squeres.length;j++) {
							squeres[i][j].setPlayer(0);
						}
				 }
				 repaint();
			 }
		 }
		 if(isDraw()==0) {
			 JOptionPane.showMessageDialog(null,"Draw");
			 for(int i=0;i<squeres.length;i++) {
					for(int j=0;j<squeres.length;j++) {
						squeres[i][j].setPlayer(0);
					}
			 }
			 repaint();
		 } 
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
