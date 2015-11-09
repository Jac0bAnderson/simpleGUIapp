package gui.view;

import javax.swing.JFrame;
import gui.controller.controller; //controller.java import statement

/**
 * 
 * @author jand6944
 *@version 0.2 november 9, 2015
 */

//extends only lets you "extend" one level. i.e reptiles to animals, but not reptiles to life.
public class GUIFrame extends JFrame
{
	private GUIPanel basePanel;
private controller baseController;
// import your controller
public GUIFrame(controller baseController)// use the parameter "baseController".
{
	this.baseController = baseController;//baseController used.
	basePanel = new GUIPanel(baseController);
	setupFrame(); //YOU MUST HAVE "setupFrame" OR THE WINDOW WILL NOT SHOW
}

//sets up the frame
private void setupFrame()
{
	this.setContentPane(basePanel);//must be the first line of setupFrame - installs the panel in the frame.
	this.setSize(400,400);//sets the size
	this.setVisible(true);//sets the visibility 
    this.setResizable(false);//makes it so it cannot be resized. it's true by default.
    
}


}
