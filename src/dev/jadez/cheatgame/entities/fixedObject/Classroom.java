package dev.jadez.cheatgame.entities.fixedObject;

import java.awt.Graphics;
import java.awt.Polygon;

import dev.jadez.cheatgame.gfx.Assets;

public class Classroom {
	Desk[] deskArray;
	private int deskWidth;
	private int deskHeight;
	public Classroom()
	{
		deskWidth = 166;
		deskHeight = 48;
		deskArray = new Desk[9];
		deskArray[0] = new Desk(, , ,); //x, y, 
		deskArray[1] = new Desk(, , ,);
		deskArray[2] = new Desk(, , ,);
		deskArray[3] = new Desk(, , ,);
		deskArray[4] = new Desk(, , ,);
		deskArray[5] = new Desk(, , ,);
		deskArray[6] = new Desk(, , ,);
		deskArray[7] = new Desk(, , ,);
		deskArray[8] = new Desk(, , ,);
	}
	
	public Desk[] getDesk()
	{
		return deskArray;
	}
	
	public void render(Graphics g) {
		g.drawImage(Assets.classBack, 0, 0, null);
		g.drawImage(Assets.desks, 0, 0, null);
//		g.drawPolygon(deskArray.getRange());;
	}
}
