package dev.jadez.cheatgame.gfx;

import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;

 

public class Animation {
	private ArrayList scenes;
	private int sceneIndex;
	private long time;
	private long totalTime;
	private Image bg;
	
	private Animation() {
		scenes = new ArrayList();
		totalTime = 0;
		start();
	}
	
	public synchronized void addScene(Image i, long t) {
		totalTime += t;
		scenes.add(new OneScene(i, totalTime));
	}
	
	public synchronized void start() {
		time = 0;
		sceneIndex =0;
	}
	
	public synchronized void update(long timePassed) {
		if(scenes.size()>1) {
			time += timePassed;
			if(time >= totalTime) {
				time = 0;
				sceneIndex =0;
			}
			while(time > getScene(sceneIndex).endTime) {
				sceneIndex++;
			}
		}
	}
	
	public synchronized Image getImage() {
		if(scenes.size()==0) {
			return null;
		}
		else {
			return getScene(sceneIndex).pic;
		}
	}
	
	private OneScene getScene(int x) {
		return (OneScene)scenes.get(x);
	}
	
	private class OneScene{
		Image pic;
		long endTime;
		
		public OneScene(Image pic, long endTime) {
			this.pic = pic;
			this.endTime = endTime;
		}
		
	}
	
	public void loadPics() {
		Image lose1 = new ImageIcon(Assets.LosePage1).getImage();
		Image lose2 = new ImageIcon(Assets.LosePage1).getImage();
		this.addScene(lose1, 250);
		this.addScene(lose2, 250);
	}
	
	
	
	
}