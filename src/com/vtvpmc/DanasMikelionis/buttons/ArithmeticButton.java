package com.vtvpmc.DanasMikelionis.buttons;

import com.vtvpmc.DanasMikelionis.Action;
import com.vtvpmc.DanasMikelionis.Frame;

public class ArithmeticButton extends AbstractButton {

	public ArithmeticButton(String whatButton, int x, int y, int width, int height, Frame frame) {
		super(whatButton, x, y, width, height, frame);
	}

	@Override
	protected void doAction(Frame frame) {
		Action.doActionArithmetic(frame, super.getWhatButton());
	}
	
}
