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
				if(my >= 500 && my <= 600) {
					//System.out.println("HIT");
					//game.initGame();
					State.setState(game.getState(1));
					return;
				}
				
			}
		}
		
		if(game.stateNumber == 11) {
					//System.out.println("HIT");
					//game.initGame();
			State.setState(game.getState(12));
			return;
		}
		if(game.stateNumber == 12) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(13));
			return;
		}
		if(game.stateNumber == 13) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(14));
			return;
		}
		if(game.stateNumber == 14) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(15));
			return;
		}
		if(game.stateNumber == 15) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(16));
			return;
		}
		if(game.stateNumber == 16) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(17));
			return;
		}
		if(game.stateNumber == 17) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(18));
			return;
		}
		if(game.stateNumber == 18) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(19));
			return;
		}
		if(game.stateNumber == 19) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(20));
			return;
		}
		if(game.stateNumber == 20) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(21));
			return;
		}
		if(game.stateNumber == 21) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(22));
			return;
		}
		if(game.stateNumber == 22) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(23));
			return;
		}
		
		if(game.stateNumber == 23) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(1));
			return;
		}
		
		if(game.stateNumber == 6) {
			int mx = e.getX();
			int my = e.getY();
			
			if(mx >= game.width/2 - 170  && mx <= game.width/2 ) {
				if(my >= 700 && my <= 800) {
					//System.out.println("HIT");
					//game.initGame();
					State.setState(game.getState(1));
				}
				
			}
			
			if(mx >= game.width/2 + 50  && mx <= game.width/2 +170) {
				if(my >= 700 && my <= 800) {
					//System.out.println("HIT");
					//game.initGame();
					State.setState(game.getState(5));
				}
				
			}
		}
		if(game.stateNumber == 7) {
			int mx = e.getX();
			int my = e.getY();
			
			if(mx >= game.width/2 - 170  && mx <= game.width/2 ) {
				if(my >= 700 && my <= 800) {
					//System.out.println("HIT");
					//game.initGame();
					State.setState(game.getState(2));
				}
				
			}
			
			if(mx >= game.width/2 + 50  && mx <= game.width/2 +170) {
				if(my >= 700 && my <= 800) {
					//System.out.println("HIT");
					//game.initGame();
					State.setState(game.getState(5));
				}
				
			}
		}
		if(game.stateNumber == 8) {
			int mx = e.getX();
			int my = e.getY();
			
			if(mx >= game.width/2 - 170  && mx <= game.width/2 ) {
				if(my >= 700 && my <= 800) {
					//System.out.println("HIT");
					//game.initGame();
					State.setState(game.getState(3));
				}
				
			}
			
			if(mx >= game.width/2 + 50  && mx <= game.width/2 +170) {
				if(my >= 700 && my <= 800) {
					//System.out.println("HIT");
					//game.initGame();
					State.setState(game.getState(5));
				}
				
			}
		}
		if(game.stateNumber == 9) {
			int mx = e.getX();
			int my = e.getY();
			
			if(mx >= game.width/2 - 170  && mx <= game.width/2 ) {
				if(my >= 700 && my <= 800) {
					//System.out.println("HIT");
					//game.initGame();
					State.setState(game.getState(4));
				}
				
			}
			
			if(mx >= game.width/2 + 50  && mx <= game.width/2 +170) {
				if(my >= 700 && my <= 800) {
					//System.out.println("HIT");
					//game.initGame();
					State.setState(game.getState(5));
				}
				
			}
		}
		if(game.stateNumber == 10) {
			int mx = e.getX();
			int my = e.getY();
			
			if(mx >= game.width/2 - 50  && mx <= game.width/2 + 50) {
				if(my >= 500 && my <= 600) {
					//System.out.println("HIT");
					//game.initGame();
					State.setState(game.getState(5));
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
