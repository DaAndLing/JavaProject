package dev.jadez.cheatgame.input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import dev.jadez.cheatgame.Game;
import dev.jadez.cheatgame.states.GameState;
import dev.jadez.cheatgame.states.State;

public class MouseManager implements MouseListener,MouseMotionListener {

	private Game game;
	private boolean leftPressed, rightPressed;
	private int mouseX,mouseY;
	public MouseManager(Game game) {
		this.game = game;
	}
	

	

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseX = e.getX();
		mouseY = e.getY();
	}

	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getButton() == MouseEvent.BUTTON1)
			leftPressed = true;
		else if(e.getButton() == MouseEvent.BUTTON3)
			rightPressed = true;
		if(game.stateNumber == 0 || game.stateNumber == 5) {
			
			int mx = e.getX();
			int my = e.getY();
			
			if(mx >= game.width/2 - 131  && mx <= game.width/2 + 131 ) {
				if(my >= 500 && my <=600) {
					//System.out.println("HIT");
					//game.initGame();
					State.setState(game.getState(1));
				}
				
			}
		}

	}
	
	// Getters
	
	public boolean isLeftPressed() {
		return leftPressed;
	}
	
	public boolean isRightPressed() {
		return rightPressed;
	}
	
	public int getMouseX() {
		return mouseX;
	}
	
	public int getMouseY() {
		return mouseY;
	}
	
	// Implemented methods
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getButton() == MouseEvent.BUTTON1)
			leftPressed = false;
		else if(e.getButton() == MouseEvent.BUTTON3)
			rightPressed = false;
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


}
