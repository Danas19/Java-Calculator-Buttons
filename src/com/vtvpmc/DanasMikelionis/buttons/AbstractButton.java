package com.vtvpmc.DanasMikelionis.buttons;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public abstract class AbstractButton {
	private JButton button;
	String whatButton;
	
	public AbstractButton(String whatButton, int x, int y, int width,
			int height, ActionListener actionListener) {
		this.whatButton = whatButton;
		this.button = new JButton(whatButton);
		this.button.addActionListener(actionListener);
		this.button.setBounds(x, y, width, height);
	}
	
	public String whatButton() {
		return this.whatButton;
	}
	
	public JButton getButton() {
		return this.button;
	}
}
