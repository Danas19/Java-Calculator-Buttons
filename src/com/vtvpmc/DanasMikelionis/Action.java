package com.vtvpmc.DanasMikelionis;

public class Action {
	public static void doActionEquals(Frame frame) {
			String answer = frame.getCalculationLabel().getText();
			if (frame.getCalculationLabel().getText().matches(".{0,}[+-X:].{0,}")) {
				int indexOfSign = indexOf(frame.getCalculationLabel().getText());
				String number1 = frame.getCalculationLabel()
						.getText().substring(0, indexOfSign - 1);
				String number2;
				
				switch (answer.charAt(indexOfSign)) {
				case '+':
					if (indexOfSign != answer.length() - 2) {
						number2 = answer
								.substring(indexOfSign + 2, answer.length());
						System.out.println(number2);
						answer = String.valueOf(Double.valueOf(number1)
								+ Double.valueOf(number2));
					} else {
						answer = String.valueOf(Double.valueOf(number1) +
								Double.valueOf(number1));
					}
					break;
				}
				
			}
			frame.getCalculationLabel().setText(answer);
	}
	
	public static void doActionArithmetic(Frame frame, String whatButton) {
		if (frame.getCalculationLabel().getText().matches(".{0,}[X:+-].{0,}")) {
			doActionEquals(frame);
		}
		frame.getCalculationLabel().setText(frame.getCalculationLabel()
				.getText() + " " + whatButton + " ");
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
