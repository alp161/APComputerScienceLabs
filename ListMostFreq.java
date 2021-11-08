//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.*;


public class ListMostFreq
{
	//method go will return the value 
	//that appears the most
	//if several numbers all appear
	//the same number of times
	//return the first number found
	public static int count(List<Integer> ray, int value)
	{
		int count = 0;
		for (int num : ray)
		{
			if (num == value)
			{
				count++;
			}
		}
		return count;
	}
	
	public static int go( List<Integer> ray )
	{
		int high = Integer.MAX_VALUE;
		for (int num : ray)
		{
			if (count(ray,num) > count(ray,high))
			{
				high = num;
			}
		}
		return high;
	}
}