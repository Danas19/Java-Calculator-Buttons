package com.vtvpmc.DanasMikelionis.buttons;

import com.vtvpmc.DanasMikelionis.Frame;

public class NumberButton extends AbstractButton {
	public NumberButton(String whatButton, int x, int y, int width,
			int height) {
		super(whatButton, x, y, width, height);
	}

	@Override
	public void changeString(Frame frame) {
		frame.changeLabel(whatButton);
	}
	
	
}
