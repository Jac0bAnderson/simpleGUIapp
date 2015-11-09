package gui.view;

import javax.swing.JFrame;
import gui.controller.controller; //controller.java import statement

/**
 * 
 * @author jand6944
 *@version 0.x november 9, 2015
 */

//extends only lets you "extend" one level. i.e reptiles to animals, but not reptiles to life.
public class GUIFrame extends JFrame
{
private controller baseController;
// import your controller
public GUIFrame(controller baseController)// use the parameter "baseController".
{
	this.baseController = baseController;//baseController used.
	setupFrame();
}

//sets up the frame
private void setupFrame()
{
	this.setSize(400,400);//sets the size
	this.setVisible(true);//sets the visibility 
}


}
