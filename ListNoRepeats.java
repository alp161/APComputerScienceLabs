//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListNoRepeats
{
	//method go will return true if there
	//are no numbers that repeat
	//false if any numbers repeat
	public static boolean go( List<Integer> ray )
	{
		List<Integer> norepeat = new ArrayList<Integer>();
		for (int num : ray)
		{
			if (!norepeat.contains(num))
			{
				norepeat.add(num);
			}
		}
		
		return norepeat.size()==ray.size();
	}
}