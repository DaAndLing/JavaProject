package dev.jadez.cheatgame.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int  width = 32,height = 32;

	public static BufferedImage player,dirt,grass,stone,tree;
	
	public static BufferedImage classBack,desks,btnStart,StartPage;
	
	public static void init() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheet.png"));
		
		player = sheet.crop(0, 0, width, height);
		dirt = sheet.crop(width, 0, width, height);
		grass = sheet.crop(width*2, 0, width, height);
		stone = sheet.crop(width*3, 0, width, height);
		tree = sheet.crop(0, height, width, height);
		
		classBack = ImageLoader.loadImage("/classroom/classroom.png");
		desks = ImageLoader.loadImage("/classroom/desks.png");
		//new
		btnStart = ImageLoader.loadImage("/classroom/btnStart.png");
		StartPage = ImageLoader.loadImage("/classroom/StartPage.png");
	}
}
