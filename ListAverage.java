//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ListAverage
{
	public static double go( List<Integer> ray)
	{
		Collections.sort(ray);
      double i = ray.get(0)+ray.get(ray.size()-1);
		return (i / 2);
	}
}