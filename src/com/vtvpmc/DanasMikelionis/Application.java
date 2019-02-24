package com.vtvpmc.DanasMikelionis;

import java.awt.event.ActionEvent;

import com.vtvpmc.DanasMikelionis.buttons.Button;

public class Application {
	public static void main(String[] args) {
		Frame frame = new Frame();
		
		Button[] buttons = new Button[15];
		
		for (int i = 2; i >= 0; i--) {
			for (int j = 1; j <= 3; j++) {
				createButton(frame, buttons, i, j);
			}
		}
		
		buttons[0] = new Button("0", 150, 330, 50, 50, frame, (ActionEvent e) ->
				Action.doActionButton0(frame));
		
		buttons[10] = new Button("=", 300, 200, 50, 50, frame, (ActionEvent e) ->
		Action.doActionEquals(frame));
		
		buttons[11] = new Button("+", 350, 200, 50, 50, frame, ((ActionEvent e) ->
				Action.doActionArithmetic(frame, "+")));
		buttons[12] = new Button("-", 400, 200, 50, 50, frame, ((ActionEvent e) ->
		Action.doActionArithmetic(frame, "-")));
		buttons[13] = new Button("X", 450, 200, 50, 50, frame, ((ActionEvent e) ->
		Action.doActionArithmetic(frame, "X")));
		buttons[14] = new Button(":", 500, 200, 50, 50, frame, ((ActionEvent e) ->
		Action.doActionArithmetic(frame, ":")));
		
		frame.addButtons(buttons);
	}
	
	private static void createButton(Frame frame, Button[] buttons, int i, int j) {
		buttons[i * 3 + j] = new Button(String.valueOf(i * 3 + j), (50 + j * 50),
				(280 - i * 50), 50, 50, frame, (ActionEvent e) -> 
					Action.doActionButton123456789(frame,
							String.valueOf(i * 3 + j)));
	}
}
