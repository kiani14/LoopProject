package loop.controller;

import loop.model.Looper;
import loop.view.LoopFrame;

/**
 * Controller for the Loop Project
 * @author kell7444
 * @version 1.0 11/5/13 Basic Setup
 */
public class LoopController
{
	private Looper myLooper;
	private LoopFrame appFrame; 
	private int clickCount;
	
	public LoopController()
	{
		myLooper = new Looper();
		clickCount = 0;
	}
	
	public void start()
	{
		appFrame = new LoopFrame(this);
	}
	
	public Looper getMyLooper()
	{
		return myLooper;
	}
	public String getLoopResults()
	{
		String results = "";
		results = loopOverList();
		return results; 
	}
	
	private String getListResults(int position)
	{
		String currentResult = "";
		
//		ArrayList<String> tempList = myLooper.getGraveNameList(); 
//		currentResult = tempList.get(position);
		if(position < myLooper.getGraveNameList().size())
		{
		currentResult = myLooper.getGraveNameList().get(position);
		}
		return currentResult; 
	}

	private String loopOverList()
	{
		String results = "";
		
		for(int position = 0; position < myLooper.getGraveNameList().size(); position++)
		{
			results += myLooper.getGraveNameList().get(position) + "\n";
		}
		
		return results; 
	}
	
	private String loopBackwardOverList()
	{
		String results = "";
		for(int position = myLooper.getGraveNameList().size()-1; position >= 0; position--)
		{
			results += myLooper.getGraveNameList().get(position) + "\n";
		}
		return  results
	}
}
