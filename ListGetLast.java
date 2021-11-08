//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListGetLast
{
	//method go will return a list
	//containing the all of the values greater 
	//than the last value in the list
	public static List<Integer> go(  List<Integer> ray )
	{
    int last = ray.get(ray.size() - 1);
    List<Integer> number = new ArrayList<Integer>();
    for (int num : ray)
		{
			if (num > last)
			{
				number.add(num);
			}
		}
		
		return number;
	}
}