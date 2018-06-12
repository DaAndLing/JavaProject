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
import dev.jadez.cheatgame.gfx.ImageLoader;

public class WinState extends State{
	
	private Canvas canvas;
	private JFrame frame;

	
	public WinState(Game game) {
		// TODO
		super(game);
		
	
	}

	public void tick() {
		// Mouse Test
		//System.out.println("Mouse Test: "+ game.getMouseManager().getMouseX() + "," + game.getMouseManager().getMouseY());;
	}


	public void render(Graphics g) {
		
		//g.drawImage(Assets.StartPage, 0, 0, null);
		//Graphics2D g2d = (Graphics2D)g;
		//g.drawImage(Assets.btnMenu, game.width/2 - 50 , 500, null);
		
		if(game.stateNumber == 32) 
			g.drawImage(ImageLoader.loadImage("/story/end_dialog01.png"), 0, 0, null);
		else if(game.stateNumber == 33)
			g.drawImage(ImageLoader.loadImage("/story/end_dialog02.png"), 0, 0, null);
		else if(game.stateNumber == 34)
			g.drawImage(ImageLoader.loadImage("/story/end_dialog03.png"), 0, 0, null);
		else if(game.stateNumber == 35)
			g.drawImage(ImageLoader.loadImage("/story/end_dialog04.png"), 0, 0, null);
		else if(game.stateNumber == 36)
			g.drawImage(ImageLoader.loadImage("/story/end_dialog05.png"), 0, 0, null);
		else if(game.stateNumber == 37)
			g.drawImage(ImageLoader.loadImage("/story/end_dialog06.png"), 0, 0, null);
		else if(game.stateNumber == 38)
			g.drawImage(ImageLoader.loadImage("/story/end_dialog07.png"), 0, 0, null);
		else if(game.stateNumber == 39)
			g.drawImage(ImageLoader.loadImage("/story/end_dialog08.png"), 0, 0, null);
		else if(game.stateNumber == 40)
			g.drawImage(ImageLoader.loadImage("/story/end_dialog09.png"), 0, 0, null);
		else if(game.stateNumber == 41)
			g.drawImage(ImageLoader.loadImage("/story/end_dialog10.png"), 0, 0, null);
		else if(game.stateNumber == 42)
			g.drawImage(ImageLoader.loadImage("/story/end_dialog11.png"), 0, 0, null);
		else if(game.stateNumber == 43)
			g.drawImage(ImageLoader.loadImage("/story/end_dialog12.png"), 0, 0, null);
		else if(game.stateNumber == 44)
			g.drawImage(ImageLoader.loadImage("/end/end_story01.png"), 0, 0, null);
		else if(game.stateNumber == 45)
			g.drawImage(ImageLoader.loadImage("/end/end_story02.png"), 0, 0, null);
		else if(game.stateNumber == 46)
			g.drawImage(ImageLoader.loadImage("/end/end_story03.png"), 0, 0, null);

	}

}