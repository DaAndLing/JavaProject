package dev.jadez.cheatgame.states;

import java.awt.Graphics;
import java.awt.Point;

import dev.jadez.cheatgame.Game;
import dev.jadez.cheatgame.entities.ProgressBar;
import dev.jadez.cheatgame.entities.creatures.Enemy;
import dev.jadez.cheatgame.entities.creatures.Player;
import dev.jadez.cheatgame.entities.creatures.Teacher;
import dev.jadez.cheatgame.entities.fixedObject.Classroom;
import dev.jadez.cheatgame.entities.fixedObject.Desk;

public class GameState extends State{

	private Player player;
	private Teacher teacher;
	private Enemy enemy;
	private Desk[] deskArray;
	private Desk forSetDesk;
	private Classroom classroom;
	private ProgressBar progressbar;
	private boolean full;//progress bar full
	
	public GameState(Game game) {
		super(game);
		teacher = new Teacher(game, 280, 190, 32, 32, 400, 20);//x, y, width, height
																// scanHeight, theta	
		classroom = new Classroom();
		player = new Player(classroom, game,120,650,32, 32);
		progressbar = new ProgressBar(game);
		enemy = new Enemy(430, 510, 32, 32);

	}
	
	public void tick() {
		player.tick();
		teacher.tick();
		enemy.tick();
		
		
		//Collision detection
		if(teacher.getpoly().contains(player.getPlayerPosition())) {
			//System.out.println("got you, bitch");
			game.initGame();
			State.setState(game.getState(6));
		}
			
		
		if(enemy.getRange().contains(player.getPlayerPosition()))
		{
			//player enter the cheat zone
			progressbar.tick(true);
		}
		else
			progressbar.tick(false);
		
		full = progressbar.getFull();
		if(full) {
			
			//System.out.println("win");
			State.setState(game.getState(13));
			
		}
			
	}


	public void render(Graphics g) {
		classroom.render(g);
		
		progressbar.render(g);
		enemy.render(g);
		
		
		player.render(g);
		teacher.render(g);
	}
}
