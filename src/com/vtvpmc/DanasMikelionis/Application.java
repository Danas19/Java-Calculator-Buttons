package com.vtvpmc.DanasMikelionis;

import com.vtvpmc.DanasMikelionis.buttons.AbstractButton;
import com.vtvpmc.DanasMikelionis.buttons.NumberButton;

public class Application {
	public static void main(String[] args) {
		System.out.println("Aaa");
		Frame frame = new Frame();
		
		AbstractButton[] buttons = new AbstractButton[9];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				buttons[i * 3 + j] = (AbstractButton)new 
						NumberButton(String.valueOf(i * 3 + j), (50 + j * 50),
								(180 + i * 50), 50, 50);
				buttons[i * 3 + j].setAction(frame);
			}
		}
		
		
		frame.addButtons(buttons);
	}
}
