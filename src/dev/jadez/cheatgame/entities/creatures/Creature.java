package dev.jadez.cheatgame.entities.creatures;

import dev.jadez.cheatgame.entities.Entity;

public abstract class Creature extends Entity{

	protected int health;
	
	public Creature(float x, float y,int width,int height) {
		super(x, y,width,height);
		health = 10;
		// TODO Auto-generated constructor stub
	}
	
	
}
