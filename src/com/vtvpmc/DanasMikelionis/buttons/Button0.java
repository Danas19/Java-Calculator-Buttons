package com.vtvpmc.DanasMikelionis.buttons;

import java.awt.event.ActionEvent;

import com.vtvpmc.DanasMikelionis.Action;

public class Button0 extends AbstractButton {

	public Button0() {
		super("0", 50, 230, 50, 50, (ActionEvent e) ->
			Action.doAction("0"));
	}
	
}
