package dev.jadez.cheatgame;

import java.util.concurrent.TimeUnit;

import dev.jadez.cheatgame.music.MusicPlayer;

/** Class used to launch a game
 *  Also a Main class
 *  
 */
public class Launcher {

	public static void main(String[] args) {
		
		Game game = new Game("Cheat In Class!",600,800);
		game.start();
		
        MusicPlayer player = new MusicPlayer("res/music/001.wav");   // Create music player
        player.start(true);                                        // Loop the music  
		
	}

}
