package dev.jadez.cheatgame.entities.fixedObject;

import java.awt.Graphics;
import java.awt.Polygon;

import dev.jadez.cheatgame.gfx.Assets;

public class Classroom {
	Desk[] deskArray;
	private int deskWidth;
	private int deskHeight;

	public Classroom() {
		deskWidth = 166;
		deskHeight = 48;
		deskArray = new Desk[9];
		deskArray[0] = new Desk(251, 133, 97, 52); // x, y,
		deskArray[1] = new Desk(108, 228, 167, 48);
		deskArray[2] = new Desk(105, 344, 167, 48);
		deskArray[3] = new Desk(104, 460, 167, 48);
		deskArray[4] = new Desk(105, 587, 167, 48);
		deskArray[5] = new Desk(325, 227, 167, 48);
		deskArray[6] = new Desk(323, 343, 167, 48);
		deskArray[7] = new Desk(322, 458, 167, 48);
		deskArray[8] = new Desk(327, 586, 167, 48);
	}

	public Desk[] getDesk() {
		return deskArray;
	}

	public void render(Graphics g) {
		g.drawImage(Assets.classBack, 0, 0, null);
		g.drawImage(Assets.desks, 0, 0, null);
		// g.drawPolygon(deskArray.getRange());;
	}
}
