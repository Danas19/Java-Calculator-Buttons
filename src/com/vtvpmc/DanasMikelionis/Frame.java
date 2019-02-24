package com.vtvpmc.DanasMikelionis;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.vtvpmc.DanasMikelionis.buttons.Button;

public class Frame {
	private JFrame frameObject;
	private String labelCalculationHTMLStart = "<html><h1 style=\"background-color"
			+ ":white;\">";
	private String labelCalculationHTMLEnd = "</h1></html>";
	private JLabel labelCalculation = new JLabel(labelCalculationHTMLStart +
			"0" + labelCalculationHTMLEnd);
	
	public Frame() {
		this.frameObject = new JFrame();
		this.frameObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frameObject.setVisible(true);
		this.frameObject.setSize(700, 500);
		
		
	}
	
	public Frame(String title) {
		this();
		this.frameObject.setTitle(title);
	}
	
//	public JLabel getCalculationLabel() {
//		return this.labelCalculation;
//	}
	
	public String getCalculationLabelText() {
		return this.labelCalculation.getText()
				.replace(labelCalculationHTMLStart, "")
					.replace(labelCalculationHTMLEnd, "");
	}
	
	public void setCaluculationLabelText(String text) {
		this.labelCalculation.setText(labelCalculationHTMLStart + text
				+ labelCalculationHTMLEnd);
	}
	
	public void addButtons(Button[] buttons) {
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		this.labelCalculation.setBounds(40, 40, 320, 90);
		panel.add(this.labelCalculation);
		
		for (int i = 0; i < buttons.length; i++) {
			panel.add(buttons[i].getButton());
		}
		
		
		frameObject.getContentPane().add(panel);
	}
}
