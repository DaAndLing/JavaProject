package dev.jadez.cheatgame.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int  width = 32,height = 32;

	public static BufferedImage player,dirt,grass,stone,tree;
	
	public static BufferedImage menuBackground,btnStart,classroomBackground;
	
	public static BufferedImage[] desk = new BufferedImage[16];
	
	public static void init() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheet.png"));
		
		player = sheet.crop(0, 0, width, height);
		dirt = sheet.crop(width, 0, width, height);
		grass = sheet.crop(width*2, 0, width, height);
		stone = sheet.crop(width*3, 0, width, height);
		tree = sheet.crop(0, height, width, height);
		
		menuBackground = ImageLoader.loadImage("/classroom/StartPage.png");
		btnStart = ImageLoader.loadImage("/classroom/btnStart.png");
		classroomBackground = ImageLoader.loadImage("/classroom/classroom.png");
		
		
	}
}
