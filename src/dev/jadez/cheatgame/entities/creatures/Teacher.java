package dev.jadez.cheatgame.entities.creatures;


import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import dev.jadez.cheatgame.Game;
import dev.jadez.cheatgame.entities.Scan;
import dev.jadez.cheatgame.gfx.Assets;

public class Teacher extends Creature implements Shape{
	
	public Scan scan;
	public Game game;
	int move_amount = 2;
	
	public Teacher(Game game, float x, float y, int width, int height,
				float scanHeight,double theta) {
		super(x, y, width, height);
		scan = new Scan(game, scanHeight, theta, (int)x + width / 2, (int)y + height / 2);
		this.game = game;
	}

	@Override
	public void tick() {
		
		if(game.delta >= 1) {
			x += move_amount;
			if(x > 500 || x < 100)
				move_amount *= -1;		
		}
		scan.tick((int)x + width / 2, (int)y + height / 2);//plus extra offset to 
	}													   //make sure the vertex of
														   //triangle is at the center
	@Override											   //of the teacher	
	public void render(Graphics g) {
		scan.render(g);
		g.drawImage(Assets.dirt, (int) x, (int) y, null);
	}

														@Override
														public boolean contains(Point2D p) {
															// TODO Auto-generated method stub
															return false;
														}

														@Override
														public boolean contains(Rectangle2D r) {
															// TODO Auto-generated method stub
															return false;
														}

														@Override
														public boolean contains(double x, double y) {
															// TODO Auto-generated method stub
															return false;
														}

														@Override
														public boolean contains(double x, double y, double w,
																double h) {
															// TODO Auto-generated method stub
															return false;
														}

														@Override
														public Rectangle getBounds() {
															// TODO Auto-generated method stub
															return null;
														}

														@Override
														public Rectangle2D getBounds2D() {
															// TODO Auto-generated method stub
															return null;
														}

														@Override
														public PathIterator getPathIterator(AffineTransform at) {
															// TODO Auto-generated method stub
															return null;
														}

														@Override
														public PathIterator getPathIterator(AffineTransform at,
																double flatness) {
															// TODO Auto-generated method stub
															return null;
														}

														@Override
														public boolean intersects(Rectangle2D r) {
															// TODO Auto-generated method stub
															return false;
														}

														@Override
														public boolean intersects(double x, double y, double w,
																double h) {
															// TODO Auto-generated method stub
															return false;
														}

}
