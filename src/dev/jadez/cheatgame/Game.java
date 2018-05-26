package dev.jadez.cheatgame;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import dev.jadez.cheatgame.display.*;
import dev.jadez.cheatgame.gfx.Assets;
import dev.jadez.cheatgame.input.KeyManager;
import dev.jadez.cheatgame.states.GameState;
import dev.jadez.cheatgame.states.MenuState;
import dev.jadez.cheatgame.states.State;


/** Main Game class*/
public class Game implements Runnable{
	
	private Display display;
	public int width,height;
	public String title;
	
	private boolean running = false;
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	
	//States of the full game
	private State gameState;
	
	//private State menuState;
	
	//Input keyManager
	private KeyManager keyManager;
	
	public Game(String title,int width,int height) {
		this.width = width;
		this.height = height;
		this.title = title;	
		keyManager = new KeyManager();
	}
	
	private void init() {
		display = new Display(title,width,height);
		display.getFrame().addKeyListener(keyManager);
		Assets.init();
		
		gameState = new GameState(this);
		//menuState = new MenuState(this);
		
		// set current state
		State.setState(gameState);
	}
	
	private void tick() {
		
		keyManager.tick();
		
		// Use the state's tick() method
		if(State.getState()!=null)
			State.getState().tick();
	}
	

	
	private void render() {
		// Buffering
		// NO NEED to modify this part!
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null) {
			display.getCanvas().createBufferStrategy(3);	
			return;
		}
		g = bs.getDrawGraphics();
		
		// Clear Screen
		g.clearRect(0, 0, width, height);
		
		
		// Draw HERE!
		
		// Calling state's render()
		if(State.getState()!=null)
			State.getState().render(g);
		
		// End HERE!
				
		bs.show();
		g.dispose();
	}
	
	/** Game class will first run this method
	 * since it implements Runnable
	 */
	public void run() {
		
		init();
		
		// Some tricks to make the game run on 60fps
		// DO NOT MODIFY
		int fps = 60;
		double timePerTick = 1000000000 / fps; // 10^9nanosec
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		
		
		while(running) {
			now = System.nanoTime();
			delta += (now-lastTime) / timePerTick;
			lastTime = now;
			
			if(delta >= 1) {
				tick();
				render();
				delta--;
			}
			
		}
		// DO NOT MODIFY
		
		stop();
		
	}
	
	public KeyManager getKeyManager() {
		return keyManager;
	}
	
	public synchronized void start() {
		if(running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop() {
		if(!running)
			return;
		try {
			thread.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

