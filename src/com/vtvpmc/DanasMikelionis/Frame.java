package com.vtvpmc.DanasMikelionis;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.vtvpmc.DanasMikelionis.buttons.AbstractButton;

public class Frame {
	private JFrame frameObject;
	private JLabel label = new JLabel("0");
	
	public Frame() {
		this.frameObject = new JFrame();
		this.frameObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frameObject.setVisible(true);
		this.frameObject.setSize(400, 400);
		
		
	}
	
	public Frame(String title) {
		this();
		this.frameObject.setTitle(title);
	}
	
	public void changeLabel(String text) {
		if (this.label.getText().equals("0")) {
			label.setText(text);
		} else {
			label.setText(label.getText() + text);
		}
		
	}
	
	public void addButtons(AbstractButton[] buttons) {
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		label.setBounds(40, 40, 320, 70);
		panel.add(label);
		
		for (int i = 0; i < buttons.length; i++) {
			panel.add(buttons[i].getButton());
		}
		
		
		frameObject.getContentPane().add(panel);
	}
}
