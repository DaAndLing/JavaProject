package dev.jadez.cheatgame.states;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;

import dev.jadez.cheatgame.Game;

public class MenuState extends State{
	
	private Canvas canvas;
	private JFrame frame;
	
	public MenuState(Game game) {
		// TODO
		super(game);
	
	}

	public void tick() {
		// Mouse Test
		//System.out.println("Mouse Test: "+ game.getMouseManager().getMouseX() + "," + game.getMouseManager().getMouseY());;
	}


	public void render(Graphics g) {

	}

}
