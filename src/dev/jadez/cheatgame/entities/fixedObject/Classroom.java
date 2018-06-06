package dev.jadez.cheatgame.entities.fixedObject;

import java.awt.Graphics;

import dev.jadez.cheatgame.gfx.Assets;

public class Classroom {
	public void render(Graphics g) {
		g.drawImage(Assets.classBack, 0, 0, null);
		g.drawImage(Assets.desks, 0, 0, null);
	}
}
