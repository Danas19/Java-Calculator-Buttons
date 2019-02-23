package com.vtvpmc.DanasMikelionis;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.vtvpmc.DanasMikelionis.buttons.AbstractButton;

public class Frame {
	JFrame frameObject;
	public Frame() {
		this.frameObject = new JFrame();
		this.frameObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frameObject.setVisible(true);
		this.frameObject.setSize(400, 400);
		
		
	}
	
	public Frame(String title) {
		this();
		this.frameObject.setTitle(title);
	}
	
	public void addButtons(AbstractButton[] buttons) {
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.add(buttons[0].getButton());
		frameObject.getContentPane().add(panel);
	}
}
