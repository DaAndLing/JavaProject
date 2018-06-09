package dev.jadez.cheatgame.entities.creatures;

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
	double rotateSpeed;
	protected Polygon poly;
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

		this.rotateSpeed = 0.01;

		if(game.stateNumber == 2) {
			this.rotateSpeed = 0.007;
		}
		poly = new Polygon();
		point1 = new Point();
		point2 = new Point();
		point3 = new Point();
		storepoint2 = new Point();
		storepoint3 = new Point();		
		
		point1.x = x;
		point1.y = y;
		
		point2.x  = x + (int)((height)*Math.tan(Math.toRadians(theta)));
		point2.y = (int)(y+height);
		
		point3.x =  x - (int)((height)*Math.tan(Math.toRadians(theta)));
		point3.y = (int)(y+height);
		/*
		point2.x  = (int)(x+height);				
		point2.y  = y- (int)((height)*Math.tan(Math.toRadians(theta)));
		
		point3.x = (int)(x+height);
		point3.y = y+ (int)((height)*Math.tan(Math.toRadians(theta)));
*/
		Angle = 0;
		
	}
	
	public void tick(int x, int y) {
		this.x = x;
		this.y = y;
		
		point1.x = x;
		point1.y = y;
		
		point2.x  = x + (int)((height)*Math.tan(Math.toRadians(theta)));
		point2.y = (int)(y+height);
		
		point3.x =  x - (int)((height)*Math.tan(Math.toRadians(theta)));
		point3.y = (int)(y+height);
		
		/*
		point2.x  = (int)(x+height);				
		point2.y  = y- (int)((height)*Math.tan(Math.toRadians(theta)));
		
		point3.x = (int)(x+height);
		point3.y = y+ (int)((height)*Math.tan(Math.toRadians(theta)));
		*/
		if(game.stateNumber == 1) {
			if(game.delta >= 1) {
				if(Angle > 1.3 || Angle < -1.3)				
					rotateSpeed *= -1;
			Angle+= rotateSpeed;
//			System.out.println(Angle);
			}
		}
		else if(game.stateNumber == 2) {
			if(y >= 100) {
				if(game.delta >= 1) {
					if(Angle > 0 || Angle < -1.7)				
						rotateSpeed *= -1;
					Angle+= rotateSpeed;
//					System.out.println(Angle);
					}
				
			}
		}
		else if(game.stateNumber == 3) {
			
			point2.x  = x - (int)((height)*Math.tan(Math.toRadians(theta)));
			point2.y = (int)(y-height);
			
			point3.x =  x + (int)((height)*Math.tan(Math.toRadians(theta)));
			point3.y = (int)(y-height);
			
			if(game.delta >= 1) {
				if(Angle > 0.5 || Angle < 0)				
					rotateSpeed *= -1;
				Angle+= rotateSpeed;
//				System.out.println(Angle);
				}
			
		}
		else if(game.stateNumber == 4) {
			if(game.delta >= 1) {
				if(Angle > 3.1415926 || Angle < 0)				
					rotateSpeed *= -1;
				Angle+= rotateSpeed;
//				System.out.println(Angle);
				}
			
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
