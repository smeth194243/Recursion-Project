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
}
