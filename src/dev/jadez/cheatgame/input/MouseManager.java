package dev.jadez.cheatgame.input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import dev.jadez.cheatgame.Game;
import dev.jadez.cheatgame.states.GameState;
import dev.jadez.cheatgame.states.State;

public class MouseManager implements MouseListener,MouseMotionListener {
	public boolean getlight;
	private Game game;
	private boolean leftPressed, rightPressed;
	private int mouseX,mouseY;
	public MouseManager(Game game) {
		this.game = game;
		getlight = false;
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
					State.setState(game.getState(11));
					return;
				}
				
			}
		}
		
		else if(game.stateNumber == 11) {
					//System.out.println("HIT");
					//game.initGame();
			State.setState(game.getState(12));
			return;
		}
		else if(game.stateNumber == 12) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(1));
			return;
		}
		else if(game.stateNumber == 13) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(14));
			return;
		}
		else if(game.stateNumber == 14) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(15));
			return;
		}
		else if(game.stateNumber == 15) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(16));
			return;
		}
		else if(game.stateNumber == 16) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(2));
			return;
		}
		else if(game.stateNumber == 17) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(18));
			return;
		}
		else if(game.stateNumber == 18) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(19));
			return;
		}
		else if(game.stateNumber == 19) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(20));
			return;
		}
		else if(game.stateNumber == 20) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(21));
			return;
		}
		else if(game.stateNumber == 21) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(22));
			return;
		}
		else if(game.stateNumber == 22) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(23));
			return;
		}
		
		else if(game.stateNumber == 23) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(24));
			return;
		}
		else if(game.stateNumber == 24) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(3));
			return;
		}
		else if(game.stateNumber == 25) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(26));
			return;
		}
		else if(game.stateNumber == 26) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(27));
			return;
		}
		else if(game.stateNumber == 27) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(28));
			return;
		}
		else if(game.stateNumber == 28) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(29));
			return;
		}
		else if(game.stateNumber == 29) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(30));
			return;
		}
		else if(game.stateNumber == 30) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(31));
			return;
		}
		else if(game.stateNumber == 31) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(4));
			return;
		}
		else if(game.stateNumber == 32) {
			//System.out.println("HIT");
			//game.initGame();
			State.setState(game.getState(33));
			return;
		}
		else if(game.stateNumber == 33) {
			State.setState(game.getState(34));
			return;
		}
		else if(game.stateNumber == 34) {
			State.setState(game.getState(35));
			return;
		}
		else if(game.stateNumber == 35) {
			State.setState(game.getState(36));
			return;
		}
		else if(game.stateNumber == 36) {
			State.setState(game.getState(37));
			return;
		}
		else if(game.stateNumber == 37) {
			State.setState(game.getState(38));
			return;
		}
		else if(game.stateNumber == 38) {
			State.setState(game.getState(39));
			return;
		}
		else if(game.stateNumber == 39) {
			State.setState(game.getState(40));
			return;
		}
		else if(game.stateNumber == 40) {
			State.setState(game.getState(41));
			return;
		}
		else if(game.stateNumber == 41) {
			State.setState(game.getState(42));
			return;
		}
		else if(game.stateNumber == 42) {
			State.setState(game.getState(43));
			return;
		}
		else if(game.stateNumber == 43) {
			State.setState(game.getState(44));
			return;
		}
		else if(game.stateNumber == 44) {
			State.setState(game.getState(45));
			return;
		}
		else if(game.stateNumber == 45) {
			State.setState(game.getState(46));
			return;
		}
		else if(game.stateNumber == 46) {
			State.setState(game.getState(5));
			return;
		}
		
		else if(game.stateNumber == 6) {
			int mx = e.getX();
			int my = e.getY();
			
			if(mx >= game.width/2 - 170  && mx <= game.width/2 ) {
				if(my >= 700 && my <= 800) {
					//System.out.println("HIT");
					//game.initGame();
					State.setState(game.getState(1));
				}
				
			}
			
			else if(mx >= game.width/2 + 50  && mx <= game.width/2 +170) {
				if(my >= 700 && my <= 800) {
					//System.out.println("HIT");
					//game.initGame();
					State.setState(game.getState(5));
				}
				
			}
		}
		else if(game.stateNumber == 7) {
			int mx = e.getX();
			int my = e.getY();
			
			if(mx >= game.width/2 - 170  && mx <= game.width/2 ) {
				if(my >= 700 && my <= 800) {
					//System.out.println("HIT");
					//game.initGame();
					State.setState(game.getState(2));
				}
				
			}
			
			else if(mx >= game.width/2 + 50  && mx <= game.width/2 +170) {
				if(my >= 700 && my <= 800) {
					//System.out.println("HIT");
					//game.initGame();
					State.setState(game.getState(5));
				}
				
			}
		}
		else if(game.stateNumber == 8) {
			int mx = e.getX();
			int my = e.getY();
			
			if(mx >= game.width/2 - 170  && mx <= game.width/2 ) {
				if(my >= 700 && my <= 800) {
					//System.out.println("HIT");
					//game.initGame();
					State.setState(game.getState(3));
				}
				
			}
			
			else if(mx >= game.width/2 + 50  && mx <= game.width/2 +170) {
				if(my >= 700 && my <= 800) {
					//System.out.println("HIT");
					//game.initGame();
					State.setState(game.getState(5));
				}
				
			}
		}
		else if(game.stateNumber == 9) {
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
		else if(game.stateNumber == 10) {
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
		else if(game.stateNumber == 4) {
			int mx = e.getX();
			int my = e.getY();
			
			if(mx >= 0 && mx <=90) {
				if(my >= 700 && my <= 800) {
					//System.out.println("HIT");
					getlight = true;
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
