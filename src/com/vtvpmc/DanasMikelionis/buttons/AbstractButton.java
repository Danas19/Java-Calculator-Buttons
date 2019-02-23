package com.vtvpmc.DanasMikelionis.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.vtvpmc.DanasMikelionis.Frame;

public abstract class AbstractButton {
	private JButton button;
	String whatButton;
	
	public AbstractButton(String whatButton, int x, int y, int width,
			int height) {
		this.whatButton = whatButton;
		this.button = new JButton(whatButton);
		this.button.setBounds(x, y, width, height);
	}
	
	public void setAction(Frame frame) {
		this.button.addActionListener((ActionEvent e) -> this.changeString(frame));
	}
	
	public abstract void changeString(Frame frame);
	
	public String whatButton() {
		return this.whatButton;
	}
	
	public JButton getButton() {
		return this.button;
	}
}
