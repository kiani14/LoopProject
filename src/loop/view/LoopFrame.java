package loop.view;

import javax.swing.JFrame;

import loop.controller.LoopController;
/**
 * GUI framework for Loop project.
 * @author kell7444
 * @version 1.0 11/5/13 Basic setup of class
 */
public class LoopFrame extends JFrame
{
	private LoopController baseController;
	private LoopPanel basePanel;
	
	/**
	 * Creates a JFrame based window for the loop project. 
	 * @param baseController A link to the controller for the MVC paradigm
	 */
	public LoopFrame (LoopController baseController)
	{
		this.baseController = baseController;
		this.basePanel = new LoopPanel(baseController);
		
		setupFrame();
	}
	
	/**
	 * Sets up the frame for the GUI. 
	 */
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400,400);
		this.setVisible(true);
	}
	

}
