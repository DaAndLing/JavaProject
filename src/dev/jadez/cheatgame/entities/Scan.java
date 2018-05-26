package dev.jadez.cheatgame.entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/** The triangle part for the teacher
 *  !!Experimental!!
 *  !!NEEDS TO BE MODIFID!! 
 */
public class Scan {
	double height,theta,rotation;
	int x,y;
	Polygon poly;
	int upperX,upperY,lowerX,lowerY;
	double angle;
	
	public Scan(float height,double theta,float rotation,int x,int y) {
		
		this.height=height;
		this.rotation=rotation;
		this.theta=theta;
		this.x=x;
		this.y=y;
		
		poly = new Polygon();
		
		upperX= (int)(x+height);				
		upperY= y- (int)((height)*Math.tan(Math.toRadians(theta)));
		
		lowerX = (int)(x+height);
		lowerY = y+ (int)((height)*Math.tan(Math.toRadians(theta)));
		
		poly.addPoint(x, y);
		poly.addPoint(upperX,upperY);
		poly.addPoint(lowerX,lowerY);
	}
	
	public void tick() {
		poly.reset();
		poly.addPoint(x, y);
		
	}
	public void render(Graphics g) {
		g.setColor(new Color(255, 255, 0,128));
		g.fillPolygon(poly);
	}
	
}
