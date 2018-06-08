package dev.jadez.cheatgame.entities.creatures;

import java.awt.Graphics;
import java.awt.Point;

import dev.jadez.cheatgame.Game;
import dev.jadez.cheatgame.entities.fixedObject.Classroom;
import dev.jadez.cheatgame.gfx.Assets;

public class Player extends Creature {

	public Game game;

	int move_amount = 3;
	protected int x;
	protected int y;
	
	private Classroom classroom;

	public Player(Classroom classroom, Game game, int x, int y, int width, int height) {
		super(x, y, width, height);
		this.x = x;	//x y has already declared in Entity?
		this.y = y;
		this.game = game;
		this.classroom = classroom;
	}

	public Point getPlayerPosition()
	{
		return new Point((int)x, (int)y);
	}
	
	public void tick() {
		if (game.getKeyManager().up)
		{
			if(!checkCollision(x, y - move_amount) && !checkCollision(x + width, y - move_amount))
				if (y - move_amount >= 0)
					y -= move_amount;
		}
		if (game.getKeyManager().down)
		{
			if(!checkCollision(x, y + height + move_amount) && !checkCollision(x + width, y + height + move_amount))
				if (y + move_amount + this.height <= 800)
					y += move_amount;
		}
		if (game.getKeyManager().left)
		{	
			if(!checkCollision(x - move_amount, y) && !checkCollision(x - move_amount, y + height))
				if (x - move_amount >= 0)
					x -= move_amount;
		}
		if (game.getKeyManager().right)
		{
			if(!checkCollision(x + width + move_amount, y) && !checkCollision(x + width + move_amount, y + height))
				if (x + move_amount + this.width <= 600)
					x += move_amount;
		}
	}

	public void render(Graphics g) {
		g.drawImage(Assets.player, (int) x, (int) y, null);
	}
	
	public boolean checkCollision(int x,int y) {
		if(classroom.getDesk().getRange().contains(new Point(x,y))) {
			System.out.println("bang");
			return true;
		}
		else return false;
			
	}

}
