package dev.jadez.cheatgame.entities.creatures;

import java.awt.Graphics;
import java.awt.Point;

import dev.jadez.cheatgame.Game;
import dev.jadez.cheatgame.gfx.Assets;

public class Player extends Creature {

	public Game game;

	int move_amount = 3;
	protected float x;
	protected float y;

	public Player(Game game, float x, float y, int width, int height) {
		super(x, y, width, height);
		this.x = x;	//x y has already declared in Entity?
		this.y = y;
		this.game = game;
	}

	public Point getPlayerPosition()
	{
		return new Point((int)x, (int)y);
	}
	
	public void tick() {
		if (game.getKeyManager().up)
			if (y - move_amount >= 0)
				y -= move_amount;
		if (game.getKeyManager().down)
			if (y + move_amount + this.height <= 800)
				y += move_amount;
		if (game.getKeyManager().left)
			if (x - move_amount >= 0)
				x -= move_amount;
		if (game.getKeyManager().right)
			if (x + move_amount + this.width <= 600)
				x += move_amount;

	}

	public void render(Graphics g) {
		g.drawImage(Assets.player, (int) x, (int) y, null);
	}

}
