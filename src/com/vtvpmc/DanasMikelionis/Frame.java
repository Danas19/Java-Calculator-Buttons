package com.vtvpmc.DanasMikelionis;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.vtvpmc.DanasMikelionis.buttons.AbstractButton;
import com.vtvpmc.DanasMikelionis.buttons.Button0;

public class Frame {
	JFrame frameObject;
	public Frame() {
		this.frameObject = new JFrame();
		this.frameObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frameObject.setVisible(true);
		this.frameObject.setSize(400, 400);
		
		AbstractButton[] abstractButtons = new AbstractButton[20];
		
		abstractButtons[0] = (AbstractButton)new Button0();
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.add(abstractButtons[0].getButton());
		frameObject.getContentPane().add(panel);
		//frameObject.add(panel);
	}
	
	public Frame(String title) {
		this();
		this.frameObject.setTitle(title);
	}
	
	public void addButtons(JButton[] buttons) {
		
	}
}
