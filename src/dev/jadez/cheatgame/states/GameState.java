package dev.jadez.cheatgame.states;

import java.awt.Graphics;

import dev.jadez.cheatgame.Game;
import dev.jadez.cheatgame.entities.Scan;
import dev.jadez.cheatgame.entities.creatures.Player;
import dev.jadez.cheatgame.gfx.Assets;

public class GameState extends State{

	private Player player;
	private Scan scan;
	public GameState(Game game) {
		super(game);
		player = new Player(game,100,100,0, 0);
		scan = new Scan(100, 15, 0, 50, 50);
	}
	
	public void tick() {
		player.tick();
		scan.tick();
	}


	public void render(Graphics g) {
		player.render(g);
		scan.render(g);
	}
	
	

}
