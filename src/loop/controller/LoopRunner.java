package loop.controller;

/**
 * Starts the Loop project
 * @author Kiani Ellingson
 * @version 1.0 11/5/13
 */

public class LoopRunner
{
	/**
	 * Starts application
	 * @param args - GUI only
	 */
	public static void main(String[] args)
	{
		LoopController appController = new LoopController();
		appController.start();
	}
	
}
