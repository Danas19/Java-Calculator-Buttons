package com.vtvpmc.DanasMikelionis.buttons;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.vtvpmc.DanasMikelionis.Frame;

public class Button {
	private JButton button;
	private String whatButton;
	
	public Button(String whatButton, int x, int y, int width,
			int height, Frame frame, ActionListener actionListener) {
		this.whatButton = whatButton;
		this.button = new JButton(whatButton);
		this.button.setBounds(x, y, width, height);
		this.button.addActionListener(actionListener);
	}
	
	public String getWhatButton() {
		return this.whatButton;
	}
	
	public JButton getButton() {
		return this.button;
	}
}
