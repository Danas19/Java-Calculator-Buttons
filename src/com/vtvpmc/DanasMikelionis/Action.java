package com.vtvpmc.DanasMikelionis;

public class Action {
	private static String lastAction;

	public static void doActionEquals(Frame frame) {
			String answer = frame.getCalculationLabelText();
			if (indexOf(frame.getCalculationLabelText()) != -1) {
				int indexOfSign = indexOf(frame.getCalculationLabelText());
				double number1 = Double.valueOf(frame.getCalculationLabelText()
						.substring(0, indexOfSign - 1));
				double number2;
				
				
				if (indexOfSign != answer.length() - 2) {
					number2 = Double.valueOf(answer
							.substring(indexOfSign + 2, answer.length()));
					if (answer.charAt(indexOfSign) == '+') {
						answer = String.valueOf(number1 + number2);
					} else if (answer.charAt(indexOfSign) == '-') {
						answer = String.valueOf(number1 - number2);
					} else if (answer.charAt(indexOfSign) == 'X') {
						answer = String.valueOf(number1 * number2);
					} else {
						//if (answer.charAt(indexOfSign) == ':')
						answer = String.valueOf(number1 / number2);
					}
					
				} else {
					answer = String.valueOf(number1 + number1);
				}
				
				
				frame.setCaluculationLabelText(answer);
			}
			
	}
	
	public static void doActionArithmetic(Frame frame, String whatButton) {
		if (indexOf(frame.getCalculationLabelText()) != -1) {
			doActionEquals(frame);
		}
		frame.setCaluculationLabelText(frame.getCalculationLabelText()
				+ " " + whatButton + " ");
	}
	
	private static int indexOf(String text) {
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '+' || text.charAt(i) == '-'
					|| text.charAt(i) == 'X' || text.charAt(i) == ':') {
				return i;
			}
		}
		
		return -1;
	}
}
