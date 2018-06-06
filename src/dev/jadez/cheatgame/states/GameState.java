package dev.jadez.cheatgame.states;

import java.awt.Graphics;

import dev.jadez.cheatgame.Game;
import dev.jadez.cheatgame.entities.creatures.Player;
import dev.jadez.cheatgame.entities.creatures.Teacher;
import dev.jadez.cheatgame.entities.fixedObject.Classroom;
import dev.jadez.cheatgame.entities.fixedObject.Desk;
import dev.jadez.cheatgame.gfx.Assets;

public class GameState extends State{

	private Player player;
	private Teacher teacher;
	private Desk[] deskArray;
	private Desk forSetDesk;
<<<<<<< HEAD
	private int progress;//test
=======
	private Classroom classroom;
>>>>>>> 231f84ef77783ff21dbb63478b4857c216fd60ed
	
	public GameState(Game game) {
		super(game);
		player = new Player(game,100,100,32, 32);
		teacher = new Teacher(game, 150, 150, 32, 32, 500, 20);//x, y, width, height
																// scanHeight, theta
<<<<<<< HEAD
		progress = 0;
=======
		classroom = new Classroom();
>>>>>>> 231f84ef77783ff21dbb63478b4857c216fd60ed
		//a little bit tricky here, I use a method in class Desk to initialize all the table posiotion
		//coz I don't want GameState to be lengthy
		deskArray = new Desk[17];
		for(int i = 0; i < 17; i++)
			deskArray[i] = new Desk(0, 0, 0, 0);	//temporary position we have to correct
		forSetDesk = new Desk(0, 0, 0, 0);
		forSetDesk.setDeskPosition(deskArray);
	}
	
	public void tick() {
		player.tick();
		teacher.tick();

		
		//Collision detection
		if(teacher.getpoly().contains(player.getPlayerPosition()))
			System.out.println("got you, bitch");
		for(int i = 0; i < 17; i++)
		{
			if(deskArray[i].getRange().contains(player.getPlayerPosition()))
				System.out.println("bang");
		}
		
	}


	public void render(Graphics g) {
		classroom.render(g);
		player.render(g);
		teacher.render(g);
		for(int i = 0; i < 17; i++)
			deskArray[i].render(g);
	}
	
	

}
