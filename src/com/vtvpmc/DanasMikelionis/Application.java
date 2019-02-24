package com.vtvpmc.DanasMikelionis;

import com.vtvpmc.DanasMikelionis.buttons.AbstractButton;
import com.vtvpmc.DanasMikelionis.buttons.Button0;
import com.vtvpmc.DanasMikelionis.buttons.Button123456789;

public class Application {
	public static void main(String[] args) {
		Frame frame = new Frame();
		
		AbstractButton[] buttons = new AbstractButton[10];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j <= 3; j++) {
				buttons[i * 3 + j] = new Button123456789(String.valueOf(i * 3 + j), (50 + j * 50),
								(180 + i * 50), 50, 50, frame);
			}
		}
		
		buttons[0] = new Button0(10, 10, 50, 50, frame);
		
		frame.addButtons(buttons);
	}
}
