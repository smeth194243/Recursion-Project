package counting.view;

import javax.swing.*;
import java.awt.Color;
import counting.controller.CountingController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CountingPanel extends JPanel
{
	private CountingController baseController;
	private SpringLayout baseLayout;
	private JTextArea displayArea;
	private JTextField inputField;
	private JButton fibButton;
	private JButton factButton;
	
	public CountingPanel(CountingController baseController)
	{
		super();
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		displayArea = new JTextArea(5,25);
		
		inputField = new JTextField(25);
		
		fibButton = new JButton("Fib");
		
		factButton = new JButton("fact");
		
	
		setupDisplayArea();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupDisplayArea()
	{
		displayArea.setEditable(false);
		displayArea.setEnabled(false);
		displayArea.setLineWrap(true);
		displayArea.setWrapStyleWord(true);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GREEN);
		this.add(displayArea);
		this.add(fibButton);
		this.add(factButton);
		this.add(inputField);
		displayArea.setEditable(false);
		displayArea.setWrapStyleWord(true);
		displayArea.setLineWrap(true);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, displayArea, 32, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, 137, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, displayArea, 0, SpringLayout.WEST, inputField);
		baseLayout.putConstraint(SpringLayout.SOUTH, displayArea, -20, SpringLayout.NORTH, inputField);
		baseLayout.putConstraint(SpringLayout.EAST, inputField, -49, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, fibButton, -49, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, displayArea, 0, SpringLayout.EAST, fibButton);
		baseLayout.putConstraint(SpringLayout.NORTH, fibButton, 53, SpringLayout.SOUTH, inputField);
		baseLayout.putConstraint(SpringLayout.NORTH, factButton, 0, SpringLayout.NORTH, fibButton);
		baseLayout.putConstraint(SpringLayout.WEST, factButton, 91, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		factButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				displayArea.setText(baseController.transferFactorial(inputField.getText()));
			}
		});
		
		fibButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				displayArea.setText(baseController.transferFibonacci(inputField.getText()));
			}
		});
	}
}
