package gui.view;

import javax.swing.JPanel;
import gui.controller.controller;

/**
 * 
 * @author jand6944
 *@version 0.2 november 9, 2015
 */
public class GUIPanel extends JPanel
{
   private controller baseController;

public GUIPanel(controller baseController)  // baseController is a parameter; you have to use your parameters
{
	this.baseController = baseController;   // baseController is used.
}



}
