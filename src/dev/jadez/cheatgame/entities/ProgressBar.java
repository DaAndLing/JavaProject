package dev.jadez.cheatgame.entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;

import dev.jadez.cheatgame.Game;

public class ProgressBar {

	private Polygon polyBar;
	private Point point1, point2, point3, point4;
	private int height;
	private boolean full;
	Game game;
	public ProgressBar(Game game)
	{
		polyBar = new Polygon();
		point1 = new Point(580, 799);
		point2 = new Point(599, 799);
		point3 = new Point();
		point4 = new Point();
		height = 800;
		this.game = game;
		full = false;
	}
	
	public boolean getFull()
	{
		return full;
	}
	public void tick(boolean enable)
	{
		if(enable)
		{
			if(height <= 0)
				full = true;
			if(!full)
			{
				if(game.delta >= 1)
				{
					polyBar.reset();
					height-=3;
					point3.x = 580;
					point3.y = height;
					
					point4.x = 599;
					point4.y = height;
					polyBar.addPoint(point1.x, point1.y);
					polyBar.addPoint(point2.x, point2.y);
					polyBar.addPoint(point4.x, point4.y);
					polyBar.addPoint(point3.x, point3.y);
				}
			}
		}
	}
	
	public void render(Graphics g)
	{
		g.setColor(Color.red);
		g.fillPolygon(polyBar);
	}
}
