package dev.jadez.cheatgame.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/** Manage Key Press Event in all stages
 * When a key is pressed, the boolean array keys[]
 * will be changed to keys[keycode] = true */
public class KeyManager implements KeyListener{
	
	private boolean[] keys;
	public boolean up,down,left,right;
	
	public KeyManager() {
		keys = new boolean[256]; 
	}
	
	/** Put keys wanted to detect HERE!*/
	public void tick() {
		up = keys[KeyEvent.VK_UP];
		left = keys[KeyEvent.VK_LEFT];
		right = keys[KeyEvent.VK_RIGHT];
		down = keys[KeyEvent.VK_DOWN];
		/*
		 * Add some keys
		 */
	}
	
	public void keyPressed(KeyEvent e) {
		if(!keys[e.getKeyCode()])
			keys[e.getKeyCode()] = true;
		// Debug Message  System.out.println(e.getKeyCode() + "Pressed!");
	}


	public void keyReleased(KeyEvent e) {
		if(keys[e.getKeyCode()])
			keys[e.getKeyCode()] = false;
	}


	public void keyTyped(KeyEvent e) {
		// Don't do anything here
	}

}
