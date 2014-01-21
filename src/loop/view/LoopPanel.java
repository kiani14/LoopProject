package loop.view;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import loop.controller.LoopController;

/**
 * Startup and setup of the panel. 
 * @author kell7444
 * @version 1.0 11/5/13
 */
public class LoopPanel extends JPanel 
{
	private JButton submitButton;
	private JScrollPane textPane;
	private JTextArea loopArea;
	private SpringLayout baseLayout;
	
	private LoopController baseController;
	
	public LoopPanel (LoopController baseController)
	{
		this.baseController = baseController;
		
		submitButton = new JButton("Click to start");
		baseLayout = new SpringLayout();
		loopArea = new JTextArea(20,20);
		textPane = new JScrollPane(loopArea);
		baseLayout.putConstraint(SpringLayout.WEST, textPane, 10, SpringLayout.WEST, this);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	/**
	 * Adds the components to the panel via the LayoutManager and sets the color and other basic info. 
	 */
	private void setupPanel()
	{
		//this will be the same for every setupPanel layout
		this.setLayout(baseLayout);
		this.add(submitButton);
		this.setBackground(new Color(150, 50, 120));
		this.add(textPane);
		loopArea.setEditable(false);
		loopArea.setLineWrap(true);
		loopArea.setWrapStyleWord(true);	
	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, submitButton, -116, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, submitButton, -66, SpringLayout.EAST, this);
	}
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				loopArea.append(baseController.getLoopResults());
			}
		});
	}
}

