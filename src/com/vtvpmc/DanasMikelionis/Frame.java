package com.vtvpmc.DanasMikelionis;

import javax.swing.JButton;
import javax.swing.JFrame;

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
	
	public void addButtons(JButton[] buttons) {
		
	}
}
