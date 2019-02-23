package com.vtvpmc.DanasMikelionis.buttons;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import com.vtvpmc.DanasMikelionis.Action;
import com.vtvpmc.DanasMikelionis.Frame;
import com.vtvpmc.DanasMikelionis.TypeOfButton;

public class Button {
	private JButton button;
	String whatButton;
	
	public Button(String whatButton, int x, int y, int width,
			int height, Frame frame, TypeOfButton typeOfButton) {
		this.whatButton = whatButton;
		this.button = new JButton(whatButton);
		this.button.setBounds(x, y, width, height);
		this.button.addActionListener((ActionEvent e) ->
			Action.doAction(frame, whatButton, typeOfButton));
	}
	
	public String whatButton() {
		return this.whatButton;
	}
	
	public JButton getButton() {
		return this.button;
	}
}
