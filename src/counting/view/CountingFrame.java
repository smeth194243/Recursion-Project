package counting.view;

import javax.swing.JFrame;
import java.awt.Dimension;
import counting.controller.CountingController;

public class CountingFrame extends JFrame
{
	private CountingController baseController;
	private CountingPanel appPanel;
	
	public CountingFrame(CountingController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new CountingPanel(baseController);
		this.setupFrame();
	}
	
	public void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Words");
		this.setSize(new Dimension(600,400));
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
