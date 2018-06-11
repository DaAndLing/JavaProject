package dev.jadez.cheatgame.states;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Rectangle;

import dev.jadez.cheatgame.Game;
import dev.jadez.cheatgame.gfx.Assets;

public class LoseState extends State{
	private Canvas canvas;
	private JFrame frame;

	
	public LoseState(Game game) {
		// TODO
		super(game);
		
	
	}

	public void tick() {
		// Mouse Test
		//System.out.println("Mouse Test: "+ game.getMouseManager().getMouseX() + "," + game.getMouseManager().getMouseY());;
	}


	public void render(Graphics g) {

		g.drawImage(Assets.LosePage10, 0, 0, null);
		
		Graphics2D g2d = (Graphics2D)g;
		g.drawImage(Assets.btnRestart, game.width/2 - 170, 700, null);
		g.drawImage(Assets.btnMenu, game.width/2 + 50, 700, null);

	}
}
