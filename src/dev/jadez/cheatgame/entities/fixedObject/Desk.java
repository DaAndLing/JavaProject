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
		range.addPoint((int)x + width / 2, (int)y + height / 2);
		range.addPoint((int)x + width / 2, (int)y - height / 2);
		range.addPoint((int)x - width / 2, (int)y + height / 2);
		range.addPoint((int)x - width / 2, (int)y - height / 2);
	}

	public void setDeskPosition(Desk[] deskArray)
	{
		for(int i = 0; i < 17; i++)
			deskArray[0] = new Desk(300, 300, 50, 50);

	}
	
	@Override
	public void tick() {
		//Doing Nothing
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.stone, (int) x, (int) y, width, height, null);
	}

	public Polygon getRange()
	{
		return range;
	}

}
