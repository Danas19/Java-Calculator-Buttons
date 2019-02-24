package com.vtvpmc.DanasMikelionis.buttons;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import com.vtvpmc.DanasMikelionis.Action;
import com.vtvpmc.DanasMikelionis.Frame;
import com.vtvpmc.DanasMikelionis.TypeOfButton;

public abstract class AbstractButton {
	private JButton button;
	private String whatButton;
	
	public AbstractButton(String whatButton, int x, int y, int width,
			int height, Frame frame) {
		this.whatButton = whatButton;
		this.button = new JButton(whatButton);
		this.button.setBounds(x, y, width, height);
		this.button.addActionListener((ActionEvent e) ->
			this.doAction(frame));
	}
	
	protected abstract void doAction(Frame frame);
	
	public String getWhatButton() {
		return this.whatButton;
	}
	
	public JButton getButton() {
		return this.button;
	}
}
