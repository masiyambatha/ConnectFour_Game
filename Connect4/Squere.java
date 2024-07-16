
package Connect4;

import java.awt.Color;
import java.awt.Graphics;

public class Squere {
	int x,y,size,player=0;
	Squere(int row,int col,int size){
		x=col*size;
		y=row*size;
		this.size=size;
	}
	public void draw(Graphics g) {
		g.drawRect(x, y, size, size);
		if(player==1) {
			g.setColor(Color.red);
			g.fillOval(x, y, size, size);
		}
		else if(player==2) {
			g.setColor(Color.blue);
			g.fillOval(x, y, size, size);
		}
	}
	
	boolean isSelected(int x,int y) {
		try {
		if(x>this.x&&x<this.x+size&&y>this.y&&y<this.y+size)
			return true;
		else
			return false;
		}
		catch(Exception ev) {
			
		}
		return false;
	}
	int getPlayer() {
		return player;
	}
	void setPlayer(int player) {
		this.player = player;
	}
	
}
