package com.vtvpmc.DanasMikelionis;

import com.vtvpmc.DanasMikelionis.buttons.Button;

public class Application {
	public static void main(String[] args) {
		Frame frame = new Frame();
		
		Button[] buttons = new Button[9];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				buttons[i * 3 + j] = new Button(String.valueOf(i * 3 + j), (50 + j * 50),
								(180 + i * 50), 50, 50, frame, TypeOfButton.NUMBER);
			}
		}
		
		
		frame.addButtons(buttons);
	}
}
