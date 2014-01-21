package loop.model;

import java.util.ArrayList;

public class Looper

{
	
	private ArrayList<String> graveNameList;
	public Looper()
	{
		graveNameList = new ArrayList<>();
		fillTheGraveNameList();
	}
	
	private void fillTheGraveNameList()
	{
		graveNameList.add("Linda Kay Miller");
		graveNameList.add("William Andrew Johnson");
		graveNameList.add("Marilyn Joyce Johnson");
		graveNameList.add("Albert Miller");
		graveNameList.add("Marvin L. Ray");
		graveNameList.add("Florence A. Ray");
	}	
	
	
	public String loopTestOne()
	{
		String loopResult = "";
		int numberOfTimes = 0;

		for (int counter = 5; counter <= 17; counter += 2)
		{
			loopResult += counter + ", ";
			numberOfTimes++;
		}
		loopResult += "was the last time. ";
		loopResult += "\nThe loop executed " + numberOfTimes + " times. ";
		return loopResult;
	}

	public String loopTestTwo()
	{
		String loopResult = "";
		int numberOfTimes = 0;
		for (int week = 0; week <12; week++)
		{	
			for(int day = 0; day <4; day ++)
			{
				for(int other = 0; other <4; other++)
				{	
					for(int count = 0; count <7.50; count++)
					{
//						loopResult +="count is " + count + "\n"; 
//						for(int otherCount = 0; otherCount <5; otherCount++)
						{
//							loopResult +="otherCountis " + otherCount + "\n";
							numberOfTimes++;
						}
					}
				}	
			}
		}
		loopResult += "The loop executed " + numberOfTimes + " times...wow!";
		return loopResult;
	}
}
