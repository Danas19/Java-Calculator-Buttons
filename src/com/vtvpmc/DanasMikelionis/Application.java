package com.vtvpmc.DanasMikelionis;

import com.vtvpmc.DanasMikelionis.buttons.AbstractButton;
import com.vtvpmc.DanasMikelionis.buttons.ArithmeticButton;
import com.vtvpmc.DanasMikelionis.buttons.Button0;
import com.vtvpmc.DanasMikelionis.buttons.Button123456789;
import com.vtvpmc.DanasMikelionis.buttons.EqualsButton;

public class Application {
	public static void main(String[] args) {
		Frame frame = new Frame();
		
		AbstractButton[] buttons = new AbstractButton[12];
		
		for (int i = 2; i >= 0; i--) {
			for (int j = 1; j <= 3; j++) {
				buttons[i * 3 + j] = new Button123456789(String.valueOf(i * 3 + j), (50 + j * 50),
								(280 - i * 50), 50, 50, frame);
			}
		}
		
		buttons[0] = new Button0(150, 330, 50, 50, frame);
		buttons[10] = new ArithmeticButton("+", 300, 200, 50, 50, frame);
		buttons[11] = new EqualsButton(350, 200, 50, 50, frame);
		
		frame.addButtons(buttons);
	}
}
