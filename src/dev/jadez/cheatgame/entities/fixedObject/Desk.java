package dev.jadez.cheatgame.entities.fixedObject;

import java.awt.Graphics;
import java.awt.Polygon;

import dev.jadez.cheatgame.entities.Entity;
import dev.jadez.cheatgame.gfx.Assets;

public class Desk extends Entity{

	Polygon range;
	
	public Desk(float x, float y, int width, int height) {
		super(x, y, width, height);
		range = new Polygon();
		range.addPoint((int)x, (int)y);
		range.addPoint((int)x + width, (int)y);
		range.addPoint((int)x + width, (int)y + height);
		range.addPoint((int)x, (int)y + height);
	}

	
	@Override
	public void tick() {
		//Doing Nothing
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.student, (int) x, (int) y, width, height, null);
	}

	public Polygon getRange()
	{
		return range;
	}

}
