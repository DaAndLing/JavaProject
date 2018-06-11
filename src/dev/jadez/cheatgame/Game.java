package dev.jadez.cheatgame;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

import dev.jadez.cheatgame.display.*;
import dev.jadez.cheatgame.gfx.Assets;
import dev.jadez.cheatgame.input.KeyManager;
import dev.jadez.cheatgame.input.MouseManager;
import dev.jadez.cheatgame.states.GameState;
import dev.jadez.cheatgame.states.GameState2;
import dev.jadez.cheatgame.states.GameState3;
import dev.jadez.cheatgame.states.GameState4;
import dev.jadez.cheatgame.states.LoseState;
import dev.jadez.cheatgame.states.MenuState;
import dev.jadez.cheatgame.states.State;


/** Main Game class*/
public class Game implements Runnable{
	
	private Display display;
	private Canvas canvas;
	private JFrame frame;
	
	public int width,height;
	public int stateNumber;
	public String title;
	
	private boolean running = false;
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	
	//States of the full game
	private State gameState;
	private State gameState2;
	private State gameState3;
	private State gameState4;
	private State menuState;
	private State menuStatetmp;
	private State loseState;
	//private State gameStatetmp;
	//private Menu menu;
	//private State menuState;
	
	//Input Manager
	private KeyManager keyManager;
	private MouseManager mouseManager;
	
	//global time and fps
	public int fps;
	public double timePerTick; // 10^9nanosec
	public double delta = 0;
	public long now;
	public long lastTime; 
	
	public Game(String title,int width,int height) {
		this.width = width;
		this.height = height;
		this.title = title;	
		keyManager = new KeyManager();
		//new
		mouseManager = new MouseManager(this);
	}
	
	private void init() {
		display = new Display(title,width,height);
		display.getFrame().addKeyListener(keyManager);
		display.getFrame().addMouseListener(mouseManager);
		display.getFrame().addMouseMotionListener(mouseManager);
		display.getCanvas().addMouseListener(mouseManager);
		display.getCanvas().addMouseMotionListener(mouseManager);
		
		Assets.init();
		
		canvas = display.getCanvas();
		frame = display.getFrame();
		menuState = new MenuState(this);
		loseState = new LoseState(this);

		// set current state
		//State.setState(gameState);
		State.setState(menuState);
	}
	
	public void initGame() {
		
		menuStatetmp = new MenuState(this);
		gameState = new GameState(this);
		gameState2 = new GameState2(this);
		gameState3 = new GameState3(this);
		gameState4 = new GameState4(this);
		loseState = new LoseState(this);
		
	}
	
	private void tick() {
		
		keyManager.tick();
		
		// Use the state's tick() method
		if(State.getState()!=null) {
			State.getState().tick();
		}
			
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
		if(State.getState()!=null) {
			State.getState().render(g);	
		}
			
		
		// End HERE!
				
		bs.show();
		g.dispose();
	}
	/** Game class will first run this method
	 * since it implements Runnable
	 */
	public void run() {
		
		init();
		initGame();
		// Some tricks to make the game run on 60fps
		// DO NOT MODIFY
		fps = 60;
		timePerTick = 1000000000 / fps; // 10^9nanosec
		delta = 0;
		//long now;
		lastTime = System.nanoTime();
		
		
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
	
	public MouseManager getMouseManager() {
		return mouseManager;
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
	
	public JFrame getFrame() {
		return frame;
	}
	
	public Canvas getCanvas() {
		return canvas;
	}
	//new
	public State getState(int i) {
		if(i == 0) {
			stateNumber = 0;
			//gameStatetmp = new GameState(this);
			return menuState;
		}
		if(i == 1) {
			stateNumber = 1;
			return gameState;
		}
		if(i == 2) {
			stateNumber = 2;
			return gameState2;
		}
		if(i == 3) {
			stateNumber = 3;
			return gameState3;
		}
		if(i == 4) {
			stateNumber = 4;
			return gameState4;
		}
		if(i == 5) {
			stateNumber = 5;
			return menuStatetmp;
		}
		if(i == 6) {
			stateNumber = 6;
			return loseState;
		}
		else {
			stateNumber = -1;
			return null;
		}
	}
}

