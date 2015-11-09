package gui.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;//for layout
// import javax.swing.*; imports the whole javax lib

import gui.controller.controller;
import javax.swing.SwingConstants;// controller.java import

/**
 * 
 * @author jand6944
 *@version 0.2 november 9, 2015 added a button, textfield, and helper methods
 */
public class GUIPanel extends JPanel
{
   private controller baseController;
   private JButton firstButton;//you need to import "javax.swing.JButton
   private JTextField firstTextField;//you need to import javax.swing.JTextField
   private SpringLayout baseLayout;

public GUIPanel(controller baseController)  // baseController is a parameter; you have to use your parameters
{
	this.baseController = baseController;   // baseController is used.
	
	firstButton = new JButton("dont click plz");
	firstButton.setVerticalAlignment(SwingConstants.TOP);
	firstTextField = new JTextField("type stuff b0ss");
	
	setupPanel();       //sets up panel
	setupLayout();     //         Layout
	setupListeners(); //      and Listeners
}
/**
 * helper method to load all GUI components into the panel.
 */
private void setupPanel()
{
	this.setLayout(baseLayout);
	this.add(firstButton);
	this.add(firstTextField);
}

private void setupLayout()//garbage for desgin tab code
{
	
}

private void setupListeners()
{
	
}

}
