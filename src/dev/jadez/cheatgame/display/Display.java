package dev.jadez.cheatgame.display;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;



/** Display the application
 *  Basically NO NEED TO MODIFY
 *  */
public class Display {
	
	private JFrame frame;
	private Canvas canvas;
	public JProgressBar jpb;  
	private String title;
	private int width,height;
	
	public Display(String title,int width,int height) {
		this.title = title;
		this.width = width;
		this.height = height;
		
		createDisplay();
	}
	
	private void createDisplay() {
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width,height));;
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
		canvas.setFocusable(false);
		
//        JPanel stp = new JPanel();  
//        jpb = new JProgressBar();  
//        jpb.setMinimum(0);  
//        jpb.setMaximum(100);  
//        stp.add(jpb);  
//        jpb.setValue(50);
//        jpb.setStringPainted(true);
//        frame.setContentPane(stp);
//       
//        frame.add(stp);  
		frame.add(canvas);
		frame.pack();
	}
	
	public Canvas getCanvas() {
		return canvas;
	}
	
	public JFrame getFrame() {
		return frame;
	}
}

