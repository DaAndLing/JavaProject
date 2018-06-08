package dev.jadez.cheatgame.entities.creatures;

import java.awt.Graphics;
import java.awt.Polygon;

import dev.jadez.cheatgame.gfx.Assets;

public class Enemy extends Creature{

	private Polygon range;
	public Enemy(float x, float y, int width, int height) {
		super(x, y, width, height);
		
		range = new Polygon();
		range.addPoint((int)x - width, (int)y - height);
		range.addPoint((int)x + 2 * width, (int)y - height);
		range.addPoint((int)x + 2 * width, (int)y + 2 * height);
		range.addPoint((int)x - width, (int)y + 2 * height);
		
	}
	
	
	public void render(Graphics g) {
		g.drawImage(Assets.grass, (int) x, (int) y, null);
	}

	public Polygon getRange()
	{
		return range;
	}
	
	@Override
	public void tick() {
		
	}


}
