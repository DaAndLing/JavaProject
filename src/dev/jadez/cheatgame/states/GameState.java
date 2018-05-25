package dev.jadez.cheatgame.states;

import java.awt.Graphics;

import dev.jadez.cheatgame.Game;
import dev.jadez.cheatgame.entities.creatures.Player;
import dev.jadez.cheatgame.gfx.Assets;

public class GameState extends State{

	private Player player;
	public GameState(Game game) {
		super(game);
		player = new Player(game,100,100,0, 0);
	}
	
	public void tick() {
		player.tick();
	}


	public void render(Graphics g) {
		player.render(g);
	}
	
	

}
