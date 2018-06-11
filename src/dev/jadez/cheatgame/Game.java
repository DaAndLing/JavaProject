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
import dev.jadez.cheatgame.states.StoryState;
import dev.jadez.cheatgame.states.WinState;


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
	private State winState;
	private State storyState1;
	private State storyState2;
	private State storyState3;
	private State storyState4;
	private State storyState5;
	private State storyState6;
	private State storyState7;
	private State storyState8;
	private State storyState9;
	private State storyState10;
	private State storyState11;
	private State storyState12;
	private State storyState13;
	private State storyState14;
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
		winState = new WinState(this);
		storyState1 = new StoryState(this);
		storyState2 = new StoryState(this);
		storyState3 = new StoryState(this);
		storyState4 = new StoryState(this);
		storyState5 = new StoryState(this);
		storyState6 = new StoryState(this);
		storyState7 = new StoryState(this);
		storyState8 = new StoryState(this);
		storyState9 = new StoryState(this);
		storyState10 = new StoryState(this);
		storyState11 = new StoryState(this);
		storyState12 = new StoryState(this);
		storyState13 = new StoryState(this);
		storyState14 = new StoryState(this);
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
		if(i == 7) {
			stateNumber = 7;
			return loseState;
		}
		if(i == 8) {
			stateNumber = 8;
			return loseState;
		}
		if(i == 9) {
			stateNumber = 9;
			return loseState;
		}
		if(i == 10) {
			stateNumber = 10;
			return winState;
		}
		if(i == 11) {
			stateNumber = 11;
			return storyState1;
		}
		if(i == 12) {
			stateNumber = 12;
			return storyState2;
		}
		if(i == 13) {
			stateNumber = 13;
			return storyState3;
		}
		if(i == 14) {
			stateNumber = 14;
			return storyState4;
		}
		if(i == 15) {
			stateNumber = 15;
			return storyState5;
		}
		if(i == 16) {
			stateNumber = 16;
			return storyState6;
		}
		if(i == 17) {
			stateNumber = 17;
			return storyState7;
		}
		if(i == 18) {
			stateNumber = 18;
			return storyState8;
		}
		if(i == 19) {
			stateNumber = 19;
			return storyState9;
		}
		if(i == 20) {
			stateNumber = 20;
			return storyState10;
		}
		if(i == 21) {
			stateNumber = 21;
			return storyState11;
		}
		if(i == 22) {
			stateNumber = 22;
			return storyState12;
		}
		if(i == 23) {
			stateNumber = 23;
			return storyState13;
		}
		if(i == 24) {
			stateNumber = 24;
			return storyState14;
		}
		else {
			stateNumber = -1;
			return null;
		}
	}
}

