package dev.jadez.cheatgame.states;

import java.awt.Graphics;

import dev.jadez.cheatgame.Game;
import dev.jadez.cheatgame.entities.Scan;
import dev.jadez.cheatgame.entities.creatures.Player;
import dev.jadez.cheatgame.entities.creatures.Teacher;

public class GameState extends State{

	private Player player;
	private Teacher teacher;

	public GameState(Game game) {
		super(game);
		player = new Player(game,100,100,32, 32);
		teacher = new Teacher(game, 150, 150, 32, 32, 500, 20);//x, y, width, height
	}															// scanHeight, theta
	
	public void tick() {
		player.tick();
		teacher.tick();
	}


	public void render(Graphics g) {
		player.render(g);
		teacher.render(g);
	}
	
	

}
