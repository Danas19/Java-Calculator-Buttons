package com.vtvpmc.DanasMikelionis;

import javax.swing.JButton;

import com.vtvpmc.DanasMikelionis.buttons.AbstractButton;
import com.vtvpmc.DanasMikelionis.buttons.Button0;

public class Application {
	public static void main(String[] args) {
		Frame frame = new Frame();
		
		AbstractButton[] buttons = new AbstractButton[20];
		buttons[0] = (AbstractButton)new Button0();
	}
}
