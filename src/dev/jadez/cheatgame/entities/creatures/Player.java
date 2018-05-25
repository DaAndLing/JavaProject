package dev.jadez.cheatgame.entities.creatures;

import java.awt.Graphics;

import dev.jadez.cheatgame.Game;
import dev.jadez.cheatgame.gfx.Assets;

public class Player extends Creature{

	public Game game;
	
	public Player(Game game, float x, float y,int width,int height) {
		super(x, y,width,height);
		this.game = game;
	}


	public void tick() {
		if(game.getKeyManager().up)
			y-=3;
		if(game.getKeyManager().down)
			y+=3;
		if(game.getKeyManager().left)
			x-=3;
		if(game.getKeyManager().right)
			x+=3;
	}


	public void render(Graphics g) {
		g.drawImage(Assets.player, (int)x, (int)y, null);
	}
	

}
