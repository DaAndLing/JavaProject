package dev.jadez.cheatgame.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener{
	
	private boolean[] keys;
	public boolean up,down,left,right;
	
	public KeyManager() {
		keys = new boolean[256]; 
	}
	
	public void tick() {
		up = keys[KeyEvent.VK_UP];
		left = keys[KeyEvent.VK_LEFT];
		right = keys[KeyEvent.VK_RIGHT];
		down = keys[KeyEvent.VK_DOWN];
	}
	
	public void keyPressed(KeyEvent e) {
		if(!keys[e.getKeyCode()])
			keys[e.getKeyCode()] = true;
		System.out.println("Pressed!");
	}


	public void keyReleased(KeyEvent e) {
		if(keys[e.getKeyCode()])
			keys[e.getKeyCode()] = false;
	}


	public void keyTyped(KeyEvent e) {
		
	}

}
