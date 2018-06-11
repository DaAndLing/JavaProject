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
		

        MusicPlayer player = new MusicPlayer("res/music/001.wav");   //创建音乐播放器  
          //C:\\Users/RRRRRROG/Desktop/001.wav
        	///music/001.wav
        player.start(true);                                        //以开始以循环的形式播放，player(false)为不循环播放  
          
//        TimeUnit.SECONDS.sleep(5);  
          
        player.stop();                        //暂停播放音频  
          
//        TimeUnit.SECONDS.sleep(4);  
          
        player.continues();                //继续开始播放音频  
		
	}

}
