package dev.jadez.cheatgame;

/** Class used to launch a game
 *  Also a Main class
 *  
 */
public class Launcher {

	public static void main(String[] args) {
		
		Game game = new Game("Cheat In Class!",600,800);
		game.start();
		
	}

}
