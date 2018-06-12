package dev.jadez.cheatgame.states;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;

import javax.swing.JFrame;



import dev.jadez.cheatgame.Game;
import dev.jadez.cheatgame.gfx.Assets;
import dev.jadez.cheatgame.gfx.ImageLoader;

public class StoryState extends State{
	private Canvas canvas;
	private JFrame frame;

	
	public StoryState(Game game) {
		// TODO
		super(game);
		
	
	}

	public void tick() {
		// Mouse Test
		//System.out.println("Mouse Test: "+ game.getMouseManager().getMouseX() + "," + game.getMouseManager().getMouseY());;
	}


	public void render(Graphics g) {
		if(game.stateNumber == 11) 
			g.drawImage(ImageLoader.loadImage("/story/dialog01.png"), 0, 0, null);
		else if(game.stateNumber == 12)
			g.drawImage(ImageLoader.loadImage("/story/dialog02.png"), 0, 0, null);
		else if(game.stateNumber == 13)
			g.drawImage(ImageLoader.loadImage("/story/dialog03.png"), 0, 0, null);
		else if(game.stateNumber == 14)
			g.drawImage(ImageLoader.loadImage("/story/dialog04.png"), 0, 0, null);
		else if(game.stateNumber == 15)
			g.drawImage(ImageLoader.loadImage("/story/dialog05.png"), 0, 0, null);
		else if(game.stateNumber == 16)
			g.drawImage(ImageLoader.loadImage("/story/dialog06.png"), 0, 0, null);
		else if(game.stateNumber == 17)
			g.drawImage(ImageLoader.loadImage("/story/dialog07.png"), 0, 0, null);
		else if(game.stateNumber == 18)
			g.drawImage(ImageLoader.loadImage("/story/dialog08.png"), 0, 0, null);
		else if(game.stateNumber == 19)
			g.drawImage(ImageLoader.loadImage("/story/dialog09.png"), 0, 0, null);
		else if(game.stateNumber == 20)
			g.drawImage(ImageLoader.loadImage("/story/dialog10.png"), 0, 0, null);
		else if(game.stateNumber == 21)
			g.drawImage(ImageLoader.loadImage("/story/dialog11.png"), 0, 0, null);
		else if(game.stateNumber == 22)
			g.drawImage(ImageLoader.loadImage("/story/dialog12.png"), 0, 0, null);
		else if(game.stateNumber == 23)
			g.drawImage(ImageLoader.loadImage("/story/dialog13.png"), 0, 0, null);
		else if(game.stateNumber == 24)
			g.drawImage(ImageLoader.loadImage("/story/dialog14.png"), 0, 0, null);
		else if(game.stateNumber == 25)
			g.drawImage(ImageLoader.loadImage("/story/dialog15.png"), 0, 0, null);
		else if(game.stateNumber == 26)
			g.drawImage(ImageLoader.loadImage("/story/dialog16.png"), 0, 0, null);
		else if(game.stateNumber == 27)
			g.drawImage(ImageLoader.loadImage("/story/dialog17.png"), 0, 0, null);
		else if(game.stateNumber == 28)
			g.drawImage(ImageLoader.loadImage("/story/dialog18.png"), 0, 0, null);
		else if(game.stateNumber == 29)
			g.drawImage(ImageLoader.loadImage("/story/dialog19.png"), 0, 0, null);
		else if(game.stateNumber == 30)
			g.drawImage(ImageLoader.loadImage("/story/dialog20.png"), 0, 0, null);
		else if(game.stateNumber == 31)
			g.drawImage(ImageLoader.loadImage("/story/dialog21.png"), 0, 0, null);
	}
}
