package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Enemy {
	public boolean right, left;
	public double x,y;
	public int width,height;
	
	public Enemy(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = 40;
		this.height = 5;
	
	}
	
	public void tick() {
		x+= (Game.ball.x - x - 6) * 0.07;
		if(right) {
			x += 0.07;
		}else if(left) {
			x -= 0.07;
		}
		
		if(x+width > Game.WIDTH) {
			x = Game.WIDTH - width;
		}else if(x < 0) {
			x = 0;
		}
	}
	
	public void rernder(Graphics g) {
		g.setColor(Color.orange);
		g.fillRect((int)x,(int)y,width,height);
	}
}
