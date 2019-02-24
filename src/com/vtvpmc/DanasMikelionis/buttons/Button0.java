package com.vtvpmc.DanasMikelionis.buttons;

import com.vtvpmc.DanasMikelionis.Frame;

public class Button0 extends AbstractButton {

	public Button0(int x, int y, int width, int height, Frame frame) {
		super("0", x, y, width, height, frame);
	}

	@Override
	public void doAction(Frame frame) {
		if (!frame.getCalculationLabel().getText().equals("0")) {
			frame.getCalculationLabel().setText(frame
					.getCalculationLabel().getText() + "0");
		}
	}
	
}
