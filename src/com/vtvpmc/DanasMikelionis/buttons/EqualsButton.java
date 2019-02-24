package com.vtvpmc.DanasMikelionis.buttons;

import com.vtvpmc.DanasMikelionis.Action;
import com.vtvpmc.DanasMikelionis.Frame;

public class EqualsButton extends AbstractButton {

	public EqualsButton(int x, int y, int width, int height, Frame frame) {
		super("=", x, y, width, height, frame);
	}

	@Override
	protected void doAction(Frame frame) {
		Action.doActionEquals(frame);
	}
	
}
