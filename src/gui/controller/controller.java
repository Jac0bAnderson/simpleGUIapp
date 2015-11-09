package gui.controller;

import gui.view.GUIFrame;

/**
 * simple GUI controller
 * @author jand6944
 *@version 0.2 november 9, 2015
 */

public class controller 
{
	/**
	 * refernece to the GUIFrame obct for internal use.
	 */
	private GUIFrame baseFrame;

	/**
	 * Creates a GU controller and initializes the GUIFrame.
	 */
	public controller()
	{
		baseFrame = new GUIFrame(this);
	}
	
	public void start()
	{
		
	}

}
