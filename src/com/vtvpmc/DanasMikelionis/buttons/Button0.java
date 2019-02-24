package com.vtvpmc.DanasMikelionis.buttons;

import com.vtvpmc.DanasMikelionis.Frame;

public class Button0 extends AbstractButton {

	public Button0(int x, int y, int width, int height, Frame frame) {
		super("0", x, y, width, height, frame);
	}

	@Override
	public void doAction(Frame frame) {
		if (!frame.getCalculationLabelText().equals("0")) {
			frame.setCaluculationLabelText(frame
					.getCalculationLabelText() + "0");
		}
	}
	
}
