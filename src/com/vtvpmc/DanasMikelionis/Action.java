package com.vtvpmc.DanasMikelionis;

public class Action {
	public static void doAction(Frame frame, String whatButton,
			TypeOfButton typeOfButton) {
		if (typeOfButton == TypeOfButton.NUMBER) {
			if (frame.getCalculationLabelText().equals("0")) {
				frame.setCalculationLabelText(whatButton);
			} else {
				frame.setCalculationLabelText((frame
					.getCalculationLabelText() + whatButton));
			}
		}
		
	}
}
