package dev.jadez.cheatgame.entities.creatures;


import java.awt.Graphics;
import java.awt.Polygon;

import dev.jadez.cheatgame.Game;
import dev.jadez.cheatgame.gfx.Assets;

public class Teacher extends Creature{
	
	public Scan scan;
	public Game game;
	int xmove_amount = 1;
	int ymove_amount = 1;
	public boolean teacherlight;
	public Teacher(Game game, float x, float y, int width, int height,
				float scanHeight,double theta) {
		super(x, y, width, height);
		teacherlight = false;
		scan = new Scan(game, scanHeight, theta, (int)x + width / 2, (int)y + height / 2);
		this.game = game;
	}	

	public Polygon getpoly()
	{
		return scan.poly;
	}
	
	@Override
	public void tick() {
		
		//new
		if(game.stateNumber == 1) {
			if(game.delta >= 1) {
			//x += xmove_amount;
			//if(x > 500 || x < 100)
				//xmove_amount *= -1;		
		}
		
		scan.tick((int)x + width / 2, (int)y + height / 2);//plus extra offset to 
														   //make sure the vertex of
														   //triangle is at the center
															//of the teacher	
		}
		
		else if(game.stateNumber == 2) {
			if(game.delta >= 1) {
				y += ymove_amount;
				if(y > 500 || y < 180)
					ymove_amount *= -1;		
			}
			
			scan.tick((int)x + width / 2, (int)y + height / 2);
			
		}
		else if(game.stateNumber == 3) {
			if(game.delta >= 1) {
				x += xmove_amount*2;
				if(x > 275) {
					xmove_amount = 0;
					y += ymove_amount*2;	
				}
				if(y > 545) {
					ymove_amount *= -3;
				}
				if(y < 190 && x > 275) {
					ymove_amount = 0;
					xmove_amount = -1;
				}
				if(x < 100) {
					xmove_amount *= -1;
					ymove_amount = 1;
					x = 100;
					y = 190;
				}
		}
		
		scan.tick((int)x + width / 2, (int)y + height / 2);//plus extra offset to 
														   //make sure the vertex of
														   //triangle is at the center
															//of the teacher	
		}
		else if(game.stateNumber == 4) {
			teacherlight = game.getMouseManager().getlight;
			if(teacherlight == true) {
				//System.out.println("HH");
				if(game.delta >= 1) {
					if(x<800) {
						xmove_amount = 2;
						x += xmove_amount/2;
					}
					//xmove_amount *= -1;		
				}
				
			}
			else {
				
				scan.tick((int)x + width / 2, (int)y + height / 2);
				
			}
			
			
		}

	}
	@Override	
	public void render(Graphics g) {
		
		if(teacherlight == false) {
			scan.render(g);
		}
		g.drawImage(Assets.teacher, (int) x, (int) y, null);
	}

}
