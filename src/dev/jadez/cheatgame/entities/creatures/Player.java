package dev.jadez.cheatgame.entities.creatures;

import java.awt.Graphics;

import dev.jadez.cheatgame.Game;
import dev.jadez.cheatgame.gfx.Assets;

public class Player extends Creature {

	public Game game;

	int move_amount = 3;
	float x;
	float y;

	public Player(Game game, float x, float y, int width, int height) {
		super(x, y, width, height);
		this.x = x;
		this.y = y;
		this.game = game;
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
