package com.vtvpmc.DanasMikelionis;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.vtvpmc.DanasMikelionis.buttons.Button;

public class Frame {
	private JFrame frameObject;
	private JLabel labelCalculation = new JLabel("0");
	
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
	
	public void setCalculationLabelText(String text) {
		this.labelCalculation.setText(text);
	}
	
	public String getCalculationLabelText() {
		return this.labelCalculation.getText();
	}
	
	public void addButtons(Button[] buttons) {
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		this.labelCalculation.setBounds(40, 40, 320, 70);
		panel.add(this.labelCalculation);
		
		for (int i = 0; i < buttons.length; i++) {
			panel.add(buttons[i].getButton());
		}
		
		
		frameObject.getContentPane().add(panel);
	}
}
