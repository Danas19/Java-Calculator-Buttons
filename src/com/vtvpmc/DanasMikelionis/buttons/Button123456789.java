package com.vtvpmc.DanasMikelionis.buttons;

import com.vtvpmc.DanasMikelionis.Frame;

public class Button123456789 extends AbstractButton {

	public Button123456789(String whatButton, int x, int y, int width, int height, Frame frame) {
		super(whatButton, x, y, width, height, frame);
	}

	@Override
	protected void doAction(Frame frame) {
		if (frame.getCalculationLabel().getText().equals("0")) {
			frame.getCalculationLabel().setText(super.getWhatButton());
		} else {
			frame.getCalculationLabel().setText((frame
				.getCalculationLabel().getText() + super.getWhatButton()));
		}
	}
	
}
