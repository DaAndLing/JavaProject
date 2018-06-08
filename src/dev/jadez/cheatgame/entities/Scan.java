package dev.jadez.cheatgame.entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.geom.AffineTransform;
import dev.jadez.cheatgame.*;
/** The triangle part for the teacher
 *  !!Experimental!!
 *  !!NEEDS TO BE MODIFID!! 
 */
public class Scan {
	double height,theta,rotation;
	float x,y;
	private Polygon poly;
	Point point1, point2, point3;
	Point storepoint2, storepoint3;
	double Angle;
	Game game;
	
	public Scan(Game game, float height,double theta,int x,int y) {
		
		this.height=height;
		this.theta=theta;
		this.x=x;
		this.y=y;
		this.game = game;
		
		poly = new Polygon();
		point1 = new Point();
		point2 = new Point();
		point3 = new Point();
		storepoint2 = new Point();
		storepoint3 = new Point();		
		
		point1.x = x;
		point1.y = y;
		
		point2.x  = (int)(x+height);				
		point2.y  = y- (int)((height)*Math.tan(Math.toRadians(theta)));
		
		point3.x = (int)(x+height);
		point3.y = y+ (int)((height)*Math.tan(Math.toRadians(theta)));

		Angle = 30;
		
	}
	
	public void tick(int x, int y) {
		this.x = x;
		this.y = y;
		
		point1.x = x;
		point1.y = y;
		
		point2.x  = (int)(x+height);				
		point2.y  = y- (int)((height)*Math.tan(Math.toRadians(theta)));
		
		point3.x = (int)(x+height);
		point3.y = y+ (int)((height)*Math.tan(Math.toRadians(theta)));
		
		if(game.delta >= 1) {
			Angle+= 0.01;
		}
	
		AffineTransform.getRotateInstance(Angle, x, y).transform(point2, storepoint2);
		AffineTransform.getRotateInstance(Angle, x, y).transform(point3, storepoint3);
		poly.reset();
		poly.addPoint(point1.x, point1.y);
		poly.addPoint(storepoint2.x, storepoint2.y);
		poly.addPoint(storepoint3.x, storepoint3.y);
	}
	public void render(Graphics g) {
		g.setColor(new Color(255, 255, 0,128));
		g.fillPolygon(poly);
		
	}
	
}
