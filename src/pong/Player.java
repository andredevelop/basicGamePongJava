package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Player {
	
	public boolean right, left;
	public int x,y,width,height,speed;
	
	public Player(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = 40;
		this.height = 5;
		this.speed = 2;
	}
	
	public void tick() {
		if(right) {
			x += speed;
		}else if(left) {
			x -= speed;
		}
		
		if(x+width > Game.WIDTH) {
			x = Game.WIDTH - width;
		}else if(x < 0) {
			x = 0;
		}
	}
	
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x,y,width,height);
	}
	
}
