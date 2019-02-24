package com.vtvpmc.DanasMikelionis;

public class Action {
	private static String lastAction;

	public static void doActionEquals(Frame frame) {
			String answer = frame.getCalculationLabelText();
			int indexOfSign = indexOf(frame.getCalculationLabelText());
			if (indexOfSign != -1) {
				double number1 = Double.valueOf(frame.getCalculationLabelText()
						.substring(0, indexOfSign - 1));
				double number2;
				
				if (indexOfSign != answer.length() - 2) {
					number2 = Double.valueOf(answer
							.substring(indexOfSign + 2, answer.length()));
					answer = getArithmeticAnswer(number1, number2,
							answer.charAt(indexOfSign));
					
				} else {
					answer = getArithmeticAnswer(number1, number1,
							answer.charAt(indexOfSign));
				}
				
				frame.setCaluculationLabelText(answer);
			}
			
	}
	
	private static String getArithmeticAnswer(double number1, double number2,
			char sign) {
		if (sign == '+') {
			return String.valueOf(number1 + number2);
		} else if (sign == '-') {
			return String.valueOf(number1 - number2);
		} else if (sign == 'X') {
			return String.valueOf(number1 * number2);
		} else {
			//if (answer.charAt(indexOfSign) == ':')
			return String.valueOf(number1 / number2);
		}
	}
	
	public static void doActionButton0(Frame frame) {
		if (!frame.getCalculationLabelText().equals("0")) {
			frame.setCaluculationLabelText(frame
					.getCalculationLabelText() + "0");
		}
	}
	
	public static void doActionButton123456789(Frame frame, String whatButton) {
		if (frame.getCalculationLabelText().equals("0")) {
			frame.setCaluculationLabelText(whatButton);
		} else {
			frame.setCaluculationLabelText(frame
				.getCalculationLabelText() + whatButton);
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
