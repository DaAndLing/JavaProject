package dev.jadez.cheatgame.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int  width = 32,height = 32;

	public static BufferedImage player,dirt,grass,stone,tree;
	
	public static BufferedImage classBack,desks,btnStart,StartPage,btnMenu,btnRestart,lightbulb;
	
	public static BufferedImage LosePage1,LosePage2,LosePage3,LosePage4,LosePage5,LosePage6,LosePage7,LosePage8,LosePage9,LosePage10;
	
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
		
		LosePage1 = ImageLoader.loadImage("/classroom/lose01.png");
		LosePage2 = ImageLoader.loadImage("/classroom/lose02.png");
		LosePage3 = ImageLoader.loadImage("/classroom/lose03.png");
		LosePage4 = ImageLoader.loadImage("/classroom/lose04.png");
		LosePage5 = ImageLoader.loadImage("/classroom/lose05.png");
		LosePage6 = ImageLoader.loadImage("/classroom/lose06.png");
		LosePage7 = ImageLoader.loadImage("/classroom/lose07.png");
		LosePage8 = ImageLoader.loadImage("/classroom/lose08.png");
		LosePage9 = ImageLoader.loadImage("/classroom/lose09.png");
		LosePage10 = ImageLoader.loadImage("/classroom/lose10.png");
		btnMenu = ImageLoader.loadImage("/classroom/btnMenu.png");
		btnRestart = ImageLoader.loadImage("/classroom/btnRestart.png");
		
		lightbulb = ImageLoader.loadImage("/lightbulb/lightbulb.png");
	}
	
	
}
