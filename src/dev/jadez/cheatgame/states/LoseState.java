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
	private int i = 0;
	
	public LoseState(Game game) {
		// TODO
		super(game);
		
	
	}

	public void tick() {
		// Mouse Test
		//System.out.println("Mouse Test: "+ game.getMouseManager().getMouseX() + "," + game.getMouseManager().getMouseY());;
	}


	public void render(Graphics g) {
		if(i == 0) {
			g.drawImage(Assets.LosePage1, 0, 0, null);
			i++;
		}
		else if(i == 1) {
			g.drawImage(Assets.LosePage2, 0, 0, null);
			i++;
		}
		else if(i == 2) {
			g.drawImage(Assets.LosePage3, 0, 0, null);
			i++;
		}
		else if(i == 3) {
			g.drawImage(Assets.LosePage4, 0, 0, null);
			i++;
		}
		else if(i == 4) {
			g.drawImage(Assets.LosePage5, 0, 0, null);
			i++;
		}
		else if(i == 5) {
			g.drawImage(Assets.LosePage6, 0, 0, null);
			i++;
		}
		else if(i == 6) {
			g.drawImage(Assets.LosePage7, 0, 0, null);
			i++;
		}
		else if(i == 7) {
			g.drawImage(Assets.LosePage8, 0, 0, null);
			i++;
		}
		else if(i == 8) {
			g.drawImage(Assets.LosePage9, 0, 0, null);
			i++;
		}
		else if(i == 9) {
			g.drawImage(Assets.LosePage10, 0, 0, null);
			i++;
		}
		else if(i == 10) {
			g.drawImage(Assets.LosePage10, 0, 0, null);
			Graphics2D g2d = (Graphics2D)g;
			g.drawImage(Assets.btnRestart, game.width/2 - 170, 700, null);
			g.drawImage(Assets.btnMenu, game.width/2 + 50, 700, null);
		}
		try {
				Thread.sleep(100);
		} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
}
